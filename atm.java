import java.util.Scanner;
class atm 
{
   
    Scanner s=new Scanner(System.in);
    public int amt_wdraw(int bal)
    {
       System.out.println("\nEnter the amount to be withdrawn"); 
       int w=s.nextInt();
       System.out.println("Withdrawn Successfully!!!");
       bal=bal-w;
       //System.out.println(bal);
       return(bal);
       
    }
    public int amt_dep(int bal)
    {
       System.out.println("\nEnter the amount to deposit: "); 
       int dep=s.nextInt();
       System.out.println("Deposited Successfully!!!");
       bal=bal+dep;
       return(bal);
    }
    public int check_bal(int bal)
    {
       System.out.println("Your Balance is "+bal); 
       return(bal);
    }
    public static void main(String args[])
    {
        System.out.println("\n\n             WELCOME TO AUTOMATIC TELLER MACHINE            ");
        int bal=15000;
        System.out.println("\n\nYour Balance is "+bal);
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n\nPress 1 to Withdraw the amount \nPress 2 to Deposit the amount \nPress 3 to Check the Balance in your account\nPress 4 to exit : ");
            atm obj=new atm();
            
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:bal=obj.amt_wdraw(bal);
                       break;
                case 2:bal=obj.amt_dep(bal);
                       break;
                case 3:bal=obj.check_bal(bal);
                       break; 
                case 4:System.out.println("Thank You...Visit Again!!!");
                       System.exit(0);

            }
            
        }
    }
}