// collect five numbers from the users and print the largest, smallest and average of the even numbers

import java.util.Scanner;
public class LargeSmallAverageEvenNumbers{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

 System.out.print("Enter first number: ");
  int firstNumber = input.nextInt();

System.out.print("Enter second number: ");
  int secondNumber = input.nextInt();

System.out.print("Enter third number :");
  int thirdNumber = input.nextInt();

System.out.print("Enter fourth number: ");
  int fourthNumber = input.nextInt();

 System.out.print("Enter fifth number: ");
  int fifthNumber = input.nextInt();

if( firstNumber >= secondNumber && firstNumber >= thirdNumber && firstNumber >= fourthNumber && firstNumber >= fifthNumber){
System.out.println("the First number is the largest: " + firstNumber);
}

if( secondNumber >= firstNumber && secondNumber >= thirdNumber && secondNumber >= fourthNumber && secondNumber >= fifthNumber){
System.out.println("the second number is the largest: " + secondNumber);
}

if( thirdNumber >= secondNumber && thirdNumber >= firstNumber && thirdNumber >= fourthNumber && thirdNumber >= fifthNumber){
System.out.println("the third number is the largest: " + thirdNumber);
}

if( fourthNumber >= secondNumber && fourthNumber >= thirdNumber && fourthNumber >= firstNumber && fourthNumber >= fifthNumber){
System.out.println("the fourth number is the largest: " + fourthNumber);
}

if( fifthNumber >= secondNumber && fifthNumber >= thirdNumber && fifthNumber >= fourthNumber && fifthNumber >= firstNumber){
System.out.println("the Fifth number is the largest: " + fifthNumber);
}


if( firstNumber <= secondNumber && firstNumber <= thirdNumber && firstNumber <= fourthNumber && firstNumber <= fifthNumber){
System.out.println("the First number is the smallest: " + firstNumber);
}

if( secondNumber <= firstNumber && secondNumber <= thirdNumber && secondNumber <= fourthNumber && secondNumber <= fifthNumber){
System.out.println("the second number is the smallest: " + secondNumber);
}

if( thirdNumber <= secondNumber && thirdNumber <= firstNumber && thirdNumber <= fourthNumber && thirdNumber <= fifthNumber){
System.out.println("the third number is the smallest: " + thirdNumber);
}

if( fourthNumber <= secondNumber && fourthNumber <= thirdNumber && fourthNumber <= firstNumber && fourthNumber <= fifthNumber){
System.out.println("the fourth number is the smallest: " + fourthNumber);
}

if( fifthNumber <= secondNumber && fifthNumber <= thirdNumber && fifthNumber <= fourthNumber && fifthNumber <= firstNumber){
System.out.println("the Fifth number is the smallest: " + fifthNumber);
}

int even = 0;    
 int count = 0 ;
int Average = 0;

if( firstNumber % 2 == 0){
  even = even + firstNumber; 
  count = count + 1;
}
if( secondNumber % 2 == 0){
  even = even + secondNumber;
   count = count + 1;
}

if( thirdNumber % 2 == 0){
 even = even + thirdNumber;
   count = count + 1;
}
if( fourthNumber % 2 == 0){
 even = even + fourthNumber;
  count = count + 1;
}
if( fifthNumber % 2 == 0){
  even = even + fifthNumber;
   count = count + 1;
}

 Average = even / count;

System.out.println(" the average of even number is : " + Average);









}


}