import java.util.Scanner;
public class ConvertPtoK{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");

 double Pounds = input.nextDouble();
  
 double Convert = 0.454 * Pounds;
 
System.out.printf("the kilogram is %f%n:", Convert);



}
}