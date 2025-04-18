//create a class name CurrencyExchange
//create a method
//import a scanner to take value from users
//initialaize the scanner to enter the exchange rate from currency to U.S dollars to RMB
// 
 


import java.util.Scanner;
public class CurrencyExchange{
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.print("enter the exchange rate from dollars to RMB: ");
   double dollarRmb = input.nextDouble();

if( dollarRmb < 0){
System.out.print(" enter the exchange rate must b greater than 0");
}
if(dollarRmb > 0){
  System.out.print("enter 0 to convert dollars to RMB and 1 vice versa: ");
      double Convert = input.nextDouble();
 }

if(Convert != 0 && Convert !=1 ){
     System.out.println("invalid");
}
else if(Convert == 0)
System.out.print("Enter the dollar amount: ");
   double Amount = input.nextDouble();
 
if(Convert == 0 && Convert == 1){

Convert = Amount * dollarRmb;

System.out.println(" $100.0 is yuan: " + Convert);

}



}






}

