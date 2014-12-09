package RoboRacer;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class RoboRacer1 {
    public static void main (String[] args){
        Display.setSize(20, 20);
        Display.setSpeed(5);
        //Construct competitors
        Robot[] robots = new Robot[5];
        robots[0] = new Robot(1,1,Display.EAST,0);
        robots[1] = new Robot(1,2,Display.EAST,0);
        robots[2] = new Robot(1,3,Display.EAST,0);
        robots[3] = new Robot(1,4,Display.EAST,0);
        robots[4] = new Robot(1,5,Display.EAST,0);
        //beging race
        while (true){
            int luckRobo = (int) (Math.random()*5);
            robots[luckRobo].move();
        }
    }
}
