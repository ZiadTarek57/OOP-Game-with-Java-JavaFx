package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
//import static project.ProgrammingSemester4.gameOverAnim;


public class ChampionAnimation  {
    
    
    
    public static void pauseToHit(Pane imagesPane, Champion c,Champion o,Rectangle lifeReact2,BattlePane maingrp,Pane oImagesPane){

        int thirdOfHitRange= c.getHitRange()/3;
        String s= new File("punch 1.mp3").toURI().toString(); // check with Fatema and Mariam
       MediaPlayer media=new MediaPlayer(new Media(s));
       media.play();


        ImageView left=c.getFacingLeft();
        ImageView right = c.getFacingRight();
        
        ImageView currentImage;
        
        
        if(c.getFacing().equals("Right")){
            currentImage = new ImageView();
            currentImage.setImage(c.getHittingRight1().getImage());
            currentImage.setFitHeight(c.getHeight());
            currentImage.setFitWidth(c.getWidth());
            currentImage.setX(right.getX());
            //if (c.getName().equals("Black Widow"))currentImage.setY(right.getY()+180);
            //else 
            currentImage.setY(right.getY());

             ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
             hitting.add(c.getHittingRight1().getImage());
             hitting.add(c.getHittingRight2().getImage());
             hitting.add(c.getHittingRight3().getImage());
             hitting.add(c.getHittingRight3().getImage());

             //hitting.add(c.getFacingRight().getImage()); 
             
             
        
        Timeline hit = new Timeline(new KeyFrame(Duration.millis(300), e->{
            
            currentImage.setImage(hitting.get(0));
            hitting.remove(0);
            if(!c.getHitlock())checkIfSuccessfulHit(c, o, lifeReact2,maingrp,oImagesPane);

            currentImage.setX(currentImage.getX()+thirdOfHitRange);
                    c.setHitlock(true);

                }));
        hit.setCycleCount(hitting.size());
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(currentImage);
        hit.play();

        hit.setOnFinished(e->{
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(right);
        c.setHitlock(false);
        
        });
        
        }
        else{
            currentImage = new ImageView();
            currentImage.setFitHeight(c.getHeight());
            currentImage.setFitWidth(c.getWidth());
            currentImage.setX(left.getX()-3*thirdOfHitRange);
            //if (c.getName().equals("Black Widow"))currentImage.setY(right.getY()+180);
            //else
            currentImage.setY(right.getY());
            currentImage.setImage(c.getHittingLeft1().getImage());

            ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
             hitting.add(c.getHittingLeft1().getImage());
             hitting.add(c.getHittingLeft2().getImage());
             hitting.add(c.getHittingLeft3().getImage());
             hitting.add(c.getHittingLeft3().getImage());

             //hitting.add(c.getFacingLeft().getImage());
        
        Timeline hit = new Timeline(new KeyFrame(Duration.millis(300), e->{
            
            currentImage.setImage(hitting.get(0));
            hitting.remove(0);
            if(!c.getHitlock())checkIfSuccessfulHit(c, o, lifeReact2,maingrp,oImagesPane);

            currentImage.setX(currentImage.getX()-thirdOfHitRange);
            c.setHitlock(true);
                }));
        hit.setCycleCount(hitting.size());
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(currentImage);
        hit.play();
        

        hit.setOnFinished(e->{
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(left);
        c.setHitlock(false);
        });

        }
        

        
        
        
    }
    public static void pauseToHit2(Pane imagesPane, Champion c,Champion o,Rectangle lifeReact1,BattlePane maingrp,Pane oImagesPane){
        int thirdOfHitRange= c.getHitRange()/3;


        ImageView left=c.getFacingLeft();
        ImageView right = c.getFacingRight();
        
        ImageView currentImage;
        
        
        if(c.getFacing().equals("Right")){
            int x= (int)right.getX();
            int y= (int)right.getY();
            currentImage = new ImageView();
            currentImage.setImage(c.getHittingRight1().getImage());
            currentImage.setFitHeight(c.getHeight());
            currentImage.setFitWidth(c.getWidth());
            currentImage.setX(right.getX());
            if (c.getName().equals("Black Widow"))currentImage.setY(right.getY()+180);
            else currentImage.setY(right.getY());
             ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
             hitting.add(c.getHittingRight1().getImage());
             hitting.add(c.getHittingRight2().getImage());
             hitting.add(c.getHittingRight3().getImage());
             hitting.add(c.getFacingRight().getImage()); 
             
             
        
        Timeline hit = new Timeline(new KeyFrame(Duration.millis(300), e->{
            
            currentImage.setImage(hitting.get(0));
            hitting.remove(0);
            currentImage.setX(currentImage.getX()+thirdOfHitRange);
                }));
        hit.setCycleCount(hitting.size());
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(currentImage);
        hit.play();
        
        c.setHitlock(true);
        checkIfSuccessfulHit(c, o, lifeReact1,maingrp,oImagesPane);

        hit.setOnFinished(e->{
        
        c.setHitlock(false);
        });
        }
        else{
            currentImage = new ImageView();
            currentImage.setFitHeight(c.getHeight());
            currentImage.setFitWidth(c.getWidth());
            currentImage.setX(left.getX()-3*thirdOfHitRange);
            currentImage.setY(left.getY());
            currentImage.setImage(c.getHittingLeft1().getImage());

            ArrayList<javafx.scene.image.Image> hitting = new ArrayList<javafx.scene.image.Image>();
             hitting.add(c.getHittingLeft1().getImage());
             hitting.add(c.getHittingLeft2().getImage());
             hitting.add(c.getHittingLeft3().getImage());
             hitting.add(c.getFacingLeft().getImage());
        
        Timeline hit = new Timeline(new KeyFrame(Duration.millis(300), e->{
            
            currentImage.setImage(hitting.get(0));
            hitting.remove(0);
            currentImage.setX(currentImage.getX()-thirdOfHitRange);

                }));
        hit.setCycleCount(hitting.size());
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(currentImage);
        hit.play();
        
        c.setHitlock(true);
        checkIfSuccessfulHit(c, o, lifeReact1,maingrp,oImagesPane);

        hit.setOnFinished(e->{
        
        c.setHitlock(false);
        });

        }
        

       //checkIfSuccessfulHit(c, o, lifeReact1,maingrp,oImagesPane);
    }
    
