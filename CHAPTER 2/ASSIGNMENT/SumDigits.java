import java.util.Scanner;

public class SumDigits{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
 System.out.print("Enter a number between 0 and 1000: ");
  int number = input.nextInt();

   int firstNumber= 0;
   int secondNumber= 0;
   int thirdNumber= 0;

    if( number >= 0){
     if( number < 1000){

System.out.println ("you are good to go: ");



  firstNumber = ( number / 100) % 10;

  secondNumber = (number / 10 ) % 10;
  
   thirdNumber = number % 10 ;

 int sum = firstNumber + secondNumber + thirdNumber ;

  System.out.printf("The sum of the digits is %d%n ", sum);
  
}
}
 
   


}


}