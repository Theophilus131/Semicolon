//Write a program to find maximum between three numbers

import java.util.Scanner;
public class MaximumThree{
public static void main(String [] args){


 Scanner input = new Scanner (System.in);
System.out.print("Enter three numbers: ");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();

if( num1 >= num2 && num1 > num3){
System.out.println("The maximum is: +num1");}

else if (num2 >= num1 && num2 >= num3){
System.out.println("The maximum is num2");

}

else if(num3 >= num1 && num3 >= num1){
System.out.println("The maximum is: +num3");
}

}}