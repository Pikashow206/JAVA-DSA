import java.util.*;

public class Chk{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("neter the number ");
        int Num = Sc.nextInt();
        if(Num % 2 == 0){
            System.out.println(Num + " is even number");
        }
        else{
            System.out.println(Num + " is odd number");
        }
    }
}
