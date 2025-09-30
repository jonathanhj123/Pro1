package EX2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PersonInput extends Stage {

    public PersonInput(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private TextField txfName = new TextField();
    private TextField txfTitle = new TextField();

    private Persons actualMovie = null;

    private boolean senior = false;

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblTitle = new Label("Name:");
        pane.add(lblTitle, 0, 0);

        Label lblName = new Label("Title:");
        pane.add(lblName, 0, 1);

        pane.add(txfName, 1, 0);

        pane.add(txfTitle, 1, 1);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 3, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());

        CheckBox checkBox = new CheckBox();
        checkBox.setText("senior");
        pane.add(checkBox, 1, 2);
        checkBox.setOnAction(event -> {
            if (checkBox.isSelected()) {
                senior = true;
            }
            else
                senior = false;
        });

    }


    // -------------------------------------------------------------------------
    // Button actions

    private void cancelAction() {
        txfTitle.clear();
        txfTitle.requestFocus();
        txfName.clear();
        actualMovie = null;
        PersonInput.this.hide();
    }

    private void okAction() {
        String title = txfTitle.getText().trim();
        String actor = txfName.getText().trim();

        if (title.length() > 0 && actor.length() > 0) {
            actualMovie = new Persons(title, actor, true);
            txfTitle.clear();
            txfName.clear();
            txfTitle.requestFocus();
            PersonInput.this.hide();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Add Person");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type name and title");
            alert.show();
        }
    }

    // -------------------------------------------------------------------------

    public Persons getActualMovie() {
        return actualMovie;
    }

    public void clearActualMovie() {
        actualMovie = null;
    }
}
