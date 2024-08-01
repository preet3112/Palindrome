
import java.util.Scanner;

public class Palinedrome{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Integerr
        /*System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int orNum=num;
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num %10;
            num=num/10;
        }
        
        if(orNum == rev){
            System.out.println("The number is  a Palinedrome");
        }else{
            System.out.println("The number is not a Palinedrome");
        }*/
        System.out.println("Enter the number: ");
        String sr = sc.next();
        String rev = "";
        for(int i = sr.length()-1;i>=0;i--){
            rev+=sr.charAt(i);
        }
        if(sr.equalsIgnoreCase(rev)){
            System.out.println("The String is  a Palinedrome");
        }else{
            System.out.println("The String is not a Palinedrome");
        }
        //String
        sc.close();
    }
}