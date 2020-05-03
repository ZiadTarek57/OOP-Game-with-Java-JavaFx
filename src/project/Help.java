package project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


class Help extends StackPane{
    ImageView back = new ImageView("file:Game//Back.png");
      
      

    public ImageView getImageView() {
        return back;
    }
    Help(){
// GridPane grid = new GridPane();
//    grid.add(createButton, 5, 1);
//    createButton.setPrefSize(100, 50);
//    createButton.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
//    createButton.setTextFill(Color.BLACK);
//    createButton.setAlignment(Pos.CENTER);
    ImageView background = new ImageView("file:Game//HelpBackGround.png");
    background.setFitHeight(900);
    background.setFitWidth(1600);
   StackPane pane = new StackPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(0,0,0,0));
        pane.getChildren().add(back);
        back.setFitHeight(50);
        back.setFitWidth(150);
        
        Project.buttonClick(back);
    
    this.getChildren().addAll(background,pane);
    }
    
}