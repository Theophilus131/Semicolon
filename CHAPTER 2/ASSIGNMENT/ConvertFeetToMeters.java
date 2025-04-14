import java.util.Scanner;

 public class ConvertFeetToMeters{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a value for feet: ");
  double F =input.nextDouble();

 double Convert = F * 0.305;

System.out.printf("feets converted to meters is %f:", Convert);



}




}