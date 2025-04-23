   		import java.util.Scanner;
		public class NumberLargest{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers: ");
		

		int largest = 0;
		
		for (int counter = 1; counter <= 10; counter++){
		int number = input.nextInt();
			//number=counter;
			if(number>largest){
				largest= number;}
		
			}
	System.out.println("the largest number is: " + largest);
}
}