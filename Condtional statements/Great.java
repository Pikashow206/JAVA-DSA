import java.util.*;

public class Great{
    public static void main(String[]args){

    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1= Sc.nextInt();

    System.out.println("Enter the second number: ");
    int num2 = Sc.nextInt();

    if(num1 > num2){
        System.out.println(num1 + " is greater than " + num2);
    }
    else if(num1 < num2){
        System.out.println(num2 + " is greater than " + num1);
    }
    else{
        System.out.println("Both numbers are equal.");
    }
}
}
