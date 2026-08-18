import java.util.*;

public class Character {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        char ch = 'A';
        int l = Sc.nextInt();
        for(int line = 1 ; line <=l ; line++){
            for(int chars=1 ; chars <=line ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
