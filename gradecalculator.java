import java.util.Scanner;
class gradecalculator
{
   public static void main(String args[])
   {    
        System.out.println("\n");
        System.out.println("\n             *****GRADE CALCULATOR*****\n");
        Scanner s=new Scanner(System.in);
        int tot=5;
        System.out.println("TOTAL SUBJECTS : "+tot);
        System.out.println("ENTER THE MARK OF SUBJECT 1 : ");
        int sub1=s.nextInt();
        System.out.println("ENTER THE MARK OF SUBJECT 2 : ");
        int sub2=s.nextInt();
        System.out.println("ENTER THE MARK OF SUBJECT 3 : ");
        int sub3=s.nextInt();
        System.out.println("ENTER THE MARK OF SUBJECT 4 : ");
        int sub4=s.nextInt();
        System.out.println("ENTER THE MARK OF SUBJECT 5 : ");
        int sub5=s.nextInt();
        int totmark=sub1+sub2+sub3+sub4+sub5;
        System.out.println("TOTAL MARKS OBTAINED : "+totmark);
        int percent=totmark/5;
        System.out.println("PERCENTAGE OBTAINED  : "+percent);
        if((percent>=0) &&(percent<=10))
        {
                 System.out.println("YOUR GRADE IS F.....TRY WELL!!");
        }
        if((percent>=113) &&(percent<=25))
        {
                 System.out.println("YOUR GRADE IS D.....FAIR!!");
        }
        if((percent>=25) &&(percent<=40))
        {
                 System.out.println("YOUR GRADE IS C.....SATISFACTORY!!");
        }
         if((percent>=41) &&(percent<=60))
        {
                 System.out.println("YOUR GRADE IS B.....GOOD!!");
        }
         if((percent>=61) &&(percent<=70))
        {
                 System.out.println("YOUR GRADE IS A.....VERYGOOD!!");
        }
         if((percent>=70) &&(percent<=85))
        {
                 System.out.println("YOUR GRADE IS A+.....EXCELLENT!!");
        }
         if((percent>=85) &&(percent<=100))
        {
                 System.out.println("YOUR GRADE IS O.....OUTSTANDING!!");
        }
    }
}
        
        
     
