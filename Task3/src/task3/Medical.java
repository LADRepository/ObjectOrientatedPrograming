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


public class Medical extends StackPane{
    
    Medical(){
        HBox upBox = new HBox();
        upBox.setPadding(new Insets(35,35,0,35));
        
        Label lbl = new Label("O2"); 
        lbl.setStyle("-fx-font-size: 10pt;");
        lbl.setStyle("-fx-font-weight: bold;");
        lbl.setTextFill(Color.YELLOW);
        
        Label lbl2 = new Label("N2O"); 
        lbl2.setStyle("-fx-font-size: 10pt;");
        lbl2.setStyle("-fx-font-weight: bold;");
        lbl2.setTextFill(Color.YELLOW);
        
        Label lbl3 = new Label("AIR1"); 
        lbl3.setStyle("-fx-font-size: 10pt;");
        lbl3.setStyle("-fx-font-weight: bold;");
        lbl3.setTextFill(Color.YELLOW);
        
        Label lbl4 = new Label("CO2"); 
        lbl4.setStyle("-fx-font-size: 10pt;");
        lbl4.setStyle("-fx-font-weight: bold;");
        lbl4.setTextFill(Color.YELLOW);
        
        Label lbl5 = new Label("VAR"); 
        lbl5.setStyle("-fx-font-size: 10pt;");
        lbl5.setStyle("-fx-font-weight: bold;");
        lbl5.setTextFill(Color.YELLOW);
        
        HBox hbox = new HBox();
        
        Button btn1 = new Button();
        btn1.setText("Low");
        btn1.setPrefSize(47, 47);
        btn1.setTextFill(Color.BLACK);
        
        btn1.setStyle("-fx-background-color: #db5918;" );
        
        Button btn2 = new Button();
        btn2.setText("High");
        btn2.setPrefSize(47, 47);
        btn2.setTextFill(Color.BLACK);
        
        btn2.setStyle("-fx-background-color: #5fc7bd;" );
        
        Button btn3 = new Button();
        btn3.setText("Norm");
        btn3.setPrefSize(47, 47);
        btn3.setTextFill(Color.BLACK);
        
        btn3.setStyle("-fx-background-color: #5fc7bd;" );
        
        Button btn4 = new Button();
        btn4.setText("Norm");
        btn4.setPrefSize(47, 47);
        btn4.setTextFill(Color.BLACK);
        
        btn4.setStyle("-fx-background-color: #db5918;" );
        
        Button btn5 = new Button();
        btn5.setText("High");
        btn5.setPrefSize(47, 47);
        btn5.setTextFill(Color.BLACK);
        
        btn5.setStyle("-fx-background-color: #db5918;" );
        //start.setOnAction(new Event);

        
   
        hbox.setSpacing(10);
        hbox.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
        hbox.setAlignment(Pos.CENTER);
        FileInputStream inputstream; 
        
            
           
        upBox.getChildren().addAll(lbl,lbl2,lbl3,lbl4,lbl5);
     
        
        
        
          
        
        

        
        
        
        upBox.setSpacing(34);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(upBox,hbox);
        vbox.setStyle("  -fx-border-width: 1;" );
        vbox.setSpacing(8);
        vbox.setStyle("  -fx-border-color: white;" );
        vbox.setPadding(new Insets(0,0,35,0));
        Label title = new Label(" " + "Medical Gases" + " ");
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
