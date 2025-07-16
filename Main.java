
import java.util.Scanner;
class Atm{
    Scanner sc;
    public Atm(Scanner scanner){
        this.sc=scanner;

    }
    public int withDraw(int amo){
        if(amo==0)
        {
            System.out.println("No Amount is there");
            return 0;
        }
        else{
            System.out.println("Enter how much you taken");
          
          int cum =sc.nextInt();
                if(cum==amo){
                    cum=0;
                    System.out.println("Cash printing...");
                   // System.out.println("Your balance is "+cum);
                 return cum;
                }
                else if(cum<amo){
                    System.out.println("Cash Printing........");
                    int rem= amo-cum;
                   System.out.println("Your balance is: "+rem);
                  return rem;  
                }
                else{
                    System.out.println("In Sufficient Money");
                    return 0;
                }
    } 
}

      public int deposit(int mon){
                   System.out.println("How much you added");
                   int add=sc.nextInt();
                        int tot=mon+add;
                   System.out.println("Your total money is"+tot);
                   return tot;
               }
}


class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalAmount=500;
        int bal=0;
       int d;
        Atm obj = new Atm (sc);
        System.out.println("Welcome to ATM");
         do{
         System.out.println("Enter your choice");
          System.out.println("1.Withdraw  2.Deposit  3.Exit");
         d=sc.nextInt();
          if(d==1){
            System.out.println("Your total amount is "+totalAmount);
           bal= obj.withDraw(totalAmount);
           System.out.println("Balance payment is : "+bal);
           totalAmount = bal;
          }
          else if(d==2){
              System.out.println("Your total amount is "+ totalAmount);
              bal= obj.deposit(totalAmount);
              System.out.println("Balance payment is : "+bal);
              totalAmount = bal;
          }
          else if(d==3){
              System.out.println("See you again ");
              break;
          }
        
    }while(d!=3);
}
}

