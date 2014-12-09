package RoboRacer;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class RoboRacer3 {
    private static final int NUMBOTS = 20;
	
	public static void main(String[] args) {
		Display.setSize(20, 20);
		Display.setSpeed(8);
		// Construct Robot competitors
		Robot[] robots = new Robot[NUMBOTS];
		for(int i = 0; i<NUMBOTS; i++) {
			robots[i] = new Robot(1, i+1, Display.EAST, 0);
		}
		// Begin the race
		while (true) {
			// Create a random integer from 0 to NUMBOTS -1
			int luckyRobot = (int) (Math.random()*NUMBOTS);
			robots[luckyRobot].move();
			if (robots[luckyRobot].getX() > 20) {
				System.out.println("Robot "+luckyRobot+" won!");
				break;
			}
		}
        }
}
