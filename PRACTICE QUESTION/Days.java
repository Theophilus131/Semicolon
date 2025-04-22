 //Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.Scanner;
public class Days{
public static void main(String [] args){


 Scanner input = new Scanner (System.in);
System.out.print("Enter numbers from 1 to seven :");
int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();
int number4 = input.nextInt();
int number5 = input.nextInt();
int number6 = input.nextInt();
int number7 = input.nextInt();

if (number1 == 1){
   System.out.println("Monday");
}
if (number2 == 2){
    System.out.println("Tuesday");
}

if(number3 == 3){
System.out.println("Wednesday");
}

if(number4 == 4){
System.out.println("Thursday");
}
if(number5 == 5){
System.out.println("Friday");
}





}}