    public static void moveRight( Pane imagesPane,Champion c){// counter to count how many times he had moved to the right
        ImageView left=c.getFacingLeft();
        
        ImageView right = c.getFacingRight();
        ImageView movingright =c.getMovingRight();
//
        if (c.getFacing().equals("Left")){
            movingright.setX(left.getX());
            //if (c.getName().equals("Black Widow"))movingright.setY(right.getY()+180);
            //else
            movingright.setY(left.getY());
            c.setFacing("Right");
        }else{
            movingright.setX(right.getX());
            //if (c.getName().equals("Black Widow"))movingright.setY(right.getY()+180);
            //else
            movingright.setY(right.getY());        }
        
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(movingright);
        
        //for(int i=0;i<10;i++){
        if (movingright.getX()-movingright.getFitWidth()+20<800){
        Timeline t = new Timeline(new KeyFrame(Duration.millis(50), e->{
            movingright.setX(movingright.getX()+20);
            right.setX(movingright.getX()+20);
        }));
            t.setCycleCount(1);
            t.play();
            c.setmoveRightlock(true);
            t.setOnFinished(e->{
            c.setmoveRightlock(false);
            });
    }
        //}
//        
//        imagesPane.getChildren().clear();
//        imagesPane.getChildren().add(right);
//        ImageView movingright = c.getMovingRight();
//        double xbeforeanim= right.getX();
//        double ybeforeanim= right.getY();
//        movingright.setX(xbeforeanim);
//        movingright.setY(ybeforeanim);
//        ArrayList<ImageView> imgs= new ArrayList<>();
//        imgs.add(movingright);
//        imgs.add(right);
//        Timeline mright = new Timeline(new KeyFrame(Duration.millis(100), e->{
//                    imagesPane.getChildren().clear();
//                    imagesPane.getChildren().add(imgs.get(0));
//                    int number=10;
//                    TranslateTransition moveToRight = new TranslateTransition(Duration.millis(300), imgs.get(0));
//                    moveToRight.setByX(number);
//                    moveToRight.setCycleCount(1); 
//                    moveToRight.setAutoReverse(false); // check why auto reverse
//
//                    SequentialTransition sq1 = new SequentialTransition(imgs.get(0), moveToRight);
//                    sq1.play();
//                    
//                    imgs.get(0).setX(xbeforeanim+10);
//                    imgs.remove(0);
//
//        }));
//        
//        mright.setCycleCount(2);
//        mright.play();
//        c.setmoveRightlock(true);
//        
//        mright.setOnFinished(e->{
//            right.setX(xbeforeanim+20);
//            right.setY(ybeforeanim);
//            imagesPane.getChildren().clear();
//            imagesPane.getChildren().add(right);
//            c.setmoveRightlock(false);
//        });
//        int number=10;
//        TranslateTransition moveToRight = new TranslateTransition(Duration.millis(300*c.getSpeed()), right);
//        moveToRight.setByX(number);
//        moveToRight.setCycleCount(1); 
//        moveToRight.setAutoReverse(false); // check why auto reverse
//        
//        SequentialTransition sq1 = new SequentialTransition(right, moveToRight);
//        sq1.play();
        
        //System.out.println("programming.semester4.ProgrammingSemester4.moveRight(): X = "+right.getX());
        //right.setX(right.getX()+number);
        
    
    
    }
    
