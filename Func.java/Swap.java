import java.util.*;

public class Swap{
      
    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping the numbers are: " + a + " and " + b);

    }

    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = Sc.nextInt();
        System.out.println("Enter the second number");
        int b = Sc.nextInt();
        swap(a,b);
      
    }


}