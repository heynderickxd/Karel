   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class KarelLab06 {
   
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("../maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); //go to the end of the row of beepers
         task_02(); //go to the beeper
         task_03(); //go to the wall
         task_04(); //go to the wall, pick up all the beepers (max one per pile)
         task_05(); //go to the wall, pick up all the beepers
         task_06();//go to the end of the row of beepers, there is one gap
         task_07();
         task_08();
         task_09();
      }
       public static void task_01()	
      { //go to the end of the row of beepers
         Robot temp = new Robot(1, 1, Display.EAST, 0);
         while(temp.frontIsClear() && temp.nextToABeeper()){
             temp.move();
         }
         }
      
    
       public static void task_02()	
      { //go to the beeper
         Robot temp = new Robot(1, 2, Display.EAST, 0);
         if(temp.frontIsClear() && !temp.nextToABeeper()){
             temp.move();
         }
      }
       public static void task_03()	
      { //go to the wall
         Robot temp = new Robot(1, 3, Display.EAST, 0);
         while(temp.frontIsClear()){
             temp.move();
         }
      }
       public static void task_04()	
      { //go to the wall, pick up all the beepers (max one per pile)
         Robot temp = new Robot(1, 4, Display.EAST, 0);
         while(temp.frontIsClear()){
             if(temp.nextToABeeper()){
                 temp.pickBeeper();
             }
              temp.move();
             if(temp.nextToABeeper()){
                 temp.pickBeeper();
             }
          }
      }
       public static void task_05()	
      { //go to the wall, pick up all the beepers
         Robot temp = new Robot(1, 5, Display.EAST, 0);
         while (temp.frontIsClear()){
             if(temp.nextToABeeper()){
                 temp.pickBeeper();
             } else {
                 temp.move();
             }
         }
         while(!temp.frontIsClear()){
         while (temp.nextToABeeper()) {
             temp.pickBeeper();
         }
         return;
             }
      }
       public static void task_06()
      { //go to the end of the row of beepers, there is one gap
         Robot temp = new Robot(1, 6, Display.EAST, 0);
         int c = temp.getX();
         while (temp.frontIsClear() && c < 10) {
            if(temp.nextToABeeper()){
                 temp.move();
                 c++;
             } else { 
                 temp.move();
                 c++;
             }
        }
      }
       public static void task_07() {
           Robot temp = new Robot(1,7,Display.EAST,0);
           while(temp.frontIsClear() || !temp.nextToABeeper()){
               temp.move();
           }
       }
       public static void task_08() {
           Robot temp2 = new Robot(9,8,Display.NORTH,0);
           Robot temp = new Robot(1,8,Display.EAST,1); 
           if(!temp.nextToARobot()){
               temp.move();
           }
           temp.putBeeper();
         }
       public static void task_09(){
           Robot temp = new Robot(1,9,Display.EAST,20);
           int c = temp.getBeepers();
           while (c>0){
           for(int i= 3;i >= 0; --i){
           temp.putBeeper();
           }
           temp.move();
       }
       }
       public static void task_10(){
            Robot temp = new Robot(1,10,Display.EAST,20);
           while(temp.frontIsClear()){
               while(temp.nextToABeeper()){
                temp.move();
               }
               temp.putBeeper();
           }
       }
       public static void task_11(){
            Robot temp = new Robot(1,9,Display.EAST,20);
            while(!temp.rightIsClear()){
                temp.putBeeper();
                temp.move();
            }
       }
       public static void task_12(){
            Robot temp = new Robot(1,9,Display.EAST,20);
            while(!temp.rightIsClear() && !temp.nextToABeeper()){
                temp.move();
            }
       }
    }

