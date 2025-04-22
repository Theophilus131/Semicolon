 /* (Multiples) Write an application that reads two integers, determines whether the first
 number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
 remainder operator.] */ 

import java.util.Scanner;

 public class Multiples{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

  System.out.print("Enter the first integer: ");
   int firstInteger = input.nextInt();

System.out.print("Enter the second integer: ");
   int secondInteger = input.nextInt();


    int A =     firstInteger  * 3;
     int B =     secondInteger * 2;


 if( A % B == 0)

 System.out.printf(" number %d  tripled is  multiple of %d doubled", A, B);





}




}