    public static void moveLeft( Pane imagesPane,Champion c){
        ImageView left=c.getFacingLeft();
        
        ImageView right = c.getFacingRight();
        ImageView movingleft =c.getMovingLeft();
//
        if (c.getFacing().equals("Right")){
            movingleft.setX(right.getX());
            //if (c.getName().equals("Black Widow"))movingleft.setY(right.getY()+180);
            //else
            movingleft.setY(right.getY());        
            c.setFacing("Left");
        }else{
            movingleft.setX(left.getX());
            //if (c.getName().equals("Black Widow"))movingleft.setY(right.getY()+180);
            //else
            movingleft.setY(right.getY());        }
        
        
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(movingleft);
        
        //for(int i=0;i<10;i++){
if (movingleft.getX()-20>0){        Timeline t = new Timeline(new KeyFrame(Duration.millis(50), e->{
            movingleft.setX(movingleft.getX()-20);
            left.setX(movingleft.getX()-20);
                       // right.setX(right.getX()-10);

        }));
            t.setCycleCount(1);
            t.play();
            c.setmoveLeftlock(true);
            t.setOnFinished(e->{
            c.setmoveLeftlock(false);
            });}
//        int number=10;
//        TranslateTransition moveToLeft = new TranslateTransition(Duration.millis(300*c.getSpeed()), left);
//        moveToLeft.setByX(-number);
//        moveToLeft.setCycleCount(1); 
//        moveToLeft.setAutoReverse(false); // check why auto reverse
//        
//        SequentialTransition sq1 = new SequentialTransition(left, moveToLeft);
//        sq1.play();
//        System.out.println("programming.semester4.ProgrammingSemester4.moveLeft(): X = "+left.getX());
//        left.setX(left.getX()-number);
    }
    
    // if there's error check these classes
    static class RaiseImg implements EventHandler<ActionEvent>{
        private ImageView imgV;
        public RaiseImg(ImageView img){
            imgV=img;
        }
        
        @Override
        public void handle(ActionEvent e){
            imgV.setY(imgV.getY()-300);

        }

    }
    static class LowerImg implements EventHandler<ActionEvent>{
        private ImageView imgV;
        public LowerImg(ImageView img){
            imgV=img;
        }
        
