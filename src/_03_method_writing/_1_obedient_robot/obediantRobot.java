package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obediantRobot {
    public static void main (String[] args){
        Robot rob = new Robot();
        rob.setSpeed(6);

        drawSquare(rob); 









    }

    public static void drawSquare(Robot rob){
        for(int i = 0; i<4; i++){
            rob.move(100);
            rob.turn(90); 
        }

    public static void drawTriangle(Robot rob){
        for(int i = 0; i<4; i++){
            rob.move(100);
            rob.turn(60); 
        }

    public static void drawCircle(Robot rob){
        for(int i = 0; i<4; i++){
            rob.move(100);
            rob.turn(60); 
        }

    }
}
