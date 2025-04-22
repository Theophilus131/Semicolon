	import java.util.Scanner;

	public class PalindromeofLargersNo{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

 	System.out.println("Enter numbers : ");
   	int Number = input.nextInt();

	int reverse = 0;
        int reminder =0;
        int temp = Number;     // temp = temporarily

	while(temp != 0){

        reminder = temp % 10;
    	reverse = reverse * 10 + reminder;
          temp = temp/10;
     }

          if (Number == reverse){
	System.out.println(Number +  "is a palindrome number");	
 }
      else{ System.out.println(Number + "is not a palindrome number");}


	}
		}