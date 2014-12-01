package karellabs;
/**
 * @author heynderickxd
*/
public class BoxTopRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	public BoxTopRacer(int y){
        super(y);    
        }
	/**
	 * Re-implement the method to allow for jumping hurdles of any width
	 */
	@Override
	public void jumpRight() {
            super.turnLeft();
            while(!super.rightIsClear()){
                super.move();
            }
            super.turnRight();
            super.move();
             while(!super.rightIsClear()){
                super.move();
            }
            super.turnRight();
            while(super.frontIsClear()){
            super.move();
            }
            super.turnLeft();
	}

}