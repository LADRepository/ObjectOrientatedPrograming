/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
//import java.awt.color;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JButton;

public class Surgery extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        StackPane root = new StackPane();
        Pane  pane  = new Pane();
        root.getChildren().add(pane);
        BackgroundFill backgroundFill =
                new BackgroundFill(
                    Color.valueOf("#4a3e28"),
                    new CornerRadii(0),
                    new Insets(0)
                );

        Background background = new Background(backgroundFill);

        pane.setBackground(background);
        pane.getChildren().add(addHost());        
        Scene scene = new Scene(root, 700, 550);
        //HBox hbox = addHBox();
        
  //pane.getChildren().add();
        primaryStage.setTitle("Surgery Control Panel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   // Graphical Code Begins Here

    public GridPane addHost() {
        GridPane host = new GridPane();
        host.setStyle("-fx-background-color: #336699;");
        host.setHgap(20);
        host.setVgap(20);
        host.setPadding(new Insets(30, 700, 500, 15));
        HBox hbox = new HBox();
        
        hbox.setSpacing(30);
        GridPane day = dayTime();
        Pane timer = new TimerCount();
        Pane titledContent = new BorderedTitledPane("xD", day);
        
        hbox.getChildren().addAll(titledContent,timer);
        HBox sRow = new HBox();
        HBox tRow = new HBox();
        Pane temp = new Temperature();
        Pane humidity = new Humidity();
        Pane pressure = new Pressure();
        Pane medical = new Medical();
        Pane light = new Light();
        sRow.setSpacing(34);
        tRow.setSpacing(15);
        tRow.getChildren().addAll(light,medical);
        sRow.getChildren().addAll(temp,humidity,pressure);
        VBox vBox = new VBox();
        vBox.setSpacing(30);
        vBox.getChildren().addAll(hbox,sRow,tRow);
        host.add(vBox, 0, 0);
       // host.add(timer, 0, 1);
//        host.getChildren().add(hbox);
       // host.add(titledContent,0,0);
    return host;
}
    public GridPane dayTime(){
        
        
        GridPane grid = new GridPane();
   //     day.setPadding(new Insets(0,0,0,0));
        grid.setPadding(new Insets(40,100,20,40));
        grid.setStyle("-fx-background-color: #4a3e28;" );
        Label lblName = new Label("");
        lblName.setTextFill(Color.GREEN);
        lblName.setStyle("-fx-font-size: 26pt;");
        Thread timerThread = new Thread(() -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                try {
                    Thread.sleep(1000); //1 second
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                final String time = simpleDateFormat.format(new Date());
                Platform.runLater(() -> {
                lblName.setText(time);
                 });
            }
        });   
        timerThread.setDaemon(true);
        timerThread.start();

        grid.add(lblName,1,2);
  
        return grid;
    }
    public static void main(String[] args) {
        launch(args);
        
    }
}
