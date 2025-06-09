package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

import javax.swing.JOptionPane; 

public class obediantRobot {
    public static void main (String[] args){
        Robot rob = new Robot();
        rob.setSpeed(6);

        String input = JOptionPane.showInputDialog("What shape?");
        String input2 = JOptionPane.showInputDialog("What color? Blue or Black?");

        if(input2.equalsIgnoreCase("Black")){
            rob.setPenColor(Color.BLACK);

        }else{
            rob.setPenColor(Color.BLUE);
        }

        if(input.equalsIgnoreCase("square")){
            drawSquare(rob); 
        }else if(input.equalsIgnoreCase("circle")){
            drawCircle(rob); 
        }









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
