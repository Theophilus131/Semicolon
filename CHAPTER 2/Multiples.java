 import java.util.Scanner;

  public class Multiples{
 
 public static void main(String... args){

  Scanner input = new Scanner(System.in);
 
   System.out.print("num1: ");
    int num1 = input.nextInt();

   System.out.print("num2: ");
    int num2 = input.nextInt();

  int a = 3 * num1;
  int b = 2 * num2;

    if (a % b== 0) {
   System.out.printf(" %d (times three) is a multiple of %d(times two)%n", num1, num2);
    
}


    if (a % b != 0) {
   System.out.print(" Result is not multiple");
}


}
}