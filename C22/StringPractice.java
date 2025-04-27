//Write a small Java program that:
//Asks the user to enter their full name.
//Prints:
//How many characters their name has.
//Their name in ALL capital letters.
//The first letter of their name.

		import java.util.Scanner;
 		public class StringPractice{
 		public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);


	System.out.println("Enter full name :");
        String userInput = scanner.nextLine();

// To make the name in capital letters
String capitalName = userInput.toUpperCase();
System.out.println("Thier name in capital letter is: " + capitalName);

char Firstletter = userInput.charAt(0);
System.out.println("first letter of the name: " + Firstletter);

int length = userInput.length();
System.out.println("the length is: " + length);

}

 }