
package project;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

//class PlayerHandler implements EventHandler<MouseEvent>
//{
//    private int playerSelected;
//    private Stage stage;
//    private Scene map;
//    public PlayerHandler(int playerSelected,Stage stage, Scene map)
//    {
//        this.playerSelected = playerSelected;
//        this.stage = stage;
//        this.map = map;
//    }
//    @Override
//    public void handle(MouseEvent event) {
//      if (playerSelected == 1) 
//          stage.setScene(map);
//      else
//          playerSelected++;
//    }
//    
//}


//class Help extends StackPane{
//    private Button createButton = new Button("Back");
//    
//    
//    public Button getCreateButton() {
//        return createButton;
//    }
//    Help(){
//    GridPane grid = new GridPane();
//    grid.add(createButton, 5, 1);
//    createButton.setPrefSize(100, 50);
//    createButton.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
//    createButton.setTextFill(Color.BLACK);
//    createButton.setAlignment(Pos.CENTER);
//    
//    this.getChildren().add(grid);
//    }
//    
//}

//class Multiplayer extends StackPane {
//    ImageView back = new ImageView("file:Game//main.gif");
//
//       private Button createButton1 = new Button("Next");
//      
//
//    public Button getCreateButton1() {
//        return createButton1;
//    }
//       
//       
//    public Multiplayer(Stage stage, Scene map){
//           
//            back.setFitHeight(700);
//            back.setFitWidth(1500);
//            StackPane background=new StackPane();
//            background.getChildren().add(back);
//            
//        this.getChildren().add(background);
//        
//        StackPane label1=new StackPane();
//        label1.setMinSize(100, 300);
//        StackPane label2=new StackPane();
//        label2.setMinSize(100,300);
//        
//        ImageView l1=new ImageView("file:Game//champion 1.png");
//        l1.setFitHeight(100);
//        l1.setFitWidth(300);
//        ImageView l2=new ImageView("file:Game//champion 2.png");
//        l2.setFitHeight(100);
//        l2.setFitWidth(300);
//        label1.getChildren().add(l1);
//        label2.getChildren().add(l2);
//        label1.setPadding(new Insets(150,0,0,60));
//        label2.setPadding(new Insets(0,60,140,0));
//        label1.setAlignment(Pos.TOP_LEFT);
//        label2.setAlignment(Pos.BOTTOM_RIGHT);
//        this.getChildren().add(label2);
//        this.getChildren().add(label1);
//        
//        BorderPane total=new BorderPane();
//        total.setPadding(new Insets(100,50,100,50));
//        GridPane buttons=new GridPane();
//
//        buttons.setHgap(20);
//        buttons.setVgap(20);
//        
//        ToggleGroup group=new ToggleGroup();
//        ImageView img1 = new ImageView("file:project logos//black panther logo.png");
//        ImageView img2 = new ImageView("file:project logos//black widow logo.png");
//        ImageView img3 = new ImageView("file:project logos//capmarvel logo.png");
//        ImageView img4 = new ImageView("file:project logos//captain logo.png");
//        ImageView img5 = new ImageView("file:project logos//dr strange logo.png");
//        ImageView img6 = new ImageView("file:project logos//hawkeye logo.png");
//        ImageView img7 = new ImageView("file:project logos//hulk logo.png");
//        ImageView img8 = new ImageView("file:project logos//iron man logo.png");
//        ImageView img9 = new ImageView("file:project logos//nebula logo.png");
//        ImageView img10 = new ImageView("file:project logos//spiderman logo.png");
//        ImageView img11 = new ImageView("file:project logos//thor logo.png");
//        ImageView img12 = new ImageView("file:project logos//winterso logo.png");
//      
//        ImageView [] champs = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12};
//        for (int i = 0 ; i < 12 ; i++)
//            {
//                champs[i].setFitHeight(120);
//                champs[i].setFitWidth(120);
//               
//            }
//        int num=0;
//        int playerSelected = 0;
//        for(int r=0;r<2;r++)
//        {
//            for(int c=0;c<6;c++){
//            
//            ToggleButton b=new ToggleButton("");
//            b.setGraphic(champs[num++]);
//            Project.buttonClick(b);
//            b.setPrefSize(90, 90);
//            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(new DropShadow());
//                    b.setPrefSize(92,92);
//                }
//            });
//            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(null);
//                    b.setPrefSize(90,90);
//                }
//                
//            });
//            
//            b.setToggleGroup(group);
////            PlayerHandler evh1 = new PlayerHandler(playerSelected,stage,map);
//         //   b.setOnMouseClicked(evh1);
//            buttons.add(b,c,r);
//            }
//        }
//        
//        ImageView img13 = new ImageView("file:project logos//black panther logo.png");
//        ImageView img14 = new ImageView("file:project logos//black widow logo.png");
//        ImageView img15 = new ImageView("file:project logos//capmarvel logo.png");
//        ImageView img16 = new ImageView("file:project logos//captain logo.png");
//        ImageView img17 = new ImageView("file:project logos//dr strange logo.png");
//        ImageView img18 = new ImageView("file:project logos//hawkeye logo.png");
//        ImageView img19 = new ImageView("file:project logos//hulk logo.png");
//        ImageView img20 = new ImageView("file:project logos//iron man logo.png");
//        ImageView img21 = new ImageView("file:project logos//nebula logo.png");
//        ImageView img22 = new ImageView("file:project logos//spiderman logo.png");
//        ImageView img23 = new ImageView("file:project logos//thor logo.png");
//        ImageView img24 = new ImageView("file:project logos//winterso logo.png");
//      
//        ImageView [] champ = {img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24};
//        for (int i = 0 ; i < 12 ; i++)
//            {
//                champ[i].setFitHeight(120);
//                champ[i].setFitWidth(120);
//               
//            }
//        GridPane buttons1= new GridPane();
//        buttons1.setHgap(20);
//        buttons1.setVgap(20);
//        buttons.setPadding(new Insets(0,0,20,0));
//        buttons1.setPadding(new Insets(20,0,0,0));
//        ToggleGroup group2=new ToggleGroup();
//        int n=0;
//         for(int r=0;r<2;r++)
//        {
//            for(int c=0;c<6;c++){
//            
//            ToggleButton b=new ToggleButton("");
//            b.setGraphic(champ[n++]);
//            b.setPrefSize(90, 90);
//            Project.buttonClick(b);
//            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(new DropShadow());
//                    b.setPrefSize(92,92);
//                }
//            });
//            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(null);
//                    b.setPrefSize(90,90);
//                }
//            });
////            b.setOnAction(e ->  
////            {
////              if (playerSelected == 1)
////                    stage.setScene(map);  
////            }
////            );
////            PlayerHandler evh1 = new PlayerHandler(playerSelected,stage,map);
////            b.setOnMouseClicked(evh1);
//            buttons1.add(b,c,r);
//            b.setToggleGroup(group2);
//            }
//        }
//       
//        buttons.setAlignment(Pos.TOP_RIGHT);
//        buttons1.setAlignment(Pos.BOTTOM_LEFT);
//        total.setTop(buttons);
//        total.setBottom(buttons1);
//
//        
//        
//        this.getChildren().add(total);
//        
//        
//       }
//}


