import java.util.Scanner;
import java.util.Random;
public class ScissorRockPaper{
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.print(" Enter Scissor(0), Rock (1), Paper (2):  ");
int userChoice = input.nextInt();

 Random random = new Random ();
   int computerChoice = random.nextInt(0, 3);

if(userChoice == 0 && computerChoice == 2 ){
 System.out.print("the computer is paper, you are scissor, you won ");
}

if( userChoice == 0 && computerChoice == 1){
System.out.print("the computer is rock, you are scissor, you lose ");
}

if(userChoice == 0 && computerChoice == 0){
System.out.print(" the computer is scissor, you are scissor, you lose");
}



if(userChoice == 1 && computerChoice == 2 ){
 System.out.print("the computer is paper, you are scissor, you won ");
}

if( userChoice == 1 && computerChoice == 0){
System.out.print("the computer is scissor, you are rock, you lose ");
}

if(userChoice == 1 && computerChoice == 1){
System.out.print(" the computer is rock, you are rock, it is a draw");
}



if(userChoice == 2 && computerChoice == 0 ){
 System.out.print("the computer is scissor, you are paper, you lose ");
}

if( userChoice == 2 && computerChoice == 1){
System.out.print("the computer is rock, you are paper, you lose");
}

if(userChoice == 2 && computerChoice == 2){
System.out.print(" the computer is paper, you are paper too. it is a draw");
}



 

 







}






}