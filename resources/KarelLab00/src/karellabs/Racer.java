/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karellabs;

import edu.fcps.karel2.Display;

/**
 *
 * @author heynderickxd
 */
public class Racer extends Athlete {
    public Racer(int y){
        super (1,y,Display.EAST,Display.INFINITY);
    }
    public void jumpRight(){
        super.turnLeft();
        super.move();
        super.turnRight();
        super.move();
        super.turnRight();
        super.move();
        super.turnLeft();
    }
    public void jumpLeft(){
        super.turnRight();
        super.move();
        super.turnLeft();
        super.move();
        super.turnLeft();
        super.move();
        super.turnRight(); 
    }
    public void sprint(int n){
        for(int k=1;k<=n;k++){
            super.move();
        }
    }
    public void put (int n){
        for (int k=1;k<=n;k++){
            super.putBeeper();
        }
    }
    public void pick (int n){
        for (int k=1;k<=n;k++){
            super.pickBeeper();
        }
    }
    public void shuttle (int spaces, int beepers){
    }
}
