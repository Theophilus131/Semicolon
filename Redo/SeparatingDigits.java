/*Separating the Digits in an Integer) Write an application that inputs one number consist
ing of five digits from the user, separates the number into its individual digits and prints the digits
 separated from one another by three spaces each. For example, if the user types in the number 42339,
 the program should print */

import java.util.Scanner;
public class SeparatingDigits{
 public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print(" input five digits: ");
 int number = input.nextInt();

 int number1 = 0;
 int number2 = 0;
 int number3 = 0;
 int number4 = 0;
 int number5 = 0;

 if( number >= 10000){
   if(number <=  99999){

 number1 = number / 10000;

  number = number - number1 * 10000; 

number2 = number / 1000;
  number = number - number2 * 1000;

number3 = number / 100;
number = number - number3 * 100;

 number4 = number / 10;

   number = number - number4 * 10;

  number5 = number;

System.out.printf("%d    ", number1);
System.out.printf("%d    ", number2);
System.out.printf("%d    ", number3);
System.out.printf("%d    ", number4);
System.out.printf("%d    ",  number5);


}
}














}



}