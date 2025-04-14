import java.util.Scanner;
public class Arithemetic{
public static void main (String [] args){

Scanner input = new Scanner(System.in);

 System.out.print("Enter two integers: ");
   int input1 = input.nextInt();
    int input2 = input.nextInt();

 int sum = input1 + input2;
 int product = input1 * input2;
   int average = (input1 + input2) / 2;
   int Distance = input1 - input2;
     int Max  =  Math.max(input1, input2);
     int Min =  Math.min(input1, input2);

  System.out.println("Sum of two integers:" + sum);
  System.out.println("product of two integers: " + product);
  System.out.println("average of two integers: " + average);
  System.out.println("Distance of two integers:" + Distance);
 System.out.println(" Max integer:" + Max);
  System.out.println("Min integer: " + Min);




}

}