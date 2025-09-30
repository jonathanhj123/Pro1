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
public class GUIEX1 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private TextField txfLastName = new TextField();
    private TextField txfFirstName = new TextField();

    private TextField txfFullName = new TextField();

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
        Label lblFullName = new Label("Full Name:");
        pane.add(lblFullName, 0, 2);

        Label lblFirstName = new Label("First Name:");
        pane.add(lblFirstName, 0, 0);

        Label lblLastName = new Label("Last Name:");
        pane.add(lblLastName, 2, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        pane.add(txfFirstName, 0, 1);

        pane.add(txfLastName, 2, 1);

        pane.add(txfFullName, 0, 3, 3, 1);
        txfFullName.setEditable(false);
        txfFullName.setMouseTransparent(true);
        txfFullName.setFocusTraversable(false);

        // add a button to the pane (at col=2, row=1)
        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 3, 4);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 0, 10));

        btnCombine.setOnAction(event -> this.CombineAction());
        btnCombine.setDefaultButton(true);





//        public void CombineAction() {
//            String Firstname = txfFirstName.getText();
//            String LastName = txfLastName.getText();
//            String Fullname = Firstname + " " + LastName;
//            txfFullName.setText(Fullname);
//
//        }
    }

    public void CombineAction() {
        String Firstname = txfFirstName.getText();
        String LastName = txfLastName.getText();
        String Fullname = Firstname + " " + LastName;
        txfFullName.setText(Fullname);

    }

}
