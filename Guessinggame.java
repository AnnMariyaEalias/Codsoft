import java.util.Scanner;
class Guessinggame
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int my=87;
    int maxatt=10;
    int att=1;
    int roundtot=1;
    int Continue=1;
    while(Continue==1)
    {
       
       System.out.println("\n                 Welcome to guess the number challenge");
       //int user=s.nextInt();
       while(att<=maxatt)
       {
            System.out.println("\nEnter your number : ");
       int user=s.nextInt();
           if(my==user)
           {
               //int round=roundtot++;
               System.out.println("Congratulations!!!...you have guessed the right value\n \nYou have guessed it in  attempt number "+att+"\nTotal rounds won is "+roundtot++);
               break;
           }
           if(my>user)
           {
               System.out.println("Attempt "+att+"/"+maxatt+" : The value is less");
           }
           if(my<user)
           {
               System.out.println("Attempt "+att+"/"+maxatt+" : The value is high");
           }
        att++;
      }
       System.out.println("Do you want to continue???....Press 1 to continue and 0 to exit");
    Continue=s.nextInt();
  }
   System.out.println("\n            Thank you for participating in the game!!!");
 }
}