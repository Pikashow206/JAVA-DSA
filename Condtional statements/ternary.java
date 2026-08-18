import java.util.*;

public class ternary{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = Sc.nextInt();
        String result = (marks >= 35)? "pass" : "fail";
        System.out.println("Result: " + result);
    }
}
