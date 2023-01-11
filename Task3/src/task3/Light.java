/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;


import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Light extends StackPane {
    Light(){
        HBox upBox = new HBox();
   
        VBox minusBox = new VBox();
        
        String [] color = {"#4a5207","#7e8a17","#aebf19","#e6ff0d","#f6fcbd","#f9faed"};
        Boolean [] b1 = new Boolean[6];
        Boolean [] b2 = new Boolean[6];
        Boolean [] b3 = new Boolean[6];
        Button [] l1 = new Button[6];
        for (int i = 0 ; i< 6 ; i++){
            b1[i] = true;
            l1[i] = new Button();
            l1[i].setText("");
            l1[i].setPrefSize(30, 20);
            l1[i].setTextFill(Color.BLACK);
        
            l1[i].setStyle("-fx-background-color: "+ color[i]+";" );
        }
        
        Button [] l2 = new Button[6];
        for (int i = 0 ; i< 6 ; i++){
            b2[i] = true;
            l2[i] = new Button();
            l2[i].setText("");
            l2[i].setPrefSize(30, 20);
            l2[i].setTextFill(Color.BLACK);
        
            l2[i].setStyle("-fx-background-color: "+ color[i]+";" );
        }
        Button [] l3 = new Button[6];
        for (int i = 0 ; i< 6 ; i++){
            b3[i] = false;
            l3[i] = new Button();
            l3[i].setText("");
            l3[i].setPrefSize(30, 20);
            l3[i].setTextFill(Color.BLACK);
        
            l3[i].setStyle("-fx-background-color: black;" );
        }

        
     
        Button btn1 = new Button();
        btn1.setText("-");
        btn1.setPrefSize(40, 35);
        btn1.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn1.setStyle("  -fx-border-color: white;" );
        btn1.setStyle("  -fx-border-width: 1;" );
        btn1.setTextFill(Color.WHITE);
        
        btn1.setStyle("-fx-background-color: transparent;" );
        btn1.setOnAction((ActionEvent event) -> {
            Boolean flag = false;
            for (int i = 0; i< 6; i++){
                if (!b1[i]){
                    flag = true;
                    if(i!=0){
                        
                        l1[i-1].setStyle("-fx-background-color: black;" );
                        b1[i-1] = false;
                    }
                }
            }
            if (!flag){
                l1[5].setStyle("-fx-background-color: black;" );
                b1[5] = false;
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("-");
        btn2.setPrefSize(40, 35);
        btn2.setTextFill(Color.WHITE);
        btn2.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn2.setStyle("-fx-background-color: transparent;" );
        btn2.setOnAction((ActionEvent event) -> {
            Boolean flag = false;
            for (int i = 0; i< 6; i++){
                if (!b2[i]){
                    flag = true;
                    if(i!=0){
                        
                        l2[i-1].setStyle("-fx-background-color: black;" );
                        b2[i-1] = false;
                    }
                }
            }
            if (!flag){
                l2[5].setStyle("-fx-background-color: black;" );
                b2[5] = false;
            }
        });
        Button btn3 = new Button();
        btn3.setText("-");
        btn3.setPrefSize(40, 35);
        btn3.setTextFill(Color.WHITE);
        btn3.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn3.setStyle("-fx-background-color: transparent;" );
        btn3.setOnAction((ActionEvent event) -> {
            Boolean flag = false;
            for (int i = 0; i< 6; i++){
                if (!b3[i]){
                    flag = true;
                    if(i!=0){
                        
                        l3[i-1].setStyle("-fx-background-color: black;" );
                        b3[i-1] = false;
                    }
                }
            }
            if (!flag){
                l3[5].setStyle("-fx-background-color: black;" );
                b3[5] = false;
            }
        });
        Button btn4 = new Button();
        btn4.setText("+");
        btn4.setPrefSize(40, 35);
        btn4.setTextFill(Color.WHITE);
        btn4.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn4.setStyle("-fx-background-color: transparent;" );
        btn4.setOnAction((ActionEvent event) -> {
            for (int i = 0; i< 6; i++){
                if (!b1[i]){
                   
                        
                    l1[i].setStyle("-fx-background-color: "+color[i]+";" );
                    b1[i] = true;
                    break;
                }
            }
           
        });
        Button btn5 = new Button();
        btn5.setText("+");
        btn5.setPrefSize(40, 35);
        btn5.setTextFill(Color.WHITE);
        btn5.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn5.setStyle("-fx-background-color: transparent;" );
        btn5.setOnAction((ActionEvent event) -> {
            for (int i = 0; i< 6; i++){
                if (!b2[i]){
                   
                        
                    l2[i].setStyle("-fx-background-color: "+color[i]+";" );
                    b2[i] = true;
                    break;
                }
            }
           
        });
        Button btn6 = new Button();
        btn6.setText("+");
        btn6.setPrefSize(40, 35);
        btn6.setTextFill(Color.WHITE);
        btn6.setBorder(new Border(new BorderStroke(Color.WHITE, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        btn6.setStyle("-fx-background-color: transparent;" );
        btn6.setOnAction((ActionEvent event) -> {
            for (int i = 0; i< 6; i++){
                if (!b3[i]){
                   
                        
                    l3[i].setStyle("-fx-background-color: "+color[i]+";" );
                    b3[i] = true;
                    break;
                }
            }
           
        });
        //start.setOnAction(new Event);

        
   
        minusBox.setSpacing(8);
        minusBox.getChildren().addAll(btn1,btn2,btn3);
        minusBox.setAlignment(Pos.CENTER);
        VBox plusBox = new VBox();
        plusBox.setSpacing(8);
        plusBox.getChildren().addAll(btn4,btn5,btn6);
        plusBox.setAlignment(Pos.CENTER);
     
           
//        upBox.getChildren().addAll(lbl,lbl2,lbl3,lbl4,lbl5);
//     
        
        
          VBox light = new VBox();
          
        HBox [] lights = new HBox[3];
        lights[0] = new HBox();
        lights[0].getChildren().addAll(l1[0],l1[1],l1[2],l1[3],l1[4],l1[5]);
        lights[0].setSpacing(3);
        lights[1] = new HBox();
        lights[1].getChildren().addAll(l2[0],l2[1],l2[2],l2[3],l2[4],l2[5]);
        lights[1].setSpacing(3);
        lights[2] = new HBox();
        lights[2].getChildren().addAll(l3[0],l3[1],l3[2],l3[3],l3[4],l3[5]);;
        lights[2].setSpacing(3);
        light.setSpacing(16);
        light.getChildren().addAll(lights[0],lights[1],lights[2]);
        light.setPadding(new Insets(5,0,0,0));

        
        
        
        upBox.setSpacing(34);
        //HBox upBox = new HBox();
        upBox.getChildren().addAll(minusBox,light,plusBox);
        upBox.setStyle("  -fx-border-width: 1;" );
        upBox.setSpacing(8);
        upBox.setStyle("  -fx-border-color: white;" );
        upBox.setPadding(new Insets(20,10,10,10));
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

      getChildren().addAll( upBox,rectangle,title);
    }
    
}
