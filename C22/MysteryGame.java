//its game called a mystery game. when the apps run, it will ask u guess my number.. random number 1 to 10. if any number was generated, it comapres.. eg 
    //when a user enters 5 and d computer generate 8 = first guess to highs or too lows or d same number, u are correct.... if not u lose

import java.util.Scanner;
import java.util.Random;
public class MysteryGame{
public static void main(String [] args){


Scanner input = new Scanner(System.in);

Random random = new Random();
System.out.print(random);
int computerNumber = random.nextInt(0, 11);

System.out.println("Enter number from 1 - 10: ");
 int userNumber = input.nextInt();

if(userNumber < 1){
System.out.println(" invalid : ");}
else{

 if( userNumber  == computerNumber){
System.out.println("you are correct");
}

 if( userNumber > computerNumber){
System.out.println(" number entered is to high: ");
}

if(userNumber < computerNumber){
System.out.println("number entered is to low: ");
}
}


System.out.println(" Try again : ");
  userNumber = input.nextInt();

 if( userNumber  == computerNumber){
System.out.println("you are correct");
}
else{
if( userNumber > computerNumber){
System.out.println(" number entered is to high: ");
}

if(userNumber < computerNumber){
System.out.println("number entered is to low: ");
}
}

System.out.println(" Try again : ");
  userNumber = input.nextInt();

 if( userNumber  == computerNumber){
System.out.println("you are correct");
}
else{
if( userNumber > computerNumber){
System.out.println(" number entered is to high: ");
}

if(userNumber < computerNumber){
System.out.println("number entered is to low: ");
}
}


System.out.println(" game over the number is: " + computerNumber);



}



}