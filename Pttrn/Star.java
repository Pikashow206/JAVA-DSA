package Pttrn;
import java.util.*;

public class Star{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int l = Sc.nextInt();
        
        for (int line = 1 ; line <=l; line++){
            for( int star = 1  ; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row of stars
        }  
    }
}