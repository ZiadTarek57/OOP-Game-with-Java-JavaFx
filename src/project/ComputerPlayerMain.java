/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.concurrent.TimeUnit;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author GO
 */
/*public class ComputerPlayer {   // should extend Player
    
    private int Level;
    private Champion championSelected;
    private boolean hitNow=false;
    public ComputerPlayer(int Level, Champion championSelected) {
        this.Level = Level;
        this.championSelected = championSelected;
    }

    public void automatedPlay(Player opponent, Setting map){
        if (withinHitRange(opponent) && (((championSelected.getOrientation().equals("right")) && onHisRight(opponent)) || ((championSelected.getOrientation().equals("left"))&&onHisLeft(opponent)))){
            //check if not being hit
            if (notBeingHit(opponent)) {
                this.hitNow=true;
                opponent.getChampionSelected().setHealth(opponent.getChampionSelected().getHealth()-championSelected.getPower());
            }this.hitNow=false;
            
            if (championSelected.getHealth()<=20) escape(opponent,map); // escape in case of low health
            else{
                    if(onHisRight(opponent)){
                        championSelected.setOrientation("right");
                        championSelected.getPosition().add(1, 0); //move right to the opponenet
                    }
                    else {
                        championSelected.setOrientation("left");
                        championSelected.getPosition().add(-1, 0); //move left to the opponenet
                    }
                    
            }
        }
        
        //
        
    }
    public boolean onHisRight(Player opponent){
        if (championSelected.getPosition().getX()<opponent.getChampionSelected().getPosition().getX())
            return true;
        else return false;
    }
    public boolean onHisLeft(Player opponent){
        if (championSelected.getPosition().getX()>opponent.getChampionSelected().getPosition().getX())
            return true;
        else return false;
    }
    public boolean withinHitRange(Player opponent){
        if (Math.abs(championSelected.getPosition().getX()-opponent.getChampionSelected().getPosition().getX())<=championSelected.GetRangeHit())
            return true;
        else return false;
    }
    public boolean notBeingHit(Player opponent){
        if(opponent.getHit()== false) return true;
        else return false;
        
    }
    public void escape(Player opponent,Setting map){
        if (championSelected.getPosition().getX()== map.getMinDim()|| championSelected.getPosition().getX()== map.getMaxDim()){
            // should implement method to jump here and then change direction to escap; but waiting for gui
        }
        else{
        if (onHisRight(opponent))championSelected.getPosition().add(-1, 0);
        
        else championSelected.getPosition().add(1,0);}
        
    }
            
            
    // public boolean obstacleToJump(){}; should be implemented upon designing obstacles and either trying 
    // to escape player when health is too low and trying to approach player and jump the obstacle 
    // if the player had escaped
    
    
}
*/



class ComputerPlayerMain extends ProgrammingSemester4 {   // should extend Player  // should NOT extend player as it will contain the automated play
    
    private level Level;
    private Champion c2;
    //private int speed;
    private boolean hitNow = false;
    
    
    public ComputerPlayerMain(level Level, Champion championSelected) {
        this.Level = Level;
        this.c2 = championSelected;
        
        if (this.Level==level.easy) {this.c2.setPower(2.5); this.c2.setSpeed(300.0);}
        if (this.Level==(level.medium)) {this.c2.setPower(5.0);this.c2.setSpeed(200.0);}
        if (this.Level==(level.hard)){ this.c2.setPower(10.0);this.c2.setSpeed(150.0);}
    }
    
//    public void automatedPlay(Player opponent,  Pane imagesPane,Rectangle lifeReact1, BattlePane maingrp,Pane oImagesPane){
//        
//        if (withinHitRange(opponent)) ChampionAnimation.pauseToHit(imagesPane, c2, opponent.getChampionSelected(),lifeReact1,maingrp,oImagesPane);
//            //check if not being hit
//            
////            if (notBeingHit(opponent)) {
////                this.hitNow=true;
////                //ProgrammingSemester4.pauseToHit2(imagesPane, championSelected, championSelected, lifeReact1);
////                //opponent.getChampionSelected().editHealth(opponent.getChampionSelected().getHealth()-championSelected.getPower());
////            }this.hitNow=false;
////            
//            //if (championSelected.getHealth()<=20) escape(opponent,map); // escape in case of low health
//            else{
//                    if(onHisRight(opponent)){
//                        ChampionAnimation.moveRight(imagesPane, c2);
//                        //championSelected.getPosition().add(1, 0); //move right to the opponenet
//                    }
//                    else {
//                        ChampionAnimation.moveLeft(imagesPane, c2);
//                        //championSelected.getPosition().add(-1, 0); //move left to the opponenet
//                    }
//                    
//            }
//        
//        }
//        
//        //
//        
//    
//    
//    public boolean onHisRight(Player c1){
//        if (c2.getFacing().equals("Right")&&c1.getChampionSelected().getFacing().equals("Right")){
//            if (c2.getFacingRight().getX()<c1.getChampionSelected().getFacingRight().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Right")&&c1.getChampionSelected().getFacing().equals("Left")){
//            if (c2.getFacingRight().getX()<c1.getChampionSelected().getFacingLeft().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Left")&&c1.getChampionSelected().getFacing().equals("Right")){
//            if (c2.getFacingLeft().getX()<c1.getChampionSelected().getFacingRight().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Left")&&c1.getChampionSelected().getFacing().equals("Left")){
//            if (c2.getFacingLeft().getX()<c1.getChampionSelected().getFacingLeft().getX())
//                return true;
//        }
//        return false;
//    }
//    
//    public boolean onHisLeft(Player c1){
//        if (c2.getFacing().equals("Right")&&c1.getChampionSelected().getFacing().equals("Right")){
//            if (c2.getFacingRight().getX()>c1.getChampionSelected().getFacingRight().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Right")&&c1.getChampionSelected().getFacing().equals("Left")){
//            if (c2.getFacingRight().getX()>c1.getChampionSelected().getFacingLeft().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Left")&&c1.getChampionSelected().getFacing().equals("Right")){
//            if (c2.getFacingLeft().getX()>c1.getChampionSelected().getFacingRight().getX())
//                return true;
//        }
//        if (c2.getFacing().equals("Left")&&c1.getChampionSelected().getFacing().equals("Left")){
//            if (c2.getFacingLeft().getX()>c1.getChampionSelected().getFacingLeft().getX())
//                return true;
//        }
//        return false;
//    }
//    
//    public boolean withinHitRange(Player opponent){
//        int hitRange= c2.getHitRange();// N is the dminesion pof the player
//        if (c2.getFacing().equals("Right")&&opponent.getChampionSelected().getFacing().equals("Right")){
//            
//            if (Math.abs(opponent.getChampionSelected().getFacingRight().getX()-c2.getFacingRight().getX())<hitRange){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            
//                return true;
//            }
//    }
//        if (c2.getFacing().equals("Right")&&opponent.getChampionSelected().getFacing().equals("Left")){
//            if (Math.abs(opponent.getChampionSelected().getFacingLeft().getX()-c2.getFacingRight().getX())<hitRange){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            
//                return true;
//            }
//    }
//        if (c2.getFacing().equals("Left")&&opponent.getChampionSelected().getFacing().equals("Right")){
//            if (Math.abs(opponent.getChampionSelected().getFacingRight().getX()-c2.getFacingLeft().getX())<hitRange){// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            
//               return true;
//            }
//    }
//        if (c2.getFacing().equals("Left")&&opponent.getChampionSelected().getFacing().equals("Left")){
//            if (Math.abs(opponent.getChampionSelected().getFacingLeft().getX()-c2.getFacingLeft().getX())<hitRange)// check within hit range
////             o.setHealth(o.getHealth()-c.getPower());
////             lifeReact2.setWidth(o.getHealth()*4);
////            
//                return true;
//            
//    }
//        return false;
//    }    
//    
//    public boolean notBeingHit(Player opponent){
//        if(opponent.getHit()== false) return true;
//        else return false;
//        
//    }
//    
//    public void escape(Player opponent,Setting map){
//        if (championSelected.getX()== map.getMinDim()|| championSelected.getX()== map.getMaxDim()){
//            // should implement method to jump here and then change direction to escap; but waiting for gui
//        }
//        else{
//        if (onHisRight(opponent))championSelected.setX(championSelected.getX()-100);
//        
//        else championSelected.setX(championSelected.getX()+100);}
//        
//    }
//            
            
    // public boolean obstacleToJump(){}; should be implemented upon designing obstacles and either trying 
    // to escape player when health is too low and trying to approach player and jump the obstacle 
    // if the player had escaped
    
    
}