//class maps extends StackPane{
//    ImageView bckGround = new ImageView("file:Game\\mainmap.jpg");
//    
//    maps(){
//    
//       MenuPane m= new MenuPane();
//       m.getMedia().pause();
//        bckGround.setFitHeight(700);
//        bckGround.setFitWidth(1500);
//        StackPane background = new StackPane();
//        background.getChildren().add(bckGround);
//        
//        background.setStyle("-fx-background-color: black");
//        this.getChildren().add(background);
//        BorderPane Maps = new BorderPane();
//        StackPane stack = new StackPane();
//        ImageView lb1= new ImageView("file:Game//maps.png");
//        lb1.setFitWidth(300);
//        lb1.setFitHeight(100);
//        stack.setPadding(new Insets(100,0,0,0));
//        
//	stack.getChildren().add(lb1);
//        Maps.setTop(stack);
//        
//        //HBox h=new HBox();
//        GridPane h = new GridPane();
//        h.setPadding(new Insets(170,400,200,400));
//        h.setHgap(150);
//       
//        ImageView map1 = new ImageView("file:Game\\IMG-20190424-WA0013.jpg");
//        map1.setFitHeight(300); 
//        map1.setFitWidth(300);
//        
//        ToggleGroup group2 =new ToggleGroup();
//        ToggleButton b1 =new ToggleButton("");
//        //b1.setBackground(Background.EMPTY);
//        b1.setPrefSize(300, 300);
//        Project.buttonClick(b1);
//        b1.setGraphic(map1);
//        b1.setToggleGroup(group2);
////      
//        ImageView map2 = new ImageView("file:Game\\IMG-20190424-WA0023.jpg");
//
//        map2.setFitHeight(300); 
//        map2.setFitWidth(300);
//        ToggleButton b2 =new ToggleButton("");
//        Project.buttonClick(b2);
//        b2.setPrefSize(300, 300);
//        b2.setGraphic(map2);
//        b2.setToggleGroup(group2);
//        b2.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler <MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                b2.setPrefSize(310, 310);
//            }
//        });
//        b2.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler <MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                b2.setPrefSize(300, 300);
//            }
//        });
//        h.add(b1,0,0);
//        h.add(b2, 1, 0);
//        Maps.setCenter(h);
//       
////      map2.setOnAction(
////               e -> stage.setScene(BattleMap2);
////       );
//       
////      Maps.setCenter(map2);
//        this.getChildren().add(Maps);
//        }
//    
//}
//
//class ComputerPlayer extends StackPane{
// 
// ImageView bckGround = new ImageView("file:Game\\main.gif");
// 
// 
//    
//    ComputerPlayer(Stage stage, Scene maps){
//        StackPane background=new StackPane();
//        bckGround.setFitHeight(700);
//        bckGround.setFitWidth(1500);
//        
//        StackPane label1=new StackPane();
//        StackPane label2=new StackPane();
//        
//        ImageView l1=new ImageView("file:Game//champion.png");
//        l1.setFitHeight(100);
//        l1.setFitWidth(250);
//        
//        ImageView l2=new ImageView("file:Game//enemy.png");
//        l2.setFitHeight(70);
//        l2.setFitWidth(200);
//        label1.getChildren().add(l1);
//        label2.getChildren().add(l2);
//        label1.setPadding(new Insets(200,0,0,70));
//        label2.setPadding(new Insets(0,0,120,110));
//        label1.setAlignment(Pos.TOP_LEFT);
//        label2.setAlignment(Pos.BOTTOM_LEFT);
//
//        background.getChildren().add(bckGround);
//        BorderPane total=new BorderPane();
//        total.setPadding(new Insets(100,50,100,110));
//        GridPane buttons=new GridPane();
//        buttons.setHgap(20);
//        buttons.setVgap(20);
//        ToggleGroup group=new ToggleGroup();
//        ToggleGroup group2=new ToggleGroup();
//        
//        GridPane buttons1= new GridPane();
//        buttons1.setHgap(20);
//        buttons1.setVgap(20);
//        
//        ImageView img1 = new ImageView("file:project logos//black panther logo.png");
//        ImageView img2 = new ImageView("file:project logos//black widow logo.png");
//        ImageView img3 = new ImageView("file:project logos//capmarvel logo.png");
//        ImageView img4 = new ImageView("file:project logos//captain logo.png");
//        ImageView img5 = new ImageView("file:project logos//dr strange logo.png");
//        ImageView img6 = new ImageView("file:project logos//hawkeye logo.png");
//        ImageView img7 = new ImageView("file:project logos//hulk logo.png");
//        ImageView img8 = new ImageView("file:project logos//iron man logo.png");
//        ImageView img9 = new ImageView("file:project logos//nebula logo.png");
//        ImageView img10 = new ImageView("file:project logos//spiderman logo.png");
//        ImageView img11 = new ImageView("file:project logos//thor logo.png");
//        ImageView img12 = new ImageView("file:project logos//winterso logo.png");
//        ImageView img13 = new ImageView("file:project logos//loki logo.png");
//        ImageView img14 = new ImageView("file:project logos//ultron logo.png");
//        ImageView img15 = new ImageView("file:project logos//thanos logo.png");
//        ImageView [] champs = {img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15};
//        for (int i = 0 ; i < 15 ; i++)
//            {
//                champs[i].setFitHeight(120);
//                champs[i].setFitWidth(120);
//               
//            }
//       int num = 0;
//        for(int r=0;r<2;r++)
//        {
//            for(int c=0;c<6;c++){
//            
//            ToggleButton b=new ToggleButton("");
//            b.setGraphic(champs[num]);
//            num++;
//            b.setPrefSize(120, 120);
//            Project.buttonClick(b);
//            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(new DropShadow());
//                    b.setPrefSize(122,122);
//                }
//            });
//            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(null);
//                    b.setPrefSize(120,120);
//                }
//                
//            });
//            
//            b.setToggleGroup(group);
//            buttons.add(b,c,r);
//            }
//        }
//       
//        buttons1.setHgap(20);
//        buttons1.setVgap(20);
//         for(int r=0;r<1;r++)
//        {
//            for(int c=0;c<3;c++){
//            
//            ToggleButton b=new ToggleButton("");
//            b.setGraphic(champs[num++]);
//            b.setPrefSize(120, 120);
//            Project.buttonClick(b);
//            b.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(new DropShadow());
//                    b.setPrefSize(122,122);
//                }
//            });
//            b.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, new EventHandler<MouseEvent>(){
//                @Override
//                public void handle(MouseEvent event) {
//                    b.setEffect(null);
//                    b.setPrefSize(120,120);
//                }
//                
//            });
//            buttons1.add(b,c,r);
//            b.setToggleGroup(group2);
//            b.setOnAction(e -> stage.setScene(maps));
//            }
//        }
//
//        background.getChildren().add(label2);
//        background.getChildren().add(label1);
//        buttons.setAlignment(Pos.TOP_CENTER);
//        buttons1.setAlignment(Pos.CENTER);
//        total.setTop(buttons);
//        total.setBottom(buttons1);
//        
//        
//        background.getChildren().add(total);
//        this.getChildren().add(background);
//        
//    }
//}


