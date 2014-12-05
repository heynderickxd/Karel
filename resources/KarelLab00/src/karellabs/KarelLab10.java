package karellabs;
/**
 * @author heynderickxd
 */
   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
public class KarelLab10 {
    public static void right(Athlete arg){
        arg.turnRight();
        arg.move();
    }
    public static void left(Athlete arg){
        arg.turnLeft();
        arg.move();
    }
    public static void uTurn(Athlete arg){
        arg.turnLeft();
        arg.turnLeft();
    }
    public static void main(String[] args){
        
         Display.openWorld("../maps/maze1.map");
         Display.setSize(10, 10);
         Display.setSpeed(1);
         
         Athlete jo = new Athlete(1,1,Display.NORTH,0);
        //corner
        while(!jo.nextToABeeper()){
           jo.turnRight();
           while(!jo.rightIsClear() && jo.frontIsClear() && !jo.leftIsClear()){
               jo.move();
           }
           while(!jo.rightIsClear()){
               if(!jo.frontIsClear() && !jo.leftIsClear() && !jo.rightIsClear()){
                   uTurn(jo);
               } else if (!jo.frontIsClear() && !jo.leftIsClear() && jo.rightIsClear()){
                   right(jo);
               } else if(!jo.frontIsClear() && !jo.rightIsClear() && jo.leftIsClear()){
                   jo.turnLeft();
                   jo.move();
                   jo.turnRight();
                   jo.move();
                   jo.turnRight();
                   jo.move();
               } else if (jo.frontIsClear() && !jo.rightIsClear() && jo.leftIsClear()){
                   left(jo);
               }
           }
           
            }
        jo.pickBeeper();
    }
}
