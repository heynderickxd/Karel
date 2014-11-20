package karellabs;
/**
 * @author heynderickxd
 * @version 20.11.14
 */
  import edu.fcps.karel2.Display;
  import edu.fcps.karel2.Robot;
public class KarelLab04 {
	public static void takeTheField(Athlete arg) {
		arg.move();
		arg.move();
		arg.move();
		arg.move();
		arg.turnRight();
		arg.move();
		arg.move();
	}

     public static void main(String[] args) {
        Display.openWorld("../maps/arena.map");
        Display.setSize(10, 10);
        Display.setSpeed(5);
     
        Athlete roy = new Athlete(1,1,Display.NORTH,0); 
        Athlete dan = new Athlete(1,1,Display.NORTH,0);
        Athlete wayne = new Athlete(1,1,Display.NORTH,0);
        Athlete raheem = new Athlete(1,1,Display.NORTH,0);
        Athlete steve = new Athlete(1,1,Display.NORTH,0);
        Athlete mark = new Athlete(1,1,Display.NORTH,0);
        Athlete john = new Athlete(1,1,Display.NORTH,0);
        
        takeTheField(dan);
        takeTheField(wayne);
        takeTheField(raheem);
        takeTheField(steve);
        takeTheField(mark);
        takeTheField(roy);
        takeTheField(john);
        roy.turnAround();
        roy.move();
        roy.turnRight();
        roy.move();
        roy.turnRight();
        raheem.move();
        raheem.turnLeft();
        raheem.move();
        raheem.turnAround();
        wayne.move();
        wayne.move();
        wayne.turnRight();
        dan.move();
        dan.move();
        dan.move();
        dan.turnRight();
        steve.move();
        steve.move();
        steve.move();
        steve.move();
        steve.turnRight();
        mark.move();
        mark.move();
        mark.move();
        mark.move();
        mark.move();
        mark.turnLeft();
        mark.move();
        mark.turnAround();
        john.move();
        john.move();
        john.move();
        john.turnLeft();
        john.move();
        john.move();
        john.turnAround();
     }

}