//class MenuPane extends StackPane{
//    String s= new File("Intro.mp3").toURI().toString();
//       MediaPlayer media=new MediaPlayer(new Media(s));
//
//    public MediaPlayer getMedia() {
//        return media;
//    }
//
//    
//    public void setMedia() {
//        this.media.pause();
//    }
//    
//ImageView intro = new ImageView("file:Game\\2326c5a4ded3fcdf3c80ad237ab46b3f.jpg");
//ImageView bckground = new ImageView("file:Game\\thumb-1920-999187.jpg");
//MenuPane ()
//{}
//MenuPane(Stage stage,Scene ComputerPlayer,Scene MultiPlayer,Scene howToPlay){
// 
//       StackPane background=new StackPane();
//      
//       media.play();
//       media.setCycleCount(MediaPlayer.INDEFINITE);
//       bckground.setFitHeight(800);
//       bckground.setFitWidth(1500);
//        
//       intro.setFitHeight(800);
//       intro.setFitWidth(1500);
//        
//                
//       background.getChildren().add(bckground);
//        
//       BorderPane Menu=new BorderPane();
//       VBox center=new VBox();
//       
//       center.setPadding(new Insets(10,0,10,50));
//       center.setSpacing(50);
//       StackPane label=new StackPane();
//       
//       ImageView menulabel = new ImageView("file:Game//texts (1).png");
//       menulabel.setFitHeight(100);
//       menulabel.setFitWidth(300);
//       label.getChildren().add(menulabel);
//       Menu.setTop(label);
//
//       ImageView singleplayer = new ImageView("file:Game//singleplayer.png");
//       singleplayer.setFitHeight(100);
//       singleplayer.setFitWidth(550);
//       singleplayer.setOnMousePressed(e -> stage.setScene(ComputerPlayer));
//       Project.buttonClick(singleplayer);
//       
//       ImageView multiplayer = new ImageView("file:Game//multiplayer.png");
//       multiplayer.setFitHeight(120);
//       multiplayer.setFitWidth(500);
//
//       Project.buttonClick(multiplayer);
//       
//       
//       multiplayer.setOnMousePressed(e -> stage.setScene(MultiPlayer));
//        
//       ImageView Help = new ImageView("file:Game//Help.png");
//       Help.setFitHeight(100);
//       Help.setFitWidth(300);
//       Project.buttonClick(Help);
//       Help.setOnMousePressed(e -> stage.setScene(howToPlay));
//        
//       ImageView Exit = new ImageView("file:Game//Exit (1).png");
//       Exit.setFitHeight(80);
//       Exit.setFitWidth(210);
//       Project.buttonClick(Exit);
//       Exit.setOnMousePressed(e -> stage.close());
//        
//       center.getChildren().addAll(singleplayer,multiplayer,Help,Exit);
//      
//       center.setAlignment(Pos.CENTER);
//
//        
//      Menu.setLeft(center);
//      
//      background.getChildren().add(intro);
//      
//        this.getChildren().add(background);
//        
//        StackPane Intro=new StackPane();
//        Intro.getChildren().add(Menu);
//        this.getChildren().add(Intro);
//
//        FadeTransition ft=new FadeTransition(new javafx.util.Duration(4000),intro);
//        ft.setFromValue(1);
//        ft.setToValue(0);
//        ft.setAutoReverse(false);
//        ft.play();
//        
//        FadeTransition f=new FadeTransition(new javafx.util.Duration(4000),Menu);
//        f.setFromValue(0);
//        f.setToValue(1);
//        f.setAutoReverse(false);
//        f.play();
//        
//}
//
//}

