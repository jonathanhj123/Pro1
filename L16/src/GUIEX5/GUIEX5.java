package GUIEX5;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIEX5 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfFahrenheit = new TextField();
    private TextField txfCelsius = new TextField();
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
        Label lblFahrenheit = new Label("Fahrenheit:");
        pane.add(lblFahrenheit, 0, 0);

        Label lblCelsius = new Label("Celsius:");
        pane.add(lblCelsius, 0, 1);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfFahrenheit, 1, 0, 1, 1);
        txfFahrenheit.setEditable(true);

        pane.add(txfCelsius, 1, 1, 1, 1);
        txfCelsius.setEditable(true);


        // add a button to the pane (at col=2, row=1)
        Button btnCalc = new Button("Calculate");
        pane.add(btnCalc, 1, 3);
        GridPane.setMargin(btnCalc, new Insets(10, 10, 0, 10));
        btnCalc.setOnAction(event -> this.Convert());
        btnCalc.setDefaultButton(true);


    }

    public void Convert() {
        String Fahrenheit = txfFahrenheit.getText().trim();
        String Celsius = txfCelsius.getText().trim();


        if (Fahrenheit.equals("")) {
            double CelsiusNo = Integer.parseInt(Celsius);
            double FahrinheitNo = 9.0/5 * CelsiusNo + 32;
            txfFahrenheit.setText("" + FahrinheitNo);

        }
        else if (Celsius.equals("")) {
            double FahrinheitNo = Integer.parseInt(Fahrenheit);
            double CelsiusNo = ( FahrinheitNo - 32 ) * 5.0 / 9.0;
            txfCelsius.setText("" + CelsiusNo);
        }

    }
}
