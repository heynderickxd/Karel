package karellabs;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class KarelLab05 {
    public static void runTheRace(Racer a) {
        a.move();
        a.jumpRight();
        a.sprint(6);
        a.pick(3);
        a.turnAround();
        a.sprint(6);
        a.jumpLeft();
        a.move();
        a.put(3);
        a.turnAround();
        a.move();
        a.jumpRight();
        a.sprint(4);
        a.pick(5);
        a.turnAround();
        a.sprint(4);
        a.jumpLeft();
        a.move();
        a.put(5);
        a.turnAround();
        a.move();
        a.jumpRight();
        a.sprint(2);
        a.pick(7);
        a.turnAround();
        a.sprint(2);
        a.jumpLeft();
        a.move();
        a.put(7);
        a.turnAround();
        a.move();
}       
    public static void main (String[] args) {
        Display.openWorld("../maps/shuttle.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        
        Racer bob = new Racer(1);
        Racer tj = new Racer(4);
        Racer gus = new Racer(7);
        
        runTheRace(bob);
        runTheRace(tj);
        runTheRace(gus);
    }
}
