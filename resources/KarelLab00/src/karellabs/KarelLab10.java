package karellabs;
/**
 * @author heynderickxd
 */
   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
public class KarelLab10 {
   
    public static void main(String[] args){
        
         Display.openWorld("../maps/maze3.map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
         
         Athlete jo = new Athlete(1,1,Display.NORTH,0);

        while(!jo.nextToABeeper()){ 
           while(!jo.rightIsClear() && jo.frontIsClear() && !jo.nextToABeeper()){
               jo.move();
        }
           if(jo.frontIsClear() && jo.rightIsClear() && !jo.leftIsClear() && !jo.nextToABeeper()){
               jo.turnRight();
               jo.move();
           } else if(!jo.rightIsClear() && !jo.frontIsClear() && jo.leftIsClear() && !jo.nextToABeeper()){
               jo.turnLeft();
               jo.move();
           } else if(jo.rightIsClear() && !jo.frontIsClear() && !jo.leftIsClear() && !jo.nextToABeeper()){
               jo.turnRight();
               jo.move();
           } else if (!jo.rightIsClear() && !jo.frontIsClear() && !jo.leftIsClear() && !jo.nextToABeeper()){
               jo.turnAround();
           } else if (!jo.frontIsClear() && jo.rightIsClear() && jo.leftIsClear() && !jo.nextToABeeper()){
               jo.turnRight();
               jo.move();
           } else if (jo.frontIsClear() && jo.leftIsClear() && jo.rightIsClear() && !jo.nextToABeeper()){
               jo.turnRight();
               jo.move();
           }  
        }
        jo.pickBeeper();
    }
}
