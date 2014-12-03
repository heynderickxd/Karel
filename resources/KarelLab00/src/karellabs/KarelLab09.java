package karellabs;
/**
 * @author heynderickxd
 */
   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
public class KarelLab09 {
    public static void shiftMain(Athlete guy){
        while (guy.nextToABeeper()){
            guy.pickBeeper();
        }
        guy.move();
        while (guy.hasBeepers()){
            guy.putBeeper();
    }
        guy.turnAround();
        guy.move();
    }
    public static void shiftReset(Athlete luk){
    while(!luk.nextToABeeper()){
            luk.move();
        }
        luk.turnAround();    
    }
    public static void shift(Athlete arg){
        while(6 > arg.getX()){
            arg.move();
        }
        shiftMain(arg);
        shiftReset(arg);
        shiftMain(arg);
        shiftReset(arg);
        shiftMain(arg);
        shiftReset(arg);
        shiftMain(arg);
        while(arg.frontIsClear()){
           arg.move();
        }
    } 
    
    public static void main(String[] args){
        
         Display.openWorld("../maps/Pile1.map");
         Display.setSize(18, 16);
         Display.setSpeed(10);
         
         Athlete jo = new Athlete(1,1,Display.EAST,0);
          
         shift(jo); 
    }
}