        @Override
        public void handle(ActionEvent e){
            imgV.setY(imgV.getY()+300);

        }

    }
    public static void jump( Champion c){
        
            ImageView jump = new ImageView();
            
            if(c.getFacing().equals("Right")){
                jump = c.getFacingRight();
            }else{
                jump = c.getFacingLeft();
            }
            RaiseImg r =new RaiseImg(jump);
            LowerImg l = new LowerImg(jump);
            
            TranslateTransition jumping = new TranslateTransition(Duration.millis(400), jump);
            jumping.setByY(-300);
            jumping.setCycleCount(2);
            jumping.setAutoReverse(true);
            SequentialTransition sq1 = new SequentialTransition(jump, jumping);
            sq1.play();
            c.setJumplock(true);

//            Timeline j = new Timeline(new KeyFrame(Duration.millis(400), r));
//            j.setCycleCount(1);
            
            
            //synchronized(jump.getImage()){
            //j.play();
            sq1.setOnFinished(e->{
                c.setJumplock(false);
            });
            
//            d.setOnFinished(e->{
//                System.out.println("ana 5lst");
//            });}
        

    }
    
    public static void reverseJump(Group grp, Champion c){
        
        ImageView jump = new ImageView();
        
        if(c.getFacing().equals("Right")){
            jump = c.getFacingRight();
        }else{
            jump = c.getFacingLeft();
        }
        
        
        TranslateTransition jumping = new TranslateTransition(Duration.millis(550), jump);
        jumping.setByY(200);
        jumping.setCycleCount(1); 
        jumping.setAutoReverse(true);
        
        SequentialTransition sq1 = new SequentialTransition(jump, jumping);
        sq1.play();
        
    }
    public static void jumpLeft(Pane imagesPane, Champion c){
        int x,y;
        ImageView left=c.getFacingLeft();
        ImageView right = c.getFacingRight();//
        if (c.getFacing().equals("Right")){
            left.setX(right.getX());
            left.setY(right.getY());
            
            c.setFacing("Left");
        }
        x=(int)left.getX();
        y=(int)left.getY();
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(left);
        
        double xi = left.getX()+Champion.getWidth()/2;
        double yi = left.getY()+Champion.getHeight()/2;
        
        MoveTo m1 = new MoveTo(xi, yi);
        Path p1 = new Path(m1);
                
        CubicCurveTo curve= new CubicCurveTo(xi, yi, xi-100, yi-900, xi-200, yi); 
        p1.getElements().add(curve);
        
        PathTransition pt = new PathTransition(Duration.millis(1000), p1, left);
        pt.setOrientation(PathTransition.OrientationType.NONE);
        pt.setCycleCount(1);
        pt.play();
        
        pt.setOnFinished(e->{
        left.setX(x-200);
        left.setY(y);
        c.setJumpLeftlock(false);
        
        });
        
//        TranslateTransition translation = new TranslateTransition(Duration.millis(500), left);
//        translation.interpolatorProperty().set(Interpolator);
//        translation.setByY(-500);
//        translation.setAutoReverse(true);
//        translation.setCycleCount(2);
//        translation.play();
//        
    }
    
    public static void jumpRight(Pane imagesPane,Champion c){
        
        int x,y;
        ImageView left=c.getFacingLeft();
        ImageView right = c.getFacingRight();//
        if (c.getFacing().equals("Left")){
            right.setX(left.getX());
            right.setY(left.getY());
            
            c.setFacing("Right");
        }
        x=(int)right.getX();
        y=(int)right.getY();
        imagesPane.getChildren().clear();
        imagesPane.getChildren().add(right);
        
        double xi = right.getX()+Champion.getWidth()/2;
        double yi = right.getY()+Champion.getHeight()/2;
        
        MoveTo m1 = new MoveTo(xi, yi);
        Path p1 = new Path(m1);
                
        CubicCurveTo curve= new CubicCurveTo(xi, yi, xi+100, yi-900, xi+200, yi); 
        p1.getElements().add(curve);
        
        PathTransition pt = new PathTransition(Duration.millis(1000), p1, right);
        pt.setOrientation(PathTransition.OrientationType.NONE);
        pt.setCycleCount(1);
        System.out.println("programming.semester4.ChampionAnimation.jumpRight():"+pt.getStatus());
        //if((pt.getStatus()).equals(Animation.Status.STOPPED)){
            
            pt.play();

        c.setJumpRightlock(true);
        pt.setOnFinished(e->{
        right.setX(x+50);
        right.setY(y);
        left.setX(x+50);
        left.setY(y);
        c.setJumpRightlock(false);
        });
        
        //}
        
        
        
        
//         ImageView facingRight = c.getFacingRight();
//        
//        imagesPane.getChildren().clear();
//        imagesPane.getChildren().add(facingRight);
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
        
    }
    public static boolean checkIfNotJumping(Champion c){
        return(!(c.getJumpLeftlock()||c.getJumpRightlock()||c.getJumplock()));
    }
    
//   public static void hitRight(Group grp1, Champion c){
//          moveRight(grp1, c);
//        pauseToHit(grp1, c);
//        moveLeft(grp1, c);
//           }
    
