package Aliens;
/**
 * @author heynderickxd
 */
import karellabs.Athlete;
public class Alien extends Athlete {
    public Alien(){
        super();
    }
    public Alien(int x, int y, int dir, int beepers){
        super(x, y, dir, beepers);
    }
    
    @Override
    public void move(){
      if(nextToARobot()){
          super.explode();
      }
        super.move();
      if(frontIsClear()){
      super.move();
      }
    }
    
    public void toGround(){
        for(int i = 1; i <= 5; i++){
            move();
        }
    }
    
    public boolean cover(){
        boolean cov = ((!frontIsClear() && !rightIsClear())
                       || (!frontIsClear() && !leftIsClear()));
        return cov;
    }
   public void sow(int n){
       for(int i = 1; i <= n; i++){
           move();
           putBeeper();
       }
   }
   public void retreat(int n){
       turnAround();
       for(int i = 1; i <= (n/2); i++){
           move();
       }
   }
    
}
