import java.util.Scanner;

 public class OddAnEven{
public static void main(String args []){
int even = 0;
int odd = 0;
Scanner input = new Scanner(System.in);

 System.out.print("enter numbers: ");
 int num1 = input.nextInt(); 

int num2 = input.nextInt(); 

 int num3 = input.nextInt(); 
   
if (num1 % 2 == 0){
}
if (num2 % 2 == 0){ 
}
if (num3 % 2 == 0){
 
 even = num1 + num2 + num3;

}




if  (num1 % 2 != 0){
}
if (num2 % 2 != 0){
}
if (num3 % 2 != 0){

odd = num1 + num2 + num3;
}
System.out.printf("The Sum of even is %d%n", even);
 System.out.printf("Sum of odd is %d%n", odd);
}
}