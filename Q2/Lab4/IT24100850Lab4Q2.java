import java.util.Scanner;

public class IT24100850Lab4Q2
{
      public static void main(String [] args)
      {

     Scanner input = new Scanner(System.in);
      
     double exMarks,labSub,markPre,labPre,finMark,totPres;
   
     System.out.print("Enter your exams marks : ");
      
     exMarks = input.nextDouble();

     if (exMarks < 0 || exMarks > 100)
     {
      
     System.out.print("Invaid Input for exam marks. Terminating program..");
    
     return;
     }

     System.out.print("Please enter the lab submission marks (out of 100) : ");
    
     labSub = input.nextDouble();
  
     if (labSub < 0 || labSub > 100)
     {
    
     System.out.print("Invaid Input for exam marks. Terminating program..");
   
     return;
     }

     System.out.print("Please enter the percentage given for the exam : ");  
  
     markPre = input.nextDouble();

     System.out.print("Please enter the percentage given for the exam:");

     labPre = input.nextDouble();

     if (markPre < 0 || markPre > 100)
     {
   
     System.out.print("The percentage must add ip to 100. Terminating the program..");
     
     return;
     }
 
     if (labPre < 0 || labPre > 100)
     {
   
     System.out.print("The percentage must add ip to 100. Treminating the program..");
  
     return;
     }

     totPres = markPre + labPre;

     if (totPres < 0 || totPres > 100)
     {
  
     System.out.print("The percentage add ip to 100. Terminating the program..");

     return;
     }

     finMark = (exMarks * markPre / 100) + ( labSub * labPre / 100);

     System.out.print("Final exam mark is : "  +  finMark);
     
     }
}
 
