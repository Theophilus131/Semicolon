import java.util.Scanner;

 public class CostOfDriving{
public static void main(String... args){

Scanner input = new Scanner(System.in);

  System.out.print("Enter the driving distance: ");
   double A = input.nextDouble();

 System.out.print("Enter fuel efficiency :");
  double B = input.nextDouble();
 
 System.out.print("Enter price per gallon:  ");
   double C = input.nextDouble();

double Cost = A/B * C;

  System.out.printf("cost of driving is %.2f%n:", Cost);






}





}