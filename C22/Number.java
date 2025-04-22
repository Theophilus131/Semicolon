	import java.util.Scanner;
	public class Number{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
     	System.out.print("enter number: ");
        int number = input.nextInt();

	for(int count = 0; count < 10; count++){
        number = input.nextInt();
	number = count;
	if( number % 2 == 0){
        System.out.println("the prime number are: " + count);

       }

}
	


	}

}