import java.util.Scanner;
public class Checker{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("please insert a number");
int num = input.nextInt();
if(num % 3 == 0) {
System.out.print("yes, you are good to go");
}else {
System.out.print("your number is not divisible");
}
}
}