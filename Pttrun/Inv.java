package Pttrun;
import java.util.*;

public class Inv {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int l = Sc.nextInt();
        for(int line = 1;  line <=l ; line++){
            for(int star =1 ; star<= (l-line+1) ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
