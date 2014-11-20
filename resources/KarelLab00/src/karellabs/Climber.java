package karellabs;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Climber extends Athlete {
    public Climber(){
        super();
    } 
    public Climber(int x){
        super(x,1,Display.NORTH,1);
    }
    public void climbUpRight(){
        super.turnLeft();
        super.move();
        super.move();
        super.turnRight();
        super.move();
    }
    public void climbUpLeft(){
        super.turnRight();
        super.move();
        super.move();
        super.turnLeft();
        super.move();
    }
    public void climbDownRight(){
        super.move();
        super.turnRight();
        super.move();
        super.move();
        super.turnLeft();
    }
    public void climbDownLeft(){
        super.move();
        super.turnLeft();
        super.move();
        super.move();
        super.turnRight();
    }
}
