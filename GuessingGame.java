import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
          
    public static void main(String[] args) {
        Random rand=new Random();
        int ntog=rand.nextInt(10)+1;
       int ug=0;
        int att=0;
        System.out.println("welcome to user gueesing game");
        System.out.println("im guessing a number between 1 to 100");
         Scanner sc=new Scanner(System.in);
        while(ug!=ntog){
            System.out.println("guess any Number");
             ug=sc.nextInt();
            att++;
            if(ug<ntog){
                System.out.println("your guess is low");
            }
            else if(ug>ntog){
                System.out.println("your guess is high");
            }
            else {
                System.out.println("your guess is right");
                System.out.println("you took "+att+" attempts to guess the number");
            }
        }
    }
}
        
        














