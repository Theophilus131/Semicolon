//(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
 //the user and prints the square of each, the sum of their squares, and the difference of the squares (first
 //number squared minus the second number squared).


 import java.util.Scanner;


public class Arithmetic2{
 public static void main (String... args){


Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer: ");
   int first = input.nextInt();

  System.out.print("Enter Second integer: ");
   int second = input.nextInt();

 int square1 = first * first;
 int square2 = second * second;

 int sum = (first * first) + (second * second);
 
 int diff = (first * first) - (second * second);

System.out.printf("the square1 is %d%n:", square1);
System.out.printf("the square2 is %d%n:", square2);
System.out.printf("the sum is %d%n:", sum);
System.out.printf("the diff is %d%n:", diff);







}



}