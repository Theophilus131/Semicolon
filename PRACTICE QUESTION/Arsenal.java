 import java.util.Scanner;

public class Arsenal{
public static void main (String [] args){


Scanner input = new Scanner (System.in);

int total = 0;
 int gradeCounter = 1;

  while( gradeCounter <= 10){

System.out.print("enter the next grade: ");
  int grade = input.nextInt();

 total = total + grade;
  gradeCounter++;

}
int Average = total / 10 ;
System.out.printf("the total of all the grade is %d%n :", total);
System.out.printf("the average is %d%n: ", Average);





}
}