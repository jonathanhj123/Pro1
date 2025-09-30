package GUIEX1;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GUIEX3 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(10));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(2);

        // add a label to the pane (at col=0, row=0)
        Label lblNumber = new Label("Number:");
        pane.add(lblNumber, 0, 0, 1, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfNumber, 1, 0, 1, 2);
        txfNumber.setEditable(false);
        txfNumber.setText("0");
        txfNumber.setPrefWidth(50);

        // add a button to the pane (at col=2, row=1)
        Button btnInc = new Button("Inc");
        pane.add(btnInc, 2, 0);
        GridPane.setMargin(btnInc, new Insets(10, 10, 0, 10));
        btnInc.setOnAction(event -> this.Incline());
        btnInc.setDefaultButton(true);


        Button btnDec = new Button("Dec");
        pane.add(btnDec, 2, 1);
        GridPane.setMargin(btnDec, new Insets(10, 10, 0, 10));
        btnDec.setOnAction(event -> this.decline());



    }

    public void decline() {
        String s = txfNumber.getText().trim();
        int number = Integer.parseInt(s) - 1;
        txfNumber.setText("" + number);
    }

    public void Incline() {
        String s = txfNumber.getText().trim();
        int number = Integer.parseInt(s) + 1;
        txfNumber.setText("" + number);
    }

}
