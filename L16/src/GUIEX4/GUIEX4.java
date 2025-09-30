package GUIEX4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.Year;

public class GUIEX4 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfInvestment = new TextField();
    private TextField txfYears = new TextField();
    private TextField txfFutureValue = new TextField();
    private TextField txfInterest = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(10));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblInvestmesnt = new Label("Investment:");
        pane.add(lblInvestmesnt, 0, 0);

        Label lblYears = new Label("Years:");
        pane.add(lblYears, 0, 1);

        Label lblInterest = new Label("Interest (%):");
        pane.add(lblInterest, 0, 2);

        Label lblFutureValue = new Label("Future Value:");
        pane.add(lblFutureValue, 0, 4);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfInvestment, 1, 0, 1, 1);
        txfInvestment.setEditable(true);

        pane.add(txfYears, 1, 1, 1, 1);
        txfYears.setEditable(true);
        pane.add(txfInterest, 1, 2, 1, 1);
        txfInterest.setEditable(true);
        pane.add(txfFutureValue, 1, 4, 1, 1);
        txfFutureValue.setEditable(false);

        // add a button to the pane (at col=2, row=1)
        Button btnCalc = new Button("Calculate");
        pane.add(btnCalc, 1, 3);
        GridPane.setMargin(btnCalc, new Insets(10, 10, 0, 10));
        btnCalc.setOnAction(event -> this.CalculateAction());
        btnCalc.setDefaultButton(true);


    }

    public void CalculateAction() {
        String Invest = txfInvestment.getText().trim();
        String Years = txfYears.getText().trim();
        String Interest = txfInterest.getText().trim();
        int Investment = Integer.parseInt(Invest);
        int YearsInt = Integer.parseInt(Years);
        double MonthlyInterest = Integer.parseInt(Interest);
        double FutureValue = Investment * (Math.pow(1 + MonthlyInterest / 100, YearsInt*12));
        int Months = YearsInt * 12;


        txfFutureValue.setText(String.format("%.2f", FutureValue));
    }
}
