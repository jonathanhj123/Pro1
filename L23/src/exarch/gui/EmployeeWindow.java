package exarch.gui;

import exarch.model.Employee;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EmployeeWindow extends Stage {

    private Employee employee = null;
    private int hourlyWage = 0;

    String name = "";

    /** Note: Nullable param company. */
    public EmployeeWindow(String name, int hourlyWage) {
        this.employee = employee;
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.name = name;
        this.hourlyWage = hourlyWage;

//        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfHourlyWage = new TextField();
    private final Label lblError = new Label();

//    private CheckBox cbhCompany = new CheckBox();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Name");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 0, 1);
        txfName.setPrefWidth(200);

        Label lblHours = new Label("Hourly Wage");
        pane.add(lblHours, 0, 2);

        pane.add(txfHourlyWage, 0, 3);

        CheckBox chbCompany = new CheckBox("Company");
        pane.add(chbCompany,0,4);


        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 5);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 5);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> this.okAction());

        pane.add(lblError, 0, 6);
        lblError.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    // -------------------------------------------------------------------------

    private void initControls() {
        if (employee != null) {
            txfName.setText(employee.getName());
            txfHourlyWage.setText("" + employee.getWage());
        } else {
            txfName.clear();
            txfHourlyWage.clear();
        }
    }

    // -------------------------------------------------------------------------

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        String name = txfName.getText().trim();
        if (name.length() == 0) {
            lblError.setText("Name is empty");
            return;
        }

        int hours = -1;
        try {
            hours = Integer.parseInt(txfHourlyWage.getText().trim());
        } catch (NumberFormatException ex) {
            // do nothing
        }
        if (hours < 0) {
            lblError.setText("Hours is not a positive number");
            return;
        }

        this.hide();
    }
}