public class Project extends Application {
    
    //public static BattlePane battle= new BattlePane();
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
       
//       maps map=new maps(primaryStage);
//       Scene Maps=new Scene(map,1500,700);
//       
       ComputerPlayer comp=new ComputerPlayer(primaryStage);
       Scene ComputerPlayer=new Scene(comp,BattlePane.bounds.getWidth(),BattlePane.bounds.getHeight());
       
       Multiplayer multi =new Multiplayer(primaryStage);
       Scene MultiPlayer=new Scene(multi,BattlePane.bounds.getWidth(),BattlePane.bounds.getHeight());
       
       Help help=new Help();
       Scene HowToPlay=new Scene(help,BattlePane.bounds.getWidth(),BattlePane.bounds.getHeight());
     
       
       MenuPane m=new MenuPane(primaryStage,ComputerPlayer,MultiPlayer,HowToPlay);
       
       Scene Menu=new Scene(m);
       
       help.getImageView().setOnMouseClicked(e -> primaryStage.setScene(Menu));
       //multi.getCreateButton1().setOnAction(e -> primaryStage.setScene(Maps));
        BattlePane.backToMenu.setOnMouseClicked(e->{
            primaryStage.setScene(Menu);  
            Champion.setChampion1(null);
            Champion.setChampion2(null);
            BattlePane.game.stop();
            BattlePane.comp.stop();
        });
        buttonClick(BattlePane.backToMenu);
       primaryStage.setScene(Menu);
       primaryStage.fullScreenProperty() ;
       primaryStage.setFullScreen(true);
       primaryStage.setResizable(false);
       primaryStage.show();
       //battle.requestFocus();
    }
    
    
   public static void buttonClick(Node n)
   {
       n.setOnMouseEntered(e -> {
        
           String s= new File("buttonclick.mp3").toURI().toString();
           MediaPlayer media=new MediaPlayer(new Media(s));
           media.play();
           if (n instanceof ImageView){
               ImageView currentImg= (ImageView)n;
               currentImg.setFitHeight(currentImg.getFitHeight()+50);
               currentImg.setFitWidth(currentImg.getFitWidth()+100);
//               ((ImageView)n).setFitHeight(150);
//               ((ImageView)n).setFitWidth(650);
           }
       });
       n.setOnMouseExited(e->{
       
       if (n instanceof ImageView){
               ImageView currentImg= (ImageView)n;
               currentImg.setFitHeight(currentImg.getFitHeight()-50);
               currentImg.setFitWidth(currentImg.getFitWidth()-100);
           }
       });
   }
}