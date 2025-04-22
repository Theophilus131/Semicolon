 //Write a program to find maximum between two numbers
import java.util.Scanner;
public class Maximum{
public static void main(String [] args){


 Scanner input = new Scanner (System.in);
System.out.print("Enter two numbers");
int number1 = input.nextInt();
int number2 = input.nextInt();


if (number1 > number2){
  System.out.println("the maximum number is number1");

}
else
System.out.println("the maximum is number2");
 
}
}