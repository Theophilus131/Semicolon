import java.util.Scanner;

  public class RunwayLength{
  public static void main(String... args){

Scanner input = new Scanner(System.in);


System.out.print("Enter the Take off speed and the acceleration: ");

  double v = input.nextDouble();
  double a = input.nextDouble();

 double length = (v * v) / (2 * a);

 System.out.printf("The minimum runaway length is %.3f%n", length);

}
 

}