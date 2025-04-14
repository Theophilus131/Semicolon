import java.util.Scanner;
import java.util.Random;
public class HeadTail{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
 
Random input = new Random ();

 int number = input.nextInt(0, 2);

System.out.println("Enter your guess 0 for HEAD and 1 for TAIL: ");
   int guess = scanner.nextInt();

 
if( number == 0 && guess == 1 ){
  System.out.println(" incorrect");
 }

if(number ==1 && guess == 1){
 System.out.println("correct");
}

if(number == 1 && guess == 0){
System.out.println("incorrect");
}

if(number == 0 && guess == 0){
System.out.println("correct");
}



}
}