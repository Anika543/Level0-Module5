package _01_algorithms._2_fibonacci;

public class fibonacci {
    public static void main(String[] args){
        int num1 = 0;
        System.out.println(num1);

        int num2 = 1;
        System.out.println(num2); 

        int sum = (num1+num2); 
        System.out.println(sum);

        for(int i = 0; i<10; i++){
            num1 = num2; 
            num2 = sum;
            sum = (num1+num2); 
            System.out.println(sum); 

        }






    }
    
}
