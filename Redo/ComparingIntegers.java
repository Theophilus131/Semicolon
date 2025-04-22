 //(Comparing Integers) Write an application that asks the user to enter one integer, obtains
 //it from the user and displays whether the number and its square are greater than, equal to, not equal
 //to, or less than the number 100.



import java.util.Scanner;

 public class ComparingIntegers{
 public static void main (String... args){

 Scanner input = new Scanner(System.in);

  System.out.print("Enter integer: ");
     int num = input.nextInt();

   int square = num * num ;

  if( square >= 100){
System.out.printf(" square is greater than 100 %d%n:", square);

}

if(square == 100){
System.out.printf("sqare is equal too 100 %d%n:", square);
}

if(square != 100){
System.out.printf("square is not equal too 100  %d%n:", square);
}

if (square <= 100){
System.out.printf("square is less than 100 %d%n: ", square);
}





}







}