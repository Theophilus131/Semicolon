import java.util.Scanner;

 public class Displaylargest{
public static void main(String [] args){

 Scanner input = new Scanner(System.in);
 
 System.out.print("enter integer: ");

  int firstNumber = input.nextInt(); int secondNumber = input.nextInt();
  
  
   if(firstNumber > secondNumber){
System.out.println("Result" + firstNumber);
   }

 if(secondNumber > firstNumber){
System.out.println("Result " + secondNumber);
}

if(firstNumber == secondNumber ){
  System.out.print(" 0 " );
 }


 if( firstNumber % 6 == 0){
 System.out.println("smallest is: " + firstNumber);
}
  if(firstNumber % 6 != 0){
 System.out.print("largest is: " + firstNumber  );
}

if(secondNumber % 6 == 0){
System.out.print("smallest is :" + secondNumber);
}

if(firstNumber % 6  !=0){
 System.out.print("largest is :" + secondNumber);
}




}



}