import java.util.Scanner;

 public class AreaTriangle{
 public static void main(String...  args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter first point: ");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
  System.out.print("enter second point:");
double x2 = input.nextDouble();
 double y2 = input.nextDouble();
  System.out.print("Enter third point");
  double x3 = input.nextDouble();
double y3 = input.nextDouble();



double S1 = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
 double S2 = Math.sqrt(((x3 - x2)*(x3 - x2)) + ((y3 - y2)*(y3 - y2)));
  double S3 = Math.sqrt(((x3 -x1)*(x3 - x1) + (y3 - y1)*(y3 - y1)));

 
double s =  (S1 + S2 + S3)/2;

 double area = s*(s-S1)*(s-S2)*(s-S3);
double sqrt = Math.sqrt(area);

System.out.printf("area of triangle is %.2f%n: ", sqrt); 
















}





}