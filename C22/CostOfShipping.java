
// create  a class name as CostOfShipping 
//  create a main method
// initialize the scanner to enter the weight of the package ( store it in a variable container name weightPackage)
//  if the weight of the package entered is greater than  0 and less than equal to 1, display 3.5 as the shipping cost
// if the weight entered is less than 1 and greater than equal to 3, display 5.5 as the shipping cost
//  if the weight entered is less than 3 and greater than equal to 10, display 8.5 as the shipping cost
// if the weight entered is less than 10 and greater than equal to 20, display 10.5 as the shipping cost
//  if the weight entered is greater than 20,
 // Display package cannot be shipped


import java.util.Scanner;
public class CostOfShipping{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight of the package: ");
 double weightPackage = input.nextDouble();

if( weightPackage > 0 && weightPackage <= 1 ){

System.out.println("the shipping cost is: 3.5 ");
}

if( weightPackage > 1 && weightPackage <= 3){
System.out.println("the shipping cost is : 5.5");
}

if( weightPackage > 3 && weightPackage <= 10 ){
System.out.println("the shipping cost is : 8.5");
}

if( weightPackage > 10 && weightPackage <= 20){
System.out.println("the shipping cost is : 10.5");
}

if( weightPackage > 20){
System.out.println("Package cannot be shipped");

}







}
}