package gui;
import controller.*;
import javafx.scene.control.Label;
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

import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.Arrays;


public class Juni24App {
    public static void main(String[] args) {

        initStorage();
        Application.launch(Juni24AppGUI.class);

    }

    private static void initStorage() {

        Hold Cyklisterne = controller.opretHold("Cyklisterne.");
        Hold Optimisterne = controller.opretHold("Optimisterne.");

        Deltager Ole = controller.opretDeltager(Cyklisterne, "Ole", "12345678" );
        Deltager Ib = controller.opretDeltager(Cyklisterne, "Ib", "12341234");
        Deltager Pia = controller.opretDeltager(Cyklisterne, "Pia", "12344321");


        Tur tur1 = controller.opretTur(LocalDate.of(2024,05,15) , 120, 30, Ole);
        Tur tur2 = controller.opretTur(LocalDate.of(2024,05,16) , 60, 15, Ole);
        Tur tur3 = controller.opretTur(LocalDate.of(2024,05,16) , 90, 25, Ib);


        Badge badge1 = controller.opretBadge("Hent en kollega");
        Badge badge2 = controller.opretBadge("2 dage i træk");
        Badge badge3 = controller.opretBadge("25 Km på en dag.");


        controller.tilføjBadgeTilDeltager(Ole, badge1);



        System.out.println(Ole.kmIAlt());
        System.out.println(Cyklisterne.deltagerMedFlestKm().toString());
        System.out.println(badge1.findDeltager(Cyklisterne.getDeltagere(), badge1));

        System.out.println(Cyklisterne.holdBadges());
        Deltager[] Hurtige = Cyklisterne.hurtigeDeltagere(130, 25);
        
        System.out.println(Arrays.toString(Hurtige));



    }
}