    public static void checkIfSuccessfulHit(Champion c,Champion o,Rectangle lifeReact2, BattlePane maingrp,Pane oImagesPane){
        int hitRange= c.getHitRange();// N is the dminesion pof the player
        String s= new File("ahh.aiff").toURI().toString(); // check with Fatema and Mariam
       MediaPlayer media=new MediaPlayer(new Media(s));
       
        if (c.getFacing().equals("Right")&&o.getFacing().equals("Right")){
            
            if (checkIfNotJumping(o)&&(Math.abs(o.getFacingRight().getX()-c.getFacingRight().getX())<hitRange+Champion.getWidth()*3/3)){// check within hit range
             media.play();
             o.setHealth(o.getHealth()-c.getPower());
             lifeReact2.setWidth(o.getHealth()*4);
             c.setScore((int)c.getPower()*1000);
             
             ArrayList<ImageView> gettingHit= new ArrayList<>();
             gettingHit.add(o.getGettingHitRight());
             
             gettingHit.add(o.getFacingRight());
             gettingHit.get(0).setX(c.getFacingRight().getX()+5*c.getHitRange());
             Timeline getHit = new Timeline(new KeyFrame(Duration.millis(600), e->{
             oImagesPane.getChildren().clear();
             oImagesPane.getChildren().add(gettingHit.get(0));
             gettingHit.remove(0);
             
             }));
             getHit.setCycleCount(2);
             getHit.play();
             o.setGetHitlock(true);
             getHit.setOnFinished(e->{
                          o.setGetHitlock(false);

             });
             
             
//             if(o.checkIfDead()){
//                 gameOverAnim(c,maingrp);
//             }
//            
            }
    }
        if (c.getFacing().equals("Right")&&o.getFacing().equals("Left")){
            if (checkIfNotJumping(o)&&Math.abs(o.getFacingLeft().getX()-c.getFacingRight().getX())<hitRange+Champion.getWidth()*3/3){// check within hit range
             media.play();
                o.setHealth(o.getHealth()-c.getPower());
             lifeReact2.setWidth(o.getHealth()*4);
             c.setScore((int)c.getPower()*1000);
             
             ArrayList<ImageView> gettingHit= new ArrayList<>();
             gettingHit.add(o.getGettingHitRight());
             gettingHit.add(o.getFacingLeft());
             
             gettingHit.get(0).setX(c.getFacingRight().getX()+5*c.getHitRange());
             Timeline getHit = new Timeline(new KeyFrame(Duration.millis(600), e->{
             oImagesPane.getChildren().clear();
             oImagesPane.getChildren().add(gettingHit.get(0));
             gettingHit.remove(0);
             
             }));
             getHit.setCycleCount(2);
             getHit.play();
             o.setGetHitlock(true);
             getHit.setOnFinished(e->{
                          o.setGetHitlock(false);

             });
//            if(o.checkIfDead()){
//                 gameOverAnim(c,maingrp);
//             }
            }
    }
        if (c.getFacing().equals("Left")&&o.getFacing().equals("Right")){
            if (checkIfNotJumping(o)&&Math.abs(o.getFacingRight().getX()-c.getFacingLeft().getX())<hitRange+Champion.getWidth()*3/4){// check within hit range
             media.play();
                o.setHealth(o.getHealth()-c.getPower());
             lifeReact2.setWidth(o.getHealth()*4);
             c.setScore((int)c.getPower()*1000);
             
             ArrayList<ImageView> gettingHit= new ArrayList<>();
             gettingHit.add(o.getGettingHitLeft());
             gettingHit.add(o.getFacingRight());
             
             gettingHit.get(0).setX(c.getFacingLeft().getX()-5*c.getHitRange());
             Timeline getHit = new Timeline(new KeyFrame(Duration.millis(600), e->{
             oImagesPane.getChildren().clear();
             oImagesPane.getChildren().add(gettingHit.get(0));
             gettingHit.remove(0);
             
             }));
             getHit.setCycleCount(2);
             getHit.play();
             o.setGetHitlock(true);
             getHit.setOnFinished(e->{
                          o.setGetHitlock(false);

             });
//            if(o.checkIfDead()){
//                 gameOverAnim(c,maingrp);
//             }
            }
    }
        if (c.getFacing().equals("Left")&&o.getFacing().equals("Left")){
            if (checkIfNotJumping(o)&&Math.abs(o.getFacingLeft().getX()-c.getFacingLeft().getX())<hitRange+Champion.getWidth()*3/4){// check within hit range
             media.play();
                o.setHealth(o.getHealth()-c.getPower());
             lifeReact2.setWidth(o.getHealth()*4);
             c.setScore((int)c.getPower()*1000);
             
             ArrayList<ImageView> gettingHit= new ArrayList<>();
             gettingHit.add(o.getGettingHitLeft());
             gettingHit.add(o.getFacingLeft());
             
             gettingHit.get(0).setX(c.getFacingLeft().getX()-5*c.getHitRange());
             Timeline getHit = new Timeline(new KeyFrame(Duration.millis(600), e->{
             oImagesPane.getChildren().clear();
             oImagesPane.getChildren().add(gettingHit.get(0));
             gettingHit.remove(0);
             
             }));
             getHit.setCycleCount(2);
             getHit.play();
             o.setGetHitlock(true);
             getHit.setOnFinished(e->{
                          o.setGetHitlock(false);

             });
//            if(o.checkIfDead()){
//                 gameOverAnim(c,maingrp);
//             }
            }
    }
}
//public static void checkIfSuccessfulHit2(Champion c,Champion o,Rectangle lifeReact1,Pane maingrp,Pane oImagesPane){
//        int hitRange= c.getHitRange(); // N is the dimension of the player
//        if (c.getFacing().equals("Right")&&o.getFacing().equals("Right")){
//            if (Math.abs(o.getFacingRight().getX()-c.getFacingRight().getX())<hitRange+100){// check within hit range
//             o.setHealth(o.getHealth()-c.getPower());
//             lifeReact1.setWidth(o.getHealth()*4);
//
//             if(o.checkIfDead()){
//                 gameOverAnim(maingrp);
//             }
//            
//            }
//    }
//        if (c.getFacing().equals("Right")&&o.getFacing().equals("Left")){
//            if (Math.abs(o.getFacingLeft().getX()-c.getFacingRight().getX())<hitRange){// check within hit range
//             o.setHealth(o.getHealth()-c.getPower());
//
//             lifeReact1.setWidth(o.getHealth()*4);
//            if(o.checkIfDead()){
//                 gameOverAnim(maingrp);
//             }
//            }
//    }
//        if (c.getFacing().equals("Left")&&o.getFacing().equals("Right")){
//            if (Math.abs(o.getFacingRight().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
//             o.setHealth(o.getHealth()-c.getPower());
//             lifeReact1.setWidth(o.getHealth()*4);
//            if(o.checkIfDead()){
//                 gameOverAnim(maingrp);
//             }
//            }
//    }
//        if (c.getFacing().equals("Left")&&o.getFacing().equals("Left")){
//            if (Math.abs(o.getFacingLeft().getX()-c.getFacingLeft().getX())<hitRange+100){// check within hit range
//             o.setHealth(o.getHealth()-c.getPower());
//             lifeReact1.setWidth(o.getHealth()*4);
//            if(o.checkIfDead()){
//                 gameOverAnim(maingrp);
//             }
//            }
//    }
//    
//}
}
