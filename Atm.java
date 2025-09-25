
import java.util.Scanner;

class EnterPin{
    public double EnPin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Account Secret Pin : ");
        return 0;

    }
}
class AccountTitle{
    public int EnterTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select your Account Title: ");
        System.out.println("Current Account     OR      Saving Account  ");


        return 0;

        

    }
}
class SelectAmount{
    public double Amount(){
        System.out.println("Please Select your Amount for Withdraw :  ");
        System.out.println(" 500     1000     3000      5000     10000     20000     Others");

        return 0;
    }

}



public class Atm{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Guys Welcome In ATM BANK:  ");

        
      

        EnterPin ep = new EnterPin();
        ep.EnPin();
        String pin = sc.next();
        if("0000".equals(pin))
        {
            System.out.println("Successfully entered in your Bank Account ");
            AccountTitle at = new AccountTitle();
            at.EnterTitle();
            String str = sc.next();
            if("Current".equals(str))
            {
                System.err.println("Welcome in your Account ");

                SelectAmount sa = new SelectAmount();
                sa.Amount();
                int Amount = sc.nextInt();
                
                if(Amount < 500){
                     System.out.println("Please Enter Amount greater than 500  :  ");

                }
                else if(Amount <= 25000 && Amount > 500 )
                {
                    System.out.println("Please Wait Amount is withdrawing:  ......");
                }
                else{
                    System.out.println("Please Enter Amount less than 25000 : ");
                }
        

            }
           else
           {
                System.out.println("Please enter correct title : ");
           }
        }
        else{
            System.out.println("Please Enter Correct Pin code: ");
        }
    
        
        
                
      
    

    }
}