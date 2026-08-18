import java.util.*;

public class rev {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int a = Sc.nextInt();
        int rev = 0;

        while(a>0){
            int lastdigit = a%10;
            rev = rev*10 + lastdigit;
            a = a/10;
        }
        System.out.println(rev);
      
    }
    
}
