import java.util.Scanner;

public class SubtractionQuiz{
 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

int number1 = (int)Math.random() * 10;
int number2 = (int)Math.random() * 10;

if(number1 < number2){
  int swap =number1;
  number1 = number2;
  number2 = swap;
}

System.out.print("what is " + number1 + " - "  + number2 + " ? ");
  int answer = input.nextInt();

if(number1 - number2 == answer)
 System.out.println("you are correct!");

 else{
System.out.println("your answer is wrong.");
System.out.println(number1 + "-" + number2 + "should be" + (number1-number2));

}








}

}