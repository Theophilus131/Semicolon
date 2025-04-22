	import java.util.Scanner;
	public class ReserveNumber{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
 	
	System.out.print("Enter number: ");
	int number = input.nextInt();
	 
        int reminder = 0; 
        int reverse = 0;

  	while(number != 0){
         reminder = number % 10;
	reverse =  reverse * 10 + reminder;
           number = number / 10; 
          
		 }


		System.out.println(reverse);
	}

}