package EX1;
import EX1.Person;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class GUIEX1 extends Application{

    public void start(Stage stage) {
        stage.setTitle("Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private ListView<Person> lvwPersons = new ListView<>();
    private ArrayList<Person> persons = new ArrayList<>();
    private TextField txfName = new TextField();
    private TextField txfTitle = new TextField();

    private boolean senior = false;

    private void initContent(GridPane pane) {
        this.initPersons();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);

        Label lblNames = new Label("People:");
        pane.add(lblNames, 0, 3);

        pane.add(txfName, 1, 0, 2, 1);
        pane.add(txfTitle, 1, 1, 2, 1);

        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 1, 3, 1, 5);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

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

        lvwPersons.getSelectionModel().clearSelection();

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 4, 2);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());
        // connect a method to the button

    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        if (name.length() > 0 && title.length() > 0) {
            Person p = new Person(name, title, senior);
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
        }
        else if (title.length() > 0 && name.length() == 0){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Add person");
        alert.setHeaderText("No name typed");
        alert.setContentText("Type the name of the person");
        alert.show();
         }
        else if (title.length() == 0 && name.length() > 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Add Title");
            alert.setHeaderText("No title typed");
            alert.setContentText("Type the title of the person");
            alert.show();
        }

    }

    private void initPersons() {
        persons.add(new Person("Jens", "Jensen", true));
        persons.add(new Person("Hans", "Hansen", true));
        persons.add(new Person("Pia", "Peters", false));
    }

    // -------------------------------------------------------------------------
    // Selection changed action
}
