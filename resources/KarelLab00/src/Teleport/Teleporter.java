package Teleport;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Teleporter extends Robot {
    public Teleporter(){
        super(1, 1, Display.WEST, Display.INFINITY);
    }
    public Teleporter(int x, int y, int beepNo){
        super(x, y, Display.WEST, beepNo);
    }
    
    public void teleport(int x, int y){
        if(this.hasBeepers()){
            this.x = x;
            this.y = y;
            this.putBeeper();
        }
    }
}
