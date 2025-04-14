//class-average problem using sentinel-controlled iteration, 
// where we keep collecting grades until someone gives us a special signal (like -1) to stop. 
//Then we figure out the average of all the grades we got


import java.util.Scanner;
   
  public class AverageSentinel{
 public static void main(String... args){

  Scanner input = new Scanner(System.in);
   

//  initialization phase
   int total = 0;       //
   int counter = 0;       //


// processing phase
 System.out.print("Enter grade (stop at -1 ): ");     // enter number and stop when u see -1
   int grade = input.nextInt();                          //enter next number and store in grade

   while( grade != -1){                               								//  keep on adding numbers but stop when i add -1 to the number  
     total = total + grade;                              // add grade together to give the total
     counter = counter + 1;                             // keep on adding number

System.out.print("Enter grade (or stop at -1): ");   
       grade = input.nextInt(); 
}                       // enter the next number
 

 // termination phase

 if (counter != 0){                                  // did we see any number
     double average = (double) total / counter ;         // split the number equally

   System.out.printf(" total is grade is of grade entered:  %d%n", total, counter );

System.out.printf(" class average is: %.2f", average);
}
 else {
System.out.println("no grades entered");
}


  


}
}

