 //(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
 //user and displays the sum, average, product, smallest and largest of the numbers.
 //[Note: The calculation of the average in this exercise should result in an integer
 //representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]

import java.util.Scanner;
 public class ArithmeticSmallestLargest{
public static void main (String... args){

   Scanner input =new Scanner(System.in);

  System.out.print ("please enter first number:");
   int num1 = input.nextInt();

 System.out.print("please enter second number:");
  int num2 = input.nextInt();
 
  System.out.print("please enter third number: ");
   int num3 = input.nextInt();

  int sum = num1 + num2 + num3 ;
  int average = (num1 + num2 + num3)/3;
  int product = num1 * num2 * num3;
    

System.out.printf("sum is %d%n:", sum);
System.out.printf("average is %d%n:", average);
 System.out.printf("product is %d%n:",product);


  if(num1 >= num2 && num1 >= num3){
 System.out.print(" largest in the group is number 1");
}
 if (num2 >= num1 && num2 >= num3){
System.out.print("largest in the group is number 2");
}

 if (num3 >= num1 && num3 >= num2){
  System.out.print("largest in the group is 3");
}



  if(num1 <= num2 && num1 <= num3){
 System.out.print(" smallest in the group is number 1 \n");
}
 if (num2 <= num1 && num2 <= num3){
System.out.print("smallest in the group is number 2 \n ");
}

 if (num3 <= num1 && num3 <= num2){
  System.out.print("smallest in the group is 3 \n ");
}








 





}


}