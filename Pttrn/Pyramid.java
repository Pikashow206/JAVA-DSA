package Pttrn;
import java.util.*;

public class Pyramid{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int l = Sc.nextInt();
        for(int line = 1; line <=l ;line++){
            for(int py =1 ; py<= line ; py++){
                System.out.print(py);

            } 
            System.out.println();

        }
    }


}