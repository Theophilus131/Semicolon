//(Largest and Smallest Integers) Write an application that reads five integers and determines
 //and prints the largest and smallest integers in the group. Use only the programming techniques you
 //learned in this chapter.

import java.util.Scanner;

 public class LargestSmallestInteger{
public static void main(String...args){

 Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer: ");
   int num1 = input.nextInt();

 System.out.print("Enter second integer: ");
   int num2 = input.nextInt();

 System.out.print("Enter third integer: ");
   int num3 = input.nextInt();

 System.out.print("Enter fourth integer: ");
   int num4 = input.nextInt();

 System.out.print("Enter fifth integer: ");
   int num5 = input.nextInt();

if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5){
    System.out.println("first number is largest in the group");
}

if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5){
    System.out.println("second number is largest in the group");
}

if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5){
    System.out.println("third number is largest in the group");
}

if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5){
    System.out.println("fourth number is largest in the group");
}

if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4){
    System.out.println("fifth number is largest in the group");
}


if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5){
    System.out.println("first number is smallest in the group");
}

if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5){
    System.out.println("second number is smallest in the group");
}

if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5){
    System.out.println("third number is smallest in the group");
}

if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5){
    System.out.println("fourth number is smallest in the group");
}

if (num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 >= num4){
    System.out.println("fifth number is smallest in the group");
}














}



}