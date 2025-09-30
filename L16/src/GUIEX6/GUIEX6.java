package GUIEX6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class GUIEX6 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfName = new TextField();
    private TextArea txaNames = new TextArea();
    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(10));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(5);

        // add a label to the pane (at col=0, row=0)
        Label lblFahrenheit = new Label("Name:");
        pane.add(lblFahrenheit, 0, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfName, 0, 1, 2, 1);
        txfName.setEditable(true);

        pane.add(txaNames, 0, 3, 2, 10);
        txaNames.setEditable(false);


        // add a button to the pane (at col=2, row=1)
        Button btnCalc = new Button("Add");
        pane.add(btnCalc, 1, 2);
        GridPane.setMargin(btnCalc, new Insets(10, 10, 0, 10));
        btnCalc.setOnAction(event -> this.AddAction());
        btnCalc.setDefaultButton(true);


    }

    public void AddAction() {
        String s = txfName.getText().trim();
        txaNames.setText(txaNames.getText() + s + "\n");
    }
}
