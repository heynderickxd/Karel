package Aliens;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class BattleField {
   public static void main(String[] args){
       Display.openDefaultWorld();
       Display.setSize(20, 20);
       Display.setSpeed(4);
       
       Alien gh = new Alien(2,5,Display.EAST,5);
       
       Marine fg = new Marine(8, 5, Display.WEST,0);
       Marine df = new Marine(9,5,Display.WEST,0);
       
       gh.sow(2);
       gh.retreat(2);
       
       fg.attack();
       df.attack();

   } 
}
