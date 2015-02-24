package Aliens;
/**
 * @author heynderickxd
 */
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Marine extends Robot{
    public Marine(){
        super();
    }
    public Marine(int x, int y, int dir, int beepers){
        super(x, y, dir, beepers);
    }
    
    @Override 
    public void move(){
        if(this.nextToABeeper()){
            pickBeeper();
            explode();
        }
        super.move();
    }
    public void toGround(){
        for(int i = 1; i <= 5; i++){
            move();
        }
    }
    public void attack(){
        while(!nextToARobot()){
            move();
        } 
    }
}

