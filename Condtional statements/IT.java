import java.util.*;

public class IT{
    public static void main(String[]args){

        Scanner Sc = new Scanner(System.in);
        System.out.println("ENter the income");

        int income = Sc.nextInt();
        double tax;

        if(income <=500000){
            System.out.println("not taxabale");
        }

        else if ( income>500000 && income <=1000000){
            tax = (income*20)/100;
            System.out.println("tax is " + tax);
            
        }

        else{
            tax = (income*0.3);
            System.out.println("tax is " + tax);
        }
        
    }
}