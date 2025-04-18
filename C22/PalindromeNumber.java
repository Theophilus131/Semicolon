import java.util.Scanner;

public class PalindromeNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

 System.out.println("Enter three integers: ");
   int Number = input.nextInt();

  if( Number < 999){
  if(Number > 1){
System.out.println(" good to go: ");





int firstNumber = ( Number / 100);
int secondNumber= ( Number / 10) % 10; 
int thirdNumber = Number % 10;


if( firstNumber == thirdNumber){
System.out.println("  is a palindrome number: " + Number );
}

else{
System.out.println("   is not a palindrome: " + Number);
}

}}


  if( Number > 999){
  if(Number > 1){
System.out.println(" invalid: ");
}}






}



}