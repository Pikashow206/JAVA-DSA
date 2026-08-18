import java.util.*;

public class Prime{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = Sc.nextInt();
        boolean isPrime = true;
        if (n == 2){
            System.out.println("The number is prime");
        }
        else{
            for(int i = 2; i<= (n-1); i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }



        
        
        
    }
}