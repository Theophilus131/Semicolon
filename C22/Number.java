 //asks user for a number between 1 to 10. when he give you enter number 6, it gives you six in word.

import java.util.Scanner;
public class Number{
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter number between 1 to 10 : ");
 int number = input.nextInt();

if(number < 0){
System.out.print("Enter number greater than 0: ");
}
if(number <= 10){
System.out.print(" enter numbers: ");
}

if( number == 1){
System.out.print(" number is ONE");
}

if(number == 2){
System.out.print("number is TWO");
}

if (number == 3){
System.out.print("number is THREE");
}


if(number == 4){
System.out.print("number is Four");

}

if(number == 5){
System.out.print("number is FIVE");
}

if(number == 6){
System.out.print("number is SIX");
}

if(number == 7){
System.out.print("number is SEVEN");

}
if(number == 8){
System.out.print("number is EIGHT");
}

if(number == 9){
System.out.print("number is NINE");
}

if(number == 10){

System.out.print("number is TEN");
}




}


}