package RoboRacer;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class RoboRacer {
    public static void main(String[] args){
        Display.setSize(20, 20);
        Display.setSpeed(5);
        //Construct new robot competitors
        Robot anna = new Robot();
        Robot bobbie = new Robot(1, 2, Display.EAST, 0);
        Robot carla = new Robot(1, 3, Display.EAST, 0);
        Robot devon = new Robot(1, 4, Display.EAST, 0);
        Robot earnest = new Robot(1, 5, Display.EAST, 0);
        //begin race
        while (true){
            //Create random int from one to four
            int luckRobot = (int) (Math.random() * 5);
            if (luckRobot == 0){
                anna.move();
            }
            else if (luckRobot == 1){
                bobbie.move();
            }
            else if (luckRobot == 2){
                carla.move();
            }
            else if (luckRobot == 3){
                devon.move();
            } else {
                earnest.move();
            }
        }
    }
}
