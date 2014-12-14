package Teleport;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class TestTeleport {
    public static void main (String[] args){
        Display.openDefaultWorld();
        Display.setSize(10, 10);
        Display.setSpeed(1);
        
        Teleporter tim = new Teleporter();
        Teleporter jo =  new Teleporter(3,7,90);
        Teleporter dig = new Teleporter(4,1,0);
        
        tim.teleport(5, 5);
        jo.teleport(7,9);
        dig.teleport(3, 7);
        
    }
}
