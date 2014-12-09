package RoboRacer;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class RoboRacer4 {
    private static final int NUMBOTS = 20;
	private static final int DISTANCE = 15;
	
	public static void main(String[] args) {
		int gridsize = Math.max(NUMBOTS, DISTANCE);
		Display.setSize(gridsize, gridsize);
		Display.setSpeed(8);
		Robot[] robots = createLineup();
		runRace(robots);
	}
	
	private static Robot[] createLineup() {
		Robot[] temp = new Robot[NUMBOTS];
		for(int i = 0; i<NUMBOTS; i++) {
			temp[i] = new Robot(1, i+1, Display.EAST, 0);
		}
		return temp;
	}
	
	private static void runRace(Robot[] competitors) {
		while (true) {
			int luckyRobot = (int) (Math.random()*NUMBOTS);
			competitors[luckyRobot].move();
			if (competitors[luckyRobot].getX() > DISTANCE) {
				System.out.println("Robot "+luckyRobot+" won!");
				return;
			}
		}
	}
}
