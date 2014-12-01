package karellabs;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;

public class HillClimber extends Climber {

	public HillClimber(int x) {
            super(x);
	}
	
	public void climbUpRight() {
            super.turnLeft();
            super.move();
            super.turnRight();
            super.move();
            super.move();
        }
	public void climbUpLeft() {
	    super.turnRight();
            super.move();
            super.turnLeft();
            super.move();
            super.move();
	}
	
	public void climbDownRight() {
            super.move();
            super.move();
            super.turnRight();
            super.move();
            super.turnLeft();
	}
	
	public void climbDownLeft() {
           super.move();
            super.move();
            super.turnLeft();
            super.move();
            super.turnRight();
	}
}