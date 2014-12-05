package karellabs;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Display; 
import edu.fcps.Digit;
public class KarelLab11 {
	 
	 public static void main(String[] args) {
         Display.openWorld("../maps/map.map");
         Display.setSize(36, 32);
         Display.setSpeed(10);
	 
         Digit first = new Zero(1, 9);
         Digit second = new Seven(7, 9);
         Digit third = new Seven(13, 9);
         Digit fourth = new Four(19, 9);
         Digit fifth = new Four(25, 9);
         
         first.display();
         second.display();
         third.display();
         fourth.display();
         fifth.display();
         }
	 
 }
