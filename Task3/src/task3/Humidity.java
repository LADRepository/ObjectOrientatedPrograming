/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Humidity extends StackPane{
   
    
    Humidity() {
        HBox upBox = new HBox();
        upBox.setPadding(new Insets(20,20,0,20));
        
        Label lbl = new Label("53"); 
        lbl.setStyle("-fx-font-size: 26pt;");
        lbl.setTextFill(Color.RED);
        
        Label lbl2 = new Label(" %"); 
        lbl2.setStyle("-fx-font-size: 25pt;");
        lbl2.setTextFill(Color.WHITE);
        Button upBtn = new Button();
        ImageView imageView;
        HBox hbox = new HBox();
        
        upBtn.setPrefSize(40, 40);
        upBtn.setTextFill(Color.WHITE);
        upBtn.setStyle("  -fx-border-color: white;" );
        upBtn.setStyle("  -fx-border-width: 1;" );
        upBtn.setStyle("-fx-background-color: transparent;" );
        //start.setOnAction(new Event);

        upBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                 int n = Integer.parseInt(lbl.getText());
                 if (n< 55 && n>=30){
                 n = n + 1;
                
                 lbl.setText(String.valueOf(n));
                 }
             }
        });
        
        Button downBtn = new Button();
        downBtn.setPrefSize(40, 40);
        downBtn.setTextFill(Color.WHITE);
        
        downBtn.setStyle("  -fx-border-color: white;" );
        downBtn.setStyle("  -fx-border-width: 5;" );
        downBtn.setStyle("-fx-background-color: transparent;" );
        downBtn.setOnAction((ActionEvent event) -> {
            int n = Integer.parseInt(lbl.getText());
                if (n<= 55 && n>30){
                 n = n - 1;
                 
                 lbl.setText(String.valueOf(n));
                 }
        });
        hbox.setSpacing(5);
        hbox.getChildren().addAll(upBtn,downBtn);
        hbox.setAlignment(Pos.CENTER);
        FileInputStream inputstream; 
        try {
            inputstream = new FileInputStream("humidity-icon.png");
            Image image = new Image(inputstream);
            inputstream = new FileInputStream("up-icon.png");
           
            imageView = new ImageView(image);
            imageView.setFitHeight(50);
            imageView.setFitWidth(45);
            
            image = new Image(inputstream);
            ImageView img = new ImageView(image);
            img.setFitHeight(40);
            img.setFitWidth(40);
            upBtn.setGraphic(img);
            
            inputstream = new FileInputStream("down-icon.png");
            image = new Image(inputstream);
            img = new ImageView(image);
            img.setFitHeight(40);
            img.setFitWidth(40);
            downBtn.setGraphic(img);
            imageView.setPreserveRatio(true);
            upBox.getChildren().addAll(imageView,lbl,lbl2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Temperature.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
          
        
        

        
        
        
        upBox.setSpacing(12);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(upBox,hbox);
        vbox.setStyle("  -fx-border-width: 1;" );
        vbox.setSpacing(15);
        vbox.setStyle("  -fx-border-color: white;" );
        vbox.setPadding(new Insets(0,0,20,0));
        Label title = new Label(" " + "Humidity Control" + " ");
        title.setTextFill(Color.WHITE);
        StackPane.setAlignment(title, Pos.TOP_LEFT);
        StackPane stackPane = new StackPane();

        title.setStyle("-fx-background-color: white;" );
        //title.setStyle("-fx-background-insets: 10 0 0 20 " );
        title.setStyle("-fx-translate-y: -8;" );
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.valueOf("#336699"));
        
        rectangle.setStyle("-fx-translate-y: -8;" );
        rectangle.widthProperty().bind(title.widthProperty());
        rectangle.heightProperty().bind(title.heightProperty());
        
        StackPane.setAlignment(rectangle, Pos.TOP_LEFT);
        stackPane.getChildren().addAll(rectangle, title);

      getChildren().addAll( vbox,rectangle,title);
    }
    
}
