package gui;
import controller.*;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;
import model.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import gui.*;

public class Juni24AppGUI extends Application {

    private final ListView<Hold> lvwHold = new ListView<>();
    private final ListView<Deltager> lvwDeltagere = new ListView<>();
    private final ListView<Tur> lvwDeltagerTure = new ListView<>();

    private final Label lblHold = new Label();
    private final Label lblDeltager = new Label();
    private final Label lblDeltagerTure = new Label();

    private final Button btnOpretTur = new Button();



    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Vi Cykler til Sønderhøj");

        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setPadding(new Insets(20));
        pane.setGridLinesVisible(false);

        lvwHold.setPrefSize(200,200);
        lvwDeltagere.setPrefSize(200,200);
        lvwDeltagerTure.setPrefSize(200,200);


        pane.add(lvwHold,0,1);
        pane.add(lvwDeltagere, 1,1);
        pane.add(lvwDeltagerTure,2,1);
        pane.add(lblHold,0,0);
        pane.add(lblDeltager,1,0);
        pane.add(lblDeltagerTure,2,0);
        pane.add(btnOpretTur, 2,4);

        lblDeltager.setText("Deltagere");
        lblHold.setText("Hold");
        lblDeltagerTure.setText("DeltagereTure");
        btnOpretTur.setText("Opret Tur");
        btnOpretTur.setTextAlignment(TextAlignment.RIGHT);


        lvwHold.setEditable(false);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public void initContent(BorderPane pane) {

    }
}
