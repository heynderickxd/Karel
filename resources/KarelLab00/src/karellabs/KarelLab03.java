package karellabs;
/**
 * @author heynderickxd
 */
   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
 
public class KarelLab03 {
 public static void main (String[] args){
        Display.openWorld("../maps/mountain.map");
        Display.setSize(16, 16);
        Display.setSpeed(10);
        
        Climber mort = new Climber(8);
        Climber jude = new Climber(8);
        
        mort.putBeeper();
        mort.turnRight();
        jude.turnRight();
        jude.move();
        mort.move();
        mort.climbUpRight();
        jude.climbUpRight();
        mort.climbUpRight();
        jude.climbUpRight();
        mort.climbUpRight();
        jude.climbUpRight();
        jude.climbDownRight();
        mort.climbDownRight();
        jude.climbDownRight();
        mort.climbDownRight();
        mort.pickBeeper();
        jude.turnAround();
        mort.turnAround();
        mort.climbUpLeft();
        jude.climbUpLeft();
        mort.climbUpLeft();
        jude.climbUpLeft();
        mort.climbDownLeft();
        jude.climbDownLeft();
        mort.climbDownLeft();
        jude.climbDownLeft();
        mort.climbDownLeft();
        jude.climbDownLeft();
        mort.move();
        jude.move();
       
 }
}
