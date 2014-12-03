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
            while(jo.frontIsClear()){
             if(jo.frontIsClear() && jo.leftIsClear() && !jo.rightIsClear()){
             left(jo);
            } 
            else if (jo.frontIsClear() && !jo.leftIsClear() && jo.rightIsClear()){
             jo.turnRight();
             jo.move();
            }
            jo.move();
            if (jo.nextToABeeper()){
                jo.pickBeeper();
                return;
            }
            }
            //look around 1
            if (!jo.frontIsClear() && !jo.leftIsClear() && jo.rightIsClear()){
                right(jo);
            //look around 2
            } else if (!jo.frontIsClear() && !jo.rightIsClear() && jo.leftIsClear()) {
            left(jo); 
            //uTurn
            } else {
                jo.turnAround();
            }
            }
        jo.pickBeeper();
    }
    }
