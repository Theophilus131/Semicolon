//Explanation for better understanding
collecting candies from 10 friends, how many could each get when shared equally.
The Bucket (total): You start with an empty bucket (total = 0) to hold all the candies.

Counting Fingers (counter): You use your fingers (counter = 0) to count how many friends you’ve asked so far.

The Loop (while): You keep asking, “How many candies do you have?” and add them to your bucket (total = total + grade). Each time, you lift one more finger (counter = counter + 1) until you’ve asked 10 friends (counter < 10).

Stop at 10: When your 10 fingers are up (well, pretend—you’ve got 10 counts!), you stop asking.

Share the Candies (average): You count all the candies in the bucket (total) and split them into 10 piles (total / 10). That’s the average!






import java.util.Scanner;                                   
public class ClassAverage{
 public static void main(String... args){

   Scanner input = new Scanner(System.in);

    int total = 0;                         // this is like a canddy bucket, it starts empty
     int counter = 0;                      // our finger counter or number of times we will have to itrate which is 10 times.

      
 while ( counter < 10 ) {                // keep going until we count 10 grades
System.out.print("Enter grade:");        // asking for a garde
int grade = input.nextInt();             // get the grade
 total = total + grade;                  // add it to the bucket of canddy
  counter = counter + 1;                 // keep on adding 1 more to the grade
}


 int average = total/ 10;               // split the total grade by 10
  
System.out.printf("Total of all grade is %d%n", total);
 System.out.printf("average of all grade is %d%n", average);























}







}