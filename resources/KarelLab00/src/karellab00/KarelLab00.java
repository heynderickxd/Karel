/*
 * Swag License 
 */
package karellab00;
/**
 * @author heynderickxd
 */

import edu.fcps.karel2.Display; 
import edu.fcps.karel2.Robot;

public class KarelLab00 {
    public static void main(String[] args) {
     Display.openWorld("../maps/first.map");
     Display.setSize(10, 10);
     Display.setSpeed(5);
     
     Robot joe = new Robot();
     
     joe.move();
     joe.pickBeeper();
     joe.move();
     joe.turnLeft();
     joe.move();
     joe.putBeeper();
     joe.move();
     joe.turnLeft();
     joe.turnLeft();
    }
    
}
