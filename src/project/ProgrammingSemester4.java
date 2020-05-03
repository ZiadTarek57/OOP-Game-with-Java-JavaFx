package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.animation.*; 
import javafx.scene.Group; 
import javafx.scene.paint.Color;  
import javafx.util.Duration;  
import javafx.scene.shape.*; 
import javafx.scene.image.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;





import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author GO
 */
import javafx.scene.control.*;
import java.awt.Image;
//import java.awt.Label;
//import java.awt.Rectangle;
import java.io.File;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Timer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;


/**
 *
 * @author GO
 */
public class ProgrammingSemester4 extends Application {
    
    KeyManager myKeys= new KeyManager();
    Champion captainAmerica = new Champion("Captain America", 20.0, 1.5);
    Champion captainAmerica2= new  Champion("Captain America", 5.0,1.5);
    //static String folderPath= "file:images\\";
    //static ImageView gameOverImg = new ImageView(folderPath+"game over.png");
   
    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();
    
        
    public void start (Stage primaryStage) {

        //StackPane mainGamePane= new StackPane();
        
//       gameOverImg.setX(550);
//       gameOverImg.setY(250);
//       gameOverImg.setFitHeight(200);
//       gameOverImg.setFitWidth(200);
//       InstantiatingChampions instantiate = new InstantiatingChampions();
//       Champion c1= instantiate.getChampion(0);
//       Champion c2= instantiate.getChampion(1);
       // captainAmerica.setAvatar(new ImageView(loadImage(folderPath+"captain logo.png")));
//        ImageView logo1 = captainAmerica.getAvatar();
//        logo1.setX(50);
//        logo1.setY(20);
//        imageCenterCrop(logo1);
        
//         Rectangle base1 = new Rectangle(50, 20+captainAmerica.getAvatarHeight(), 400, 20);
//        base1.setFill(Color.GRAY);
//        base1.setArcHeight(10);
//        base1.setArcWidth(20);
//
//        Rectangle lifeRect1 = new Rectangle( 50,20+captainAmerica.getAvatarHeight(), 400, 20);
//        lifeRect1.setFill(Color.GREEN);
//        lifeRect1.setArcHeight(10);
//        lifeRect1.setArcWidth(20);
//
//       
//        Pane healthBar1 = new Pane(logo1,base1, lifeRect1);
//        
//        HealthBar healthBar1= new HealthBar(captainAmerica);
//        healthBar1.getLogo().setX(50);         healthBar1.getLogo().setY(20);
//        healthBar1.getBase().setX(50);         healthBar1.getBase().setY(20+captainAmerica.getAvatarHeight());
////        
        
      //  captainAmerica2.setAvatar(new ImageView(loadImage(folderPath+"captain logo.png")));
//        ImageView logo2 = captainAmerica2.getAvatar();
//        logo2.setX(800);
//       logo2.setY(20);
//        imageCenterCrop(logo2);
//        Rectangle base2 = new Rectangle(800, 20+captainAmerica2.getAvatarHeight(), 400, 20);
//        base2.setFill(Color.GRAY);
//        base2.setArcHeight(10);
//        base2.setArcWidth(20);
//
//
//       Rectangle lifeRect2 = new Rectangle(800, 20+captainAmerica2.getAvatarHeight(), 400, 20);
//        lifeRect2.setFill(Color.GREEN);
//        lifeRect2.setArcHeight(10);
//        lifeRect2.setArcWidth(20);
//
//        
//        
//       
//        Pane healthBar2 = new Pane(logo2,base2, lifeRect2);
////        
////        
//        captainAmerica.setFacing("Right");
//        
//        
       // ImageView bckGround = new ImageView(loadImage(folderPath+"battleMap.jpg"));
//       
//        ImageView fr1 = new ImageView(loadImage(folderPath+"captain facing right.png"));
//        
//        ImageView fl1 = new ImageView(loadImage(folderPath+"captain facing left.png"));
//        
//        ImageView hr11 = new ImageView(loadImage(folderPath+"captain hit right 1.png"));
//        ImageView hr12 = new ImageView(loadImage(folderPath+"captain hit right 2.png"));
//        ImageView hr13 = new ImageView(loadImage(folderPath+"captain hit right 3.png"));
//
//        ImageView hl11 = new ImageView(loadImage(folderPath+"captain hit left 1.png"));
//        ImageView hl12 = new ImageView(loadImage(folderPath+"captain hit left 2.png"));
//        ImageView hl13 = new ImageView(loadImage(folderPath+"captain hit left 3.png"));
//        ImageView ghr1 = new ImageView(loadImage(folderPath+"captain getting hit from left.png"));
//        ImageView ghl1 = new ImageView(loadImage(folderPath+"captain getting hit from right.png"));
//        ImageView mr1 = new ImageView(loadImage(folderPath+"captain moving right 2.png"));
//        ImageView ml1 = new ImageView(loadImage(folderPath+"captain moving left 2.png"));
//        
//        
//        captainAmerica.setAnimSkins(fr1, fl1, hr11, hr12, hr13, hl11, hl12, hl13,mr1,ml1,ghr1,ghl1);
//        
//       
//        
//        captainAmerica2.setFacing("Left");
//        
//        
//        ImageView fr2 = new ImageView(loadImage(folderPath+"captain facing right.png"));
//        
//        ImageView fl2 = new ImageView(loadImage(folderPath+"captain facing left.png"));
//        
//        ImageView hr21 = new ImageView(loadImage(folderPath+"captain hit right 1.png"));
//        ImageView hr22 = new ImageView(loadImage(folderPath+"captain hit right 2.png"));
//        ImageView hr23 = new ImageView(loadImage(folderPath+"captain hit right 3.png"));
//        ImageView hl21 = new ImageView(loadImage(folderPath+"captain hit left 1.png"));
//        ImageView hl22 = new ImageView(loadImage(folderPath+"captain hit left 2.png"));
//        ImageView hl23 = new ImageView(loadImage(folderPath+"captain hit left 3.png"));
//        ImageView ghr2 = new ImageView(loadImage(folderPath+"captain getting hit from left.png"));
//        ImageView ghl2 = new ImageView(loadImage(folderPath+"captain getting hit from right.png"));
//        ImageView mr2 = new ImageView(loadImage(folderPath+"captain moving right 2.png"));
//        ImageView ml2 = new ImageView(loadImage(folderPath+"captain moving left 2.png"));
//        
//        captainAmerica2.setAnimSkins(fr2, fl2, hr21, hr22, hr23, hl21, hl22, hl23,mr2,ml2,ghr2,ghl2);
//        bckGround.setOpacity(0.9);
//        //Champion c1=instantiate.championsArray[0];
//        //Champion c2=instantiate.championsArray[1];
////        Champion hawkeye= new Champion ("Hawkeye",10,1.5); 
////
////         hawkeye.setAvatar(new ImageView(loadImage(folderPath+"hawkeye logo.png")));
////        ImageView fr6 = new ImageView(loadImage(folderPath+"hawkeye facing right.png"));
////        ImageView fl6 = new ImageView(loadImage(folderPath+"hawkeye facing left.png"));
////        ImageView hr61 = new ImageView(loadImage(folderPath+"hawkeye hit right 1.png"));
////        ImageView hr62 = new ImageView(loadImage(folderPath+"hawkeye hit right 2.png"));
////        ImageView hr63 = new ImageView(loadImage(folderPath+"hawkeye hit right 3.png"));
////        ImageView hl61 = new ImageView(loadImage(folderPath+"hawkeye hit left 1.png"));
////        ImageView hl62 = new ImageView(loadImage(folderPath+"hawkeye hit left 2.png"));
////        ImageView hl63 = new ImageView(loadImage(folderPath+"hawkeye hit left 3.png"));
////        ImageView ghr6 = new ImageView(loadImage(folderPath+"hawkeye getting hit from left.png"));
////        ImageView ghl6 = new ImageView(loadImage(folderPath+"hawkeye getting hit from right.png"));
////        ImageView mr6= new ImageView(loadImage(folderPath+"hawkeye moving right 2.png"));
////        ImageView ml6 = new ImageView(loadImage(folderPath+"hawkeye moving left 2.png"));
////        
////        
////         hawkeye.setAnimSkins(fr6, fl6, hr61, hr62, hr63, hl61, hl62, hl63,mr6,ml6,ghr6,ghl6);
////        
////        //championsArray[5] = hawkeye; 
////        
////              //7.hulk
////         Champion hulk= new Champion ("Hulk",10,1.5); 
////
////         hulk.setAvatar(new ImageView(loadImage(folderPath+"hulk logo.png")));
////        ImageView fr7 = new ImageView(loadImage(folderPath+"hulk facing right.png"));
////        ImageView fl7 = new ImageView(loadImage(folderPath+"hulk facing left.png"));
////        ImageView hr71 = new ImageView(loadImage(folderPath+"hulk hit right 1.png"));
////        ImageView hr72 = new ImageView(loadImage(folderPath+"hulk hit right 2.png"));
////        ImageView hr73 = new ImageView(loadImage(folderPath+"hulk hit right 3.png"));
////        ImageView hl71 = new ImageView(loadImage(folderPath+"hulk hit left 1.png"));
////        ImageView hl72 = new ImageView(loadImage(folderPath+"hulk hit left 2.png"));
////        ImageView hl73 = new ImageView(loadImage(folderPath+"hulk hit left 3.png"));
////        ImageView ghr7 = new ImageView(loadImage(folderPath+"hulk getting hit from left.png"));
////        ImageView ghl7 = new ImageView(loadImage(folderPath+"hulk getting hit from right.png"));
////        ImageView mr7= new ImageView(loadImage(folderPath+"hulk moving right 2.png"));
////        ImageView ml7 = new ImageView(loadImage(folderPath+"hulk moving left 2.png"));
////        
////        
////         hulk.setAnimSkins(fr7, fl7, hr71, hr72, hr73, hl71, hl72, hl73,mr7,ml7,ghr7,ghl7);
////        
//        
////        Pane grp = new Pane();
////        //mainGamePane.getChildren().addAll(bckGround,grp);
////        Pane imagesPaneP1 = new Pane(); imagesPaneP1.getChildren().add(fr1);
////        Pane imagesPaneP2 = new Pane(); imagesPaneP2.getChildren().add(fl2);
////        
////        
////        grp.setOnKeyPressed(e->{
////        myKeys.setKeyState(true, e);
////        
////        });
////        grp.setOnKeyReleased(e->{
////        myKeys.setKeyState(false, e);
////        
////        });
////        grp.setOnKeyPressed((event) -> {
////            switch (event.getCode()){
////                case UP: if(!captainAmerica.getJumplock())ChampionAnimation.jump(captainAmerica);  break;
////                case RIGHT: ChampionAnimation.moveRight(imagesPaneP1,captainAmerica); break;
////                case LEFT: ChampionAnimation.moveLeft(imagesPaneP1,captainAmerica); break;
////                case DOWN: ChampionAnimation.pauseToHit(imagesPaneP1, captainAmerica,captainAmerica2,lifeRect2,grp,imagesPaneP2); break;
////                
////            }
////        
////        
////    
////            switch (event.getText().charAt(0)){
////                
////                case 'w': if(!captainAmerica2.getJumplock())ChampionAnimation.jump( captainAmerica2);  break;
////                case 'd': moveRight( imagesPaneP2,captainAmerica2); break;
////                case 'a': moveLeft( imagesPaneP2,captainAmerica2); break;
////                case 's': ChampionAnimation.pauseToHit(imagesPaneP2, captainAmerica2,captainAmerica,healthBar1.getLifeRectangle(),grp,imagesPaneP1 ); break;
////          
////            }});
//////        grp.setOnKeyReleased((event) -> {
//////            switch (event.getCode()){
////////                case UP: jump(captainAmerica);  break;
////////                case RIGHT: moveRight(imagesPaneP1,captainAmerica); break;
////////                case LEFT: moveLeft(imagesPaneP1,captainAmerica); break;
//////                case DOWN: if (captainAmerica.getFacing().equals("Right"))moveRight(imagesPaneP1, captainAmerica);
//////                else moveLeft(imagesPaneP1, captainAmerica);
//////                
//////                
//////            }
//////        
//////        
//////    
//////            switch (event.getText().charAt(0)){
//////                
////////                case 'w': jump( captainAmerica2);  break;
////////                case 'd': moveRight( imagesPaneP2,captainAmerica2); break;
////////                case 'a': moveLeft( imagesPaneP2,captainAmerica2); break;
//////                case 's':  if (captainAmerica2.getFacing().equals("Right"))moveRight(imagesPaneP2, captainAmerica);
//////                else moveLeft(imagesPaneP2, captainAmerica2);
//////          
//////            }});
////     
////        grp.setOnKeyReleased((event) -> {
////            switch (event.getCode()){
////                case RIGHT: imagesPaneP1.getChildren().clear(); imagesPaneP1.getChildren().add(captainAmerica.getFacingRight()); break;
////                case LEFT: imagesPaneP1.getChildren().clear(); imagesPaneP1.getChildren().add(captainAmerica.getFacingLeft()); break;
////                
////                
////            }});
////        
//
////        Timeline t = new Timeline(new KeyFrame(Duration.millis(100), e->{
////            updateGame(imagesPaneP1, imagesPaneP2, grp, healthBar2, healthBar2);
////        }));
////        grp.getChildren().addAll(bckGround,imagesPaneP1,imagesPaneP2,healthBar1,healthBar2);
////        t.play();
//        
//       BattlePane mainGamePane=new BattlePane(bckGround,c1,c2);
//        Scene s = new Scene(mainGamePane,bounds.getWidth(),bounds.getHeight());
//        
//        primaryStage.setScene(s);
//        //primaryStage.setWidth(bounds.getWidth());
//        //primaryStage.setHeight(bounds.getHeight());
//        //primaryStage.setX(bounds.getMinX());
//        //primaryStage.setY(bounds.getMinY());
//        primaryStage.show();
//        mainGamePane.requestFocus();
////        denyFocus.requestFocus();
//    }
    }
//    public void updateGame(Pane imagesPaneP1,Pane imagesPaneP2,Pane grp,Pane healthBar1,Pane healthBar2){
//        if (myKeys.getKeyState(0)&&(!captainAmerica.getJumplock())&&(!captainAmerica.getGetHitlock())) ChampionAnimation.jump(captainAmerica);
//        else if(myKeys.getKeyState(1)&&(!captainAmerica.getGetHitlock())) ChampionAnimation.moveRight(imagesPaneP1, captainAmerica);
//        else if(myKeys.getKeyState(2)&&(!captainAmerica.getGetHitlock())) ChampionAnimation.moveLeft(imagesPaneP1, captainAmerica);
//        else if(myKeys.getKeyState(3)&&(!captainAmerica.getGetHitlock())&&(!captainAmerica.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneP1, captainAmerica,captainAmerica2,(Rectangle)healthBar2.getChildren().get(2),grp,imagesPaneP2);
//
//        if (myKeys.getKeyState(4)&&(!captainAmerica2.getJumplock())&&(!captainAmerica2.getGetHitlock())) ChampionAnimation.jump(captainAmerica2);
//        else if(myKeys.getKeyState(5)&&(!captainAmerica2.getGetHitlock())) ChampionAnimation.moveRight(imagesPaneP2, captainAmerica2);
//        else if(myKeys.getKeyState(6)&&(!captainAmerica2.getGetHitlock())) ChampionAnimation.moveLeft(imagesPaneP2, captainAmerica2);
//        else if(myKeys.getKeyState(7)&&(!captainAmerica2.getGetHitlock())&&(!captainAmerica2.getHitlock())) ChampionAnimation.pauseToHit(imagesPaneP2, captainAmerica2,captainAmerica,(Rectangle)healthBar1.getChildren().get(2),grp,imagesPaneP1);
//
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public static javafx.scene.image.Image loadImage(String path) {
        File file = new File(path);
        System.out.println("Image exists? " + file.exists());
        String imagePath = file.getAbsolutePath();
        System.out.println("Before Imagepath " + imagePath);
        if (File.separatorChar == '\\') {
            // From Windows to Linux/Mac
            imagePath=imagePath.replace('/', File.separatorChar);
            imagePath = imagePath.replace("\\", "\\\\");
        } else {
            // From Linux/Mac to Windows
            imagePath=imagePath.replace('\\', File.separatorChar);

        }
        imagePath="file:"+imagePath;
        System.out.println("After Imagepath " + imagePath);

        return new javafx.scene.image.Image(imagePath);

    }
//    public static void gameOverAnim(Champion c,BattlePane grp){
//        
//        grp.setGameEnd(true);
//        gameOverImg.setFitHeight(300);
//        gameOverImg.setFitWidth(300);
//        gameOverImg.setLayoutX(0);
//        gameOverImg.setLayoutY(0);
//        c.setScore(c.getHealth()*20);
//        if(c.getScore()>Champion.highScore)Champion.highScore=c.getScore();
//        
//        grp.getChildren().add(gameOverImg);
//       Text scorelbl= new Text(c.getName()+" wins!! \n"+"Score: "+c.getScore()+"\nHighest Score: "+Champion.highScore);
////       scorelbl.setLayoutX();
////       scorelbl.setLayoutY(BattlePane.bounds.getMaxY()*1/7);
//       scorelbl.setFont(Font.font(70));
//       scorelbl.setFill(Color.GOLD);
//       scorelbl.setX(gameOverImg.getX()+gameOverImg.getFitWidth()/2);
//       scorelbl.setY(200);
//       
//       
//        ScaleTransition gameOver = new ScaleTransition(Duration.millis(500), gameOverImg);
//        gameOver.setByX(1.5);
//        gameOver.setByY(1.5);
//        gameOver.setCycleCount(10);
//        gameOver.setAutoReverse(true);
//        
//        SequentialTransition sq1 = new SequentialTransition(gameOverImg, gameOver);
//        sq1.play();
//        sq1.setOnFinished(e->{
//        grp.getChildren().add(scorelbl);
//        grp.getChildren().remove(gameOverImg);
//        });
//        
//        
//    }  
//    
//    public void imageCenterCrop(ImageView userImage){
//        double newMeasure = (userImage.getImage().getWidth() < userImage.getImage().getHeight()) ? userImage.getImage().getWidth() : userImage.getImage().getHeight();
//double x = (userImage.getImage().getWidth() - newMeasure) / 2;
//double y = (userImage.getImage().getHeight() - newMeasure) / 2;
//
//Rectangle2D rect = new Rectangle2D  (x, y, newMeasure, newMeasure);
//userImage.setViewport(rect);
//userImage.setFitWidth(captainAmerica.getAvatarWidth());
//userImage.setFitHeight(captainAmerica.getAvatarHeight());
//userImage.setSmooth(true);
//    }
////    
////    public static void pauseToHit1(Pane imagesPane, Champion c,Champion o,Rectangle lifeReact2,Pane maingrp){
////        ImageView left=c.getFacingLeft();
////        int thirdOfHitRange= c.getHitRange()/3;
////        ImageView right = c.getFacingRight();
////        ImageView currentImage, currentImage2,currentImage3 ;
////        if(c.getFacing().equals("Right")){
////            currentImage = new ImageView();
////            currentImage.setImage(c.getHittingRight1().getImage());
////            currentImage.setFitHeight(c.getHeight());
////            currentImage.setFitWidth(c.getWidth());
////            currentImage.setX(right.getX());
////            currentImage.setY(right.getY());
////
////             ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
////             hitting.add(c.getHittingRight1().getImage());
////             hitting.add(c.getHittingRight2().getImage());
////             hitting.add(c.getHittingRight3().getImage());
////             hitting.add(c.getFacingRight().getImage());
////        
////        int index=0;
////        Timeline hit = new Timeline(new KeyFrame(Duration.millis(400), e->{
////            
////            currentImage.setImage(hitting.get(index));
////            hitting.remove(0);
////                }));
////        hit.setCycleCount(hitting.size());
////        imagesPane.getChildren().clear();
////        imagesPane.getChildren().add(currentImage);
////        hit.play();
////
////        }
////        else{
////            currentImage = new ImageView();
////            currentImage.setFitHeight(c.getHeight());
////            currentImage.setFitWidth(c.getWidth());
////            currentImage.setX(left.getX());
////            currentImage.setY(left.getY());
////            currentImage.setImage(c.getHittingLeft1().getImage());
////
////            ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
////             hitting.add(c.getHittingLeft1().getImage());
////             hitting.add(c.getHittingLeft2().getImage());
////             hitting.add(c.getHittingLeft3().getImage());
////             hitting.add(c.getFacingLeft().getImage());
////        
////        int index=0;
////        Timeline hit = new Timeline(new KeyFrame(Duration.millis(400), e->{
////            
////            currentImage.setImage(hitting.get(index));
////            hitting.remove(0);
////                }));
////        hit.setCycleCount(hitting.size());
////        imagesPane.getChildren().clear();
////        imagesPane.getChildren().add(currentImage);
////        hit.play();
////        }
////        
////        
////        
////        checkIfSuccessfulHit1(c, o, lifeReact2,maingrp);
////        
////        
////    }
////    public static void pauseToHit2(Pane imagesPane, Champion c,Champion o,Rectangle lifeReact1,Pane maingrp){
////        ImageView left=c.getFacingLeft();
////        int thirdOfHitRange= c.getHitRange()/3;
////        ImageView right = c.getFacingRight();
////        ImageView currentImage, currentImage2,currentImage3 ;
////        if(c.getFacing().equals("Right")){
////            currentImage = new ImageView();
////            currentImage.setImage(c.getHittingRight1().getImage());
////            currentImage.setFitHeight(c.getHeight());
////            currentImage.setFitWidth(c.getWidth());
////            currentImage.setX(right.getX());
////            currentImage.setY(right.getY());
////
////             ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
////             hitting.add(c.getHittingRight1().getImage());
////             hitting.add(c.getHittingRight2().getImage());
////             hitting.add(c.getHittingRight3().getImage());
////             hitting.add(c.getFacingRight().getImage());
////        int index=0;
////        Timeline hit = new Timeline(new KeyFrame(Duration.millis(400), e->{
////            
////            currentImage.setImage(hitting.get(index));
////            hitting.remove(0);
////                }));
////        hit.setCycleCount(hitting.size());
////        imagesPane.getChildren().clear();
////        imagesPane.getChildren().add(currentImage);
////        hit.play();}
////        else{
////            currentImage = new ImageView();
////            currentImage.setFitHeight(c.getHeight());
////            currentImage.setFitWidth(c.getWidth());
////            currentImage.setX(left.getX());
////            currentImage.setY(left.getY());
////            currentImage.setImage(c.getHittingLeft1().getImage());
////
////            ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
////             hitting.add(c.getHittingLeft1().getImage());
////             hitting.add(c.getHittingLeft2().getImage());
////             hitting.add(c.getHittingLeft3().getImage());
////             hitting.add(c.getFacingLeft().getImage());
////        int index=0;
////        Timeline hit = new Timeline(new KeyFrame(Duration.millis(400), e->{
////            
////            currentImage.setImage(hitting.get(index));
////            hitting.remove(0);
////                }));
////        hit.setCycleCount(hitting.size());
////        imagesPane.getChildren().clear();
////        imagesPane.getChildren().add(currentImage);
////        hit.play();
////            
////        }
////        checkIfSuccessfulHit2(c, o, lifeReact1,maingrp);
////    }
//    
//    public static void moveRight( Pane imagesPane,Champion c){// counter to count how many times he had moved to the right
//        ImageView left=c.getFacingLeft();
//        
//        ImageView right = c.getFacingRight();//
//        if (c.getFacing().equals("Left")){
//            right.setX(left.getX());
//            c.setFacing("Right");
//        }
//        
//        imagesPane.getChildren().clear();
//        imagesPane.getChildren().add(right);
//        for (int i=0;i<10;i++) right.setX(right.getX()+1);
////        int number=10;
////        TranslateTransition moveToRight = new TranslateTransition(Duration.millis(300*c.getSpeed()), right);
////        moveToRight.setByX(number);
////        moveToRight.setCycleCount(1); 
////        moveToRight.setAutoReverse(false); // check why auto reverse
////        
////        SequentialTransition sq1 = new SequentialTransition(right, moveToRight);
////        sq1.play();
//        
//        //System.out.println("programming.semester4.ProgrammingSemester4.moveRight(): X = "+right.getX());
//        //right.setX(right.getX()+number);
//        
//    
//    
//    }
//    
//    public static void moveLeft( Pane imagesPane,Champion c){
//        ImageView left=c.getFacingLeft();
//        
//        ImageView right = c.getFacingRight();//
//        if (c.getFacing().equals("Right")){
//            left.setX(right.getX());
//            c.setFacing("Left");
//        }
//        imagesPane.getChildren().clear();
//        imagesPane.getChildren().add(left);
//       for (int i=0; i<10;i++) left.setX(left.getX()-1);
////        int number=10;
////        TranslateTransition moveToLeft = new TranslateTransition(Duration.millis(300*c.getSpeed()), left);
////        moveToLeft.setByX(-number);
////        moveToLeft.setCycleCount(1); 
////        moveToLeft.setAutoReverse(false); // check why auto reverse
////        
////        SequentialTransition sq1 = new SequentialTransition(left, moveToLeft);
////        sq1.play();
////        System.out.println("programming.semester4.ProgrammingSemester4.moveLeft(): X = "+left.getX());
////        left.setX(left.getX()-number);
//    }
//    
//    public static void jump( Champion c){
//        
//        ImageView jump = new ImageView();
//        
//        if(c.getFacing().equals("Right")){
//            jump = c.getFacingRight();
//        }else{
//            jump = c.getFacingLeft();
//        }
//        
//        
//        
//        TranslateTransition jumping = new TranslateTransition(Duration.millis(300), jump);
//        jumping.setByY(-200);
//        jumping.setCycleCount(2); 
//        jumping.setAutoReverse(true);
//        
//        SequentialTransition sq1 = new SequentialTransition(jump, jumping);
//           sq1.play();
//    }
//    
//    public static void reverseJump(Group grp, Champion c){
//        
//        ImageView jump = new ImageView();
//        
//        if(c.getFacing().equals("Right")){
//            jump = c.getFacingRight();
//        }else{
//            jump = c.getFacingLeft();
//        }
//        
//        
//        TranslateTransition jumping = new TranslateTransition(Duration.millis(550), jump);
//        jumping.setByY(200);
//        jumping.setCycleCount(1); 
//        jumping.setAutoReverse(true);
//        
//        SequentialTransition sq1 = new SequentialTransition(jump, jumping);
//        sq1.play();
//        
//    }
//    public static void jumpLeft(Group grp, Champion c){
//        
//        ImageView facingLeft = c.getFacingLeft();
//        
//        grp.getChildren().add(facingLeft);
//        
//        double xi = facingLeft.getX();
//        double yi = facingLeft.getY();
//        
//        MoveTo m1 = new MoveTo(xi, yi);
//        Path p1 = new Path(m1);
//                
//        CubicCurveTo curve1 = new CubicCurveTo(xi-300, yi-400, xi-300, yi, xi-300,yi); 
//        p1.getElements().add(curve1);
//        
//        PathTransition pt = new PathTransition(Duration.millis(580), p1, facingLeft);
//        pt.setOrientation(PathTransition.OrientationType.NONE);
//        pt.setCycleCount(1);
//        
//        pt.play();
//        
//        
//    }
//    
//    public static void jumpRight(Group grp,Champion c){
//        
//         ImageView facingRight = c.getFacingRight();
//        
//        grp.getChildren().add(facingRight);
//        
//        double xi = facingRight.getX();
//        double yi = facingRight.getY();
//        
//        MoveTo m1 = new MoveTo(xi, yi);
//        Path p1 = new Path(m1);// check is this the starting path?
//                
//        CubicCurveTo curve1 = new CubicCurveTo(xi+300, yi-400, xi+300, yi, xi+300,yi); 
//        p1.getElements().add(curve1);
//        
//        PathTransition pt = new PathTransition(Duration.millis(580), p1, facingRight);
//        pt.setOrientation(PathTransition.OrientationType.NONE);
//        pt.setCycleCount(1);
//        
//        pt.play();
//        
//        
//    }
//    
//    public static void hitRight(Group grp1, Champion c){
//        
////        moveRight(grp1, c);
////        pauseToHit(grp1, c);
//  //      moveLeft(grp1, c);
//               
//        
//    }
////    
////    public static void checkIfSuccessfulHit1(Champion c,Champion o,Rectangle lifeReact2, Pane maingrp){
////        int hitRange= c.getHitRange();// N is the dminesion pof the player
////        if (c.getFacing().equals("Right")&&o.getFacing().equals("Right")){
////            
////            if (Math.abs(o.getFacingRight().getX()-c.getFacingRight().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////             if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            
////            }
////    }
////        if (c.getFacing().equals("Right")&&o.getFacing().equals("Left")){
////            if (Math.abs(o.getFacingLeft().getX()-c.getFacingRight().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////        if (c.getFacing().equals("Left")&&o.getFacing().equals("Right")){
////            if (Math.abs(o.getFacingRight().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////        if (c.getFacing().equals("Left")&&o.getFacing().equals("Left")){
////            if (Math.abs(o.getFacingLeft().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////}
////public static void checkIfSuccessfulHit2(Champion c,Champion o,Rectangle lifeReact1,Pane maingrp){
////        int hitRange= c.getHitRange(); // N is the dimension of the player
////        if (c.getFacing().equals("Right")&&o.getFacing().equals("Right")){
////            if (Math.abs(o.getFacingRight().getX()-c.getFacingRight().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact1.setWidth(o.getHealth()*4);
////
////             if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            
////            }
////    }
////        if (c.getFacing().equals("Right")&&o.getFacing().equals("Left")){
////            if (Math.abs(o.getFacingLeft().getX()-c.getFacingRight().getX())<hitRange){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////
////             lifeReact1.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////        if (c.getFacing().equals("Left")&&o.getFacing().equals("Right")){
////            if (Math.abs(o.getFacingRight().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact1.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////        if (c.getFacing().equals("Left")&&o.getFacing().equals("Left")){
////            if (Math.abs(o.getFacingLeft().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact1.setWidth(o.getHealth()*4);
////            if(o.checkIfDead()){
////                 gameOverAnim(maingrp);
////             }
////            }
////    }
////}
//    
//    
//    /*  **  extra code
//    
//    
//    public void movePosition(int x){
//        this.position.add(x, 0);
//    }
//    
//    //we can create an array of weapons 
//    //so we can call the boostPower method and send different values depending on the weapon
//    public void setWeapon(int weapon){
//        this.weapon=weapon;
//    }
//    
//    public void jump(int x,int y){
//        this.position.add(x,y);
//    }
//    
//    public void BoostPower(int extraPower){
//        this.power+=extraPower;
//    }
//    
//    public int getJumpValue(){
//        return this.jumpValue;
//    }
//    public void crouch(int x,int y){
//        this.position.add(x, y);
//    }
//    
//    public void setOrientation(String s){
//        this.orientation=s;
//    }
//    
//    public String getOrientation(){
//        return this.orientation;
//    }
//    
//    public double GetRangeHit(){
//        return this.rangeHit;
//    }
//    
//    public void setRangeHit(double rangeHit){
//        this.rangeHit=rangeHit;
//    }
//    */
//
//
////
////
////
/////*
////class Setting {
////    
////    private int bgpic;
////    private int bgmusic;
////    private int minDim, maxDim;
////    
////    public Setting(int pic, int music,int mind,int maxd )
////    {
////        this.bgpic= pic;
////        this.bgmusic= music;
////        this.minDim= mind;
////        this.maxDim= maxd;
////    }
////
////    public int getBgpic() {
////        return bgpic;
////    }
////
////    public void setBgpic(int bgpic) {
////        this.bgpic = bgpic;
////    }
////
////    /**
////     * @return the bgmusic
////     */
////    /*public int getBgmusic() {
////        return bgmusic;
////    }
////
////    /**
////     * @param bgmusic the bgmusic to set
////     */
////    /*public void setBgmusic(int bgmusic) {
////        this.bgmusic = bgmusic;
////    }
////
////    /**
////     * @return the minDim
////     */
////    public int getMinDim() {
////        return minDim;
////    }
////
////    /**
////     * @param minDim the minDim to set
////     */
////    public void setMinDim(int minDim) {
////        this.minDim = minDim;
////    }
////
////    /**
////     * @return the maxDim
////     */
////    public int getMaxDim() {
////        return maxDim;
////    }
////
////    /**
////     * @param maxDim the maxDim to set
////     */
////    public void setMaxDim(int maxDim) {
////        this.maxDim = maxDim;
////    }
////    
////}
////
////*/
////
//
//
//
//
//
//class Tester extends ProgrammingSemester4 {
//    
//    /**
//            //***          FUNCTIONS       ***\\
//     */
////    
////    public void gameOverAnim(Group grp, ImageView im){
////        
////        //Image m1 = new Image(new FileInputStream("E:/uni/programing project/gameover.png"));
////        //ImageView im = new ImageView(m1);
////        
////        grp.getChildren().add(im);
////        
////        ScaleTransition gameOver = new ScaleTransition(Duration.millis(500), im);
////        gameOver.setByX(1.5);
////        gameOver.setByY(1.5);
////        gameOver.setCycleCount(10);
////        gameOver.setAutoReverse(true);
////        
////        SequentialTransition sq1 = new SequentialTransition(im, gameOver);
////        sq1.play();
////        
////        
////    }    
////    
////    public void pauseToHit(Group grp, Champion c){
////        
////        ImageView currentImage = new ImageView();
////        if(c.getFacing().equals("Right")){
////            currentImage = c.getHittingRight();
////        }else{
////            currentImage = c.getHittingRight();
////        }
////        
////        grp.getChildren().clear();
////        grp.getChildren().add(currentImage);
////        
////        double xi = currentImage.getX();
////        double yi = currentImage.getY();
////        
////        MoveTo m1 = new MoveTo(xi, yi);
////        Path p1 = new Path(m1);
////       
////        PathTransition pt = new PathTransition(Duration.millis(10000), p1, currentImage);
////        pt.setOrientation(PathTransition.OrientationType.NONE);
////        pt.setCycleCount(1);
////        
////        pt.play();
////        
////    }
////    
////    public void moveRight(Group grp, Champion c){
////        
////        ImageView tmp = c.getFacingRight();//
////        
////        grp.getChildren().clear();
////        grp.getChildren().add(tmp);
////        
////        TranslateTransition moveToRight = new TranslateTransition(Duration.millis(900 * c.getSpeed()), tmp);
////        moveToRight.setByX(100);
////        moveToRight.setCycleCount(1); 
////        moveToRight.setAutoReverse(true); // check why auto reverse
////        
////        SequentialTransition sq1 = new SequentialTransition(tmp, moveToRight);
////        sq1.play();
////        
////    }
////    
////    public void moveLeft(Group grp, Champion c){
////        
////        ImageView facingLeft = c.getFacingLeft();
////        grp.getChildren().add(facingLeft);
////        
////        TranslateTransition moveToLeft = new TranslateTransition(Duration.millis(900), facingLeft);
////        moveToLeft.setByX(-100);
////        moveToLeft.setCycleCount(1); 
////        moveToLeft.setAutoReverse(true);
////        
////        SequentialTransition sq1 = new SequentialTransition(facingLeft, moveToLeft);
////        sq1.play();
////        
////    }
////    
////    public void jump(Group grp, Champion c){
////        
////        ImageView jump = new ImageView();
////        
////        if(c.getFacing().equals("right")){
////            jump = c.getFacingRight();
////        }else{
////            jump = c.getFacingLeft();
////        }
////        
////        grp.getChildren().add(jump);
////        
////        TranslateTransition jumping = new TranslateTransition(Duration.millis(550), jump);
////        jumping.setByY(-400);
////        jumping.setCycleCount(2); 
////        jumping.setAutoReverse(true);
////        
////        SequentialTransition sq1 = new SequentialTransition(jump, jumping);
////        sq1.play();
////        
////    }
////    
////    public void jumpLeft(Group grp, Champion c){
////        
////        ImageView facingLeft = c.getFacingLeft();
////        
////        grp.getChildren().add(facingLeft);
////        
////        double xi = facingLeft.getX();
////        double yi = facingLeft.getY();
////        
////        MoveTo m1 = new MoveTo(xi, yi);
////        Path p1 = new Path(m1);
////                
////        CubicCurveTo curve1 = new CubicCurveTo(xi-300, yi-400, xi-300, yi, xi-300,yi); 
////        p1.getElements().add(curve1);
////        
////        PathTransition pt = new PathTransition(Duration.millis(580), p1, facingLeft);
////        pt.setOrientation(PathTransition.OrientationType.NONE);
////        pt.setCycleCount(1);
////        
////        pt.play();
////        
////        
////    }
////    
////    public void jumpRight(Group grp,Champion c){
////        
////         ImageView facingRight = c.getFacingRight();
////        
////        grp.getChildren().add(facingRight);
////        
////        double xi = facingRight.getX();
////        double yi = facingRight.getY();
////        
////        MoveTo m1 = new MoveTo(xi, yi);
////        Path p1 = new Path(m1);// check is this the starting path?
////                
////        CubicCurveTo curve1 = new CubicCurveTo(xi+300, yi-400, xi+300, yi, xi+300,yi); 
////        p1.getElements().add(curve1);
////        
////        PathTransition pt = new PathTransition(Duration.millis(580), p1, facingRight);
////        pt.setOrientation(PathTransition.OrientationType.NONE);
////        pt.setCycleCount(1);
////        
////        pt.play();
////        
////        
////    }
////    
////    public void hitRight(Group grp1, Champion c){
////        
////        moveRight(grp1, c);
////        pauseToHit(grp1, c);
////        moveLeft(grp1, c);
////               
////        
////    }
////    
////    
////    //public void InitiateChampions() throws FileNotFoundException{}
////    
////    
////    
////    /**
////            //***                ***\\
////     */
////    
//////    @Override
//////    public void start(Stage primaryStage) throws FileNotFoundException {
//////       
//////        //^^^^^^^^^^^ initializing the champion - function above did not work ^^^^^^^^^
//////        
//////        Image fr = new Image(new FileInputStream("E:/uni/programing project/champion images/aryastark.png"));
//////        Image fl = new Image(new FileInputStream("E:/uni/programing project/champion images/aryastark facing left.png"));
//////        Image hr = new Image(new FileInputStream("E:/uni/programing project/champion images/aryastark attack right.png"));
//////        Image hl = new Image(new FileInputStream("E:/uni/programing project/champion images/aryastark attack left.png"));
//////        Champion aryaStark = new Champion("Arya Stark", 7, 1.5);
//////        aryaStark.setAnimSkins(new ImageView(fr), new ImageView(fl), new ImageView(hr), new ImageView(hl));
////        
//////        fr = new Image(new FileInputStream("E:/uni/programing project/champion images/branandhodor right.png"));
//////        fl = new Image(new FileInputStream("E:/uni/programing project/champion images/branandhodor left.png"));
//////        hr = new Image(new FileInputStream("E:/uni/programing project/champion images/branandhodor attack right.png"));
//////        hl = new Image(new FileInputStream("E:/uni/programing project/champion images/branandhodor attack left.png"));
//////        Champion hodor = new Champion("Hodor", 9, 0.8);
//////        hodor.setAnimSkins(new ImageView(fr), new ImageView(fl), new ImageView(hr), new ImageView(hl));
//////        
//////        
//////        fr = new Image(new FileInputStream("E:/uni/programing project/champion images/daenerys right.png"));
//////        fl = new Image(new FileInputStream("E:/uni/programing project/champion images/daenerys left.png"));
//////        hr = new Image(new FileInputStream("E:/uni/programing project/champion images/daenerys attack right.png"));
//////        hl = new Image(new FileInputStream("E:/uni/programing project/champion images/daenerys attack left.png"));
//////        Champion daenerys = new Champion("Daenerys", 11, 0.9);
//////        daenerys.setAnimSkins(new ImageView(fr), new ImageView(fl), new ImageView(hr), new ImageView(hl));
//////        
//////        
//////        fr = new Image(new FileInputStream("E:/uni/programing project/champion images/joffre right.png"));
//////        fl = new Image(new FileInputStream("E:/uni/programing project/champion images/joffre left.png"));
//////        hr = new Image(new FileInputStream("E:/uni/programing project/champion images/joffrey attack right.png"));
//////        hl = new Image(new FileInputStream("E:/uni/programing project/champion images/joffrey attack left.png"));
//////        Champion joffrey = new Champion("Joffrey Baratheon", 6, 0.9);
//////        joffrey.setAnimSkins(new ImageView(fr), new ImageView(fl), new ImageView(hr), new ImageView(hl));
//////        
//////        fr = new Image(new FileInputStream("E:/uni/programing project/champion images/jonsnow right.png"));
//////        fl = new Image(new FileInputStream("E:/uni/programing project/champion image;
////    
//}
}