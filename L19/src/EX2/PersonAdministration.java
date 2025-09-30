package EX2;

import EX1.Person;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PersonAdministration extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo input window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        Person = new PersonInput("Add Person", stage);
    }

    // -------------------------------------------------------------------------

    private final TextField txfResult = new TextField();
    private PersonInput Person;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Movie:");
        pane.add(lblName, 0, 0);

        pane.add(txfResult, 1, 0, 2, 1);
        txfResult.setEditable(false);

        Button btnAddPerson = new Button("Add Person");
        pane.add(btnAddPerson, 1, 1);
        GridPane.setMargin(btnAddPerson, new Insets(10, 10, 0, 10));
   //     btnAddPerson.setOnAction(event -> this.AddPerson());

    }
    // -----------------------------------------------------
    // Button action

//    private void AddPerson() {
//        String name = txfName.getText().trim();
//        String title = txfTitle.getText().trim();
//        if (name.length() > 0 && title.length() > 0) {
//            EX1.Person p = new Person(name, title, senior);
//            persons.add(p);
//            lvwPersons.getItems().setAll(persons);
//        }
//        else if (title.length() > 0 && name.length() == 0){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Add person");
//            alert.setHeaderText("No name typed");
//            alert.setContentText("Type the name of the person");
//            alert.show();
//        }
//        else if (title.length() == 0 && name.length() > 0) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Add Title");
//            alert.setHeaderText("No title typed");
//            alert.setContentText("Type the title of the person");
//            alert.show();
//        }
//
//    }
}
