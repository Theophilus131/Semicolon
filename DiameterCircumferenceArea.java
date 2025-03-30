import java.util.Scanner;
 
 public class DiameterCircumferenceArea{
 public static void main(String... args){

   Scanner input = new Scanner(System.in);

   System.out.print("Enter Radius:  ");
 
  double Radius = input.nextDouble();

    Double Diameter = 2 * Radius;
   System.out.printf("Diameter is %.2f%n", Diameter );
 
 double Circumference = 2 * 3.14159 * Radius;
    System.out.printf("Circumference is %.2f%n", Circumference);

   double Area = 3.14159 * Radius * Radius;
   System.out. printf("Area is %.2f", Area);


 }





}