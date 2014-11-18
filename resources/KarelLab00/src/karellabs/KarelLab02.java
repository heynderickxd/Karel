package karellabs;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class KarelLab02 {
    public static void main (String[] args){
        Display.openWorld("../maps/maze.map");
        Display.setSize(8, 8);
        Display.setSpeed(5);
        
        Athlete ted = new Athlete();
        
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
        ted.turnRight();
        ted.move();
        ted.putBeeper();
        ted.turnRight();
        ted.move();
        ted.putBeeper();
        ted.turnLeft();
        ted.move();
        ted.putBeeper();
        ted.turnLeft();
        ted.move();
        ted.putBeeper();
        ted.turnRight();
        ted.move();
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
        ted.turnRight();
        ted.move();
        ted.putBeeper();
        ted.turnLeft();
        ted.move();
        ted.putBeeper();
        ted.turnLeft();
        ted.move();
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
        ted.turnRight();
        ted.move();
        ted.putBeeper();
        ted.move();
        ted.putBeeper();
    }
    
}
