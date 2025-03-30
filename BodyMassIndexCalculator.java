  import java.util.Scanner;

 public class BodyMassIndexCalculator{
 public static void main(String... args){

   Scanner input = new Scanner(System.in);
 

   System.out.print("Enter weight");

     int weight = input.nextInt();

  System.out.print("enter height");
   int height = input.nextInt();

 int BMI = weight / height * height;

 System.out.printf("BMI is  %d", BMI);



}






}