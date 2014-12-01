package karellabs;
/**
 * @author heynderickxd
 */
public class SteepleChaseRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
        public SteepleChaseRacer(int y){
        super(y);
        }
	/**
	 * Re-implement the method to allow for jumping hurdles of any height
	 */
	@Override
	public void jumpRight(){
            super.turnLeft();
            while(!super.rightIsClear()){
                super.move();
            }
            super.turnRight();
            super.move();
            super.turnRight();
            super.move();
            while(super.frontIsClear()){
            super.move();
            }
            super.turnLeft();
	}

}
