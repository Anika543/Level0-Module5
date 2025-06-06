package _01_algorithms._1_prime_or_not; 
import java.util.Scanner; 

public class primeOrNot{
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in); 
        boolean y = true;
        while(y){
        int x = scan.nextInt(); 

        boolean prime = true; 
        for(int i = 2; i<x; i++){
            if(x%i==0){
                System.out.println("not prime"); 
                prime = false; 
                break; 
                
            }
        }
         if(prime == true){
                System.out.println("prime"); 
            }
    }










    }
}