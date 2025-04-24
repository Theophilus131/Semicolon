 //(Count positive and negative numbers and compute the average of numbers) Write 
//a program that reads an unspecified number of integers, determines how many 
//positive and negative values have been read, and computes the total and average of 
//the input values (not counting zeros). Your program ends with the input 0. Display 
//the average as a floating-point number. 

	import java.util.Scanner;
	public class CountPositiveNegativeNumber{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
        
	int countPositive = 0;
        int countNegative = 0;
	int resultPositive = 0;
        int resultNegative = 0;
	int counter = 1;
        int total = 0;
	double average = 0;
	
	while(counter != 0){
	 System.out.print("Enter integers and enter (0) to stop: ");
	int number = input.nextInt();
	if (number == 0){
		break;
             }
	total +=number;
	average = (double) total/counter;
	counter++;
         

	if(number > 0){
          countPositive++;
		resultPositive += number;
		}

	if(number < 0){
		countNegative++;
                resultNegative += number;
		}
	
	//average = (resultPositive + resultNegative) / (countPositive + countNegative);
	

}

	System.out.println("The number of Postives Numbers are: " + countPositive);
	System.out.println("The number of Negative Numbers are : " + countNegative);
	System.out.println("the total is : " + total);
	System.out.println("the average is :" + average);



}



}