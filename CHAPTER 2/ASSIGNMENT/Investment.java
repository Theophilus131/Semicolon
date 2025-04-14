import java.util.Scanner;

public class Investment{
public static void main(String... args){

 Scanner input = new Scanner(System. in);


  System.out.print("enter the investment amount: ");
double A = input.nextDouble();
 System.out.println("enter annual interest rate: ");
  double R = input.nextDouble();

System.out.println("enter number of year: ");
double Y = input.nextDouble();



double I = R * (1 + R ) * Math.pow(Y, 12);

 System.out.printf("Future investment Value is %f%n:", I);



}



}