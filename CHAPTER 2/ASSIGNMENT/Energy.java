import java.util.Scanner;

 public class Energy{
public static void main(String... args){
 Scanner input = new Scanner(System.in);


System.out.print("Enter amount of water in kilograms: ");
 double M = input.nextDouble();

 System.out.print("Enter Initial temperature: ");
 double To = input.nextDouble();

System.out.print("Enter Final temperature: ");
  double Ti = input.nextDouble();

double Q = M * (Ti - To) * 4184;

 System.out.printf("Energy is %f%n:", Q);






}




}