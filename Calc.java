// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        System.out.println("1.GOTO CALCULATOR 2.EXIT");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
        int op;
        do{
        System.out.println("Enter first number");
           int firstNum=sc.nextInt();
        System.out.println("Enter second number");
        int secNum=sc.nextInt();
        System.out.println("Select your operator");
        System.out.println("1.+  2.-  3.x  4./ 5.% 6.Exit the program");
        op=sc.nextInt();
        switch(op){
            case 1:System.out.println("The addition is :"+(firstNum+secNum));
                break;
            case 2:System.out.println("The subtraction is:"+(firstNum-secNum));
                break;
            case 3:System.out.println("The multiplication is :"+(firstNum*secNum));
                break;
            case 4:System.out.println("The divison is :"+(firstNum/secNum));
               break;
            case 5: System.out.println("The remainder is :"+(firstNum%secNum)); 
            case 6: System.out.println("Bye See you Again!");
               break;
            default :System.out.println("Invalid Choice");         
        }
       
        }while(op!=6);
    }
    else{
        System.exit(0);
    }
}
}