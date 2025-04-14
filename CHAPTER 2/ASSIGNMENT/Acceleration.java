import java.util.Scanner;
public class Acceleration{
public static void main(String... args){

 Scanner input = new Scanner(System.in);

  System.out.print("Enter the starting Velocity: ");
  double Vo = input.nextDouble();


   System.out.print("Enter the ending velocity: ");
 double Vi = input.nextDouble();

System.out.print("enter Time span: ");
 double T = input.nextDouble();

      double Average = (Vo - Vi) / T ;

  System.out.printf("Average acceleration is %f%n ", Average);


 

 



















}
}