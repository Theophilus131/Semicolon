import java.util.Scanner;

 public class BodyMassIndex{
public static void main (String... args){

 Scanner input = new Scanner(System.in);

 System.out.print("Enter any number : ");

 double A = input.nextDouble();

System.out.print("Enter any number: ");
 double B = input.nextDouble();

  double weight = A * 0.45359237;
   double height = B * 0.0254;

 double BMI = (weight / (height * height));

System.out.printf("the Body mass index is %f%n", BMI);



  
}



}