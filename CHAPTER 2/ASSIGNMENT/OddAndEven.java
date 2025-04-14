import java.util.Scanner;

 public class OddAndEven{
public static void main(String args []){
int even = 0;
int odd = 0;
Scanner input = new Scanner(System.in);

 System.out.print("enter numbers: ");
 int num1 = input.nextInt(); 

int num2 = input.nextInt(); 

 int num3 = input.nextInt(); 

 int num4 = input.nextInt(); 

 int num5 = input.nextInt(); 

 int num6 = input.nextInt(); 
   
if (num1 % 2 == 0){
	even = even + num1;
}
if (num2 % 2 == 0){ 
  even = even + num2;
}
if (num3 % 2 == 0){
 even = even + num3;
}

if (num4 % 2 == 0){
  even = even + num4;
}
if (num5 % 2 == 0){
   even = even + num5;
}
if (num6 % 2 ==0){
   even = even + num6;
}

System.out.printf("The Sum of even is %d%n", even);


if  (num1 % 2 != 0){
    odd = odd + num1;
}
if (num2 % 2 != 0){
   odd = odd + num2;
}
if (num3 % 2 != 0){
     odd = odd + num3;
}
if (num4 %2 != 0){
   odd = odd + num4;
}
if (num5 % 2 != 0){
   odd = odd + num5;
}
if (num6 % 2 !=0){
    odd = odd + num5;
}



System.out.printf("Sum of odd is %d%n", odd);

}
}