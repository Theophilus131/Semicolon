import java.util.Scanner;

public class Table{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

 System.out.print("Enter first number:");
  int number1 = input.nextInt();

System.out.print("Enter second number:");
  int number2 = input.nextInt();

System.out.print("Enter third number:");
  int number3 = input.nextInt();

System.out.print("Enter fourth number:");
  int number4 = input.nextInt();

int A = number1 * number1;
 int A1= number1 * number1 * number1;

int B = number2 * number2;
 int B1 = number2 * number2 * number2;

int C = number3 * number3;
 int C1 = number3 * number3 * number3;

int D = number4 *number4;
int D1 = number4 * number4 * number4;

System.out.printf("%-10s%-10s%-10s%n",             "a",    "a^2",     "a^3 ");
System.out.printf("%-10d%-10d%-10d%n",number1, A, A1 );
System.out.printf("%-10d%-10d%-10d%n",number2, B, B1);
System.out.printf("%-10d%-10d%-10d%n",number3, C, C1);
System.out.printf("%-10d%-10d%-10d%n",number4, D, D1);


}




}