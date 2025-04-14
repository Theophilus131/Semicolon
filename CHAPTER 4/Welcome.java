//  gives a program that prompts the user to enter 
//an answer for a question on addition of two single digits. //Using a loop, you can now rewrite 
//the program to let the user repeatedly enter a new answer until //it is correct,
 //int number1 = (int)(Math.random() * 10);
 // int number2 = (int)(Math.random() * 10);

import java.util.Scanner;
 public class Welcome{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
int number1 = 0;
 int number2 = 0;

System.out.print("what is :" + number1 + " + " + number2 + "? ");
  int answer = input.nextInt();

  while( number1 + number2 != answer){

 System.out.println("wrong answer. try agian. What is " + number1 + " +" + number2+ "?");
    answer = input.nextInt();
}

 System.out.println("you got it right");
 



}

}