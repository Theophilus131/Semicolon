import java.util.Scanner;
 public class FinancialsCurrencyExchange{

 public static void main(String [] args){

Scanner input = new Scanner(System.in);
 
 System.out.print("enter the exchange rate from dollars to RMB: ");
   double exchangeRate = input.nextDouble();

  if( exchangeRate < 0){
System.out.print("exchange rate must be greater than 0: ");
}


if(exchangeRate > 0){
System.out.print("enter 0 to convert to dollars to RMB and 1 for vice versa: ");
}

double currencyChoice = input.nextDouble();


if(currencyChoice != 0 && currencyChoice != 0){
System.out.print("invalid entry");
}

else if(currencyChoice == 0 && currencyChoice == 1){
System.out.print("Enter the dollar amount: ");
}

  double dollarAmount = input.nextDouble();


if( dollarAmount <= 0){
System.out.print("the amount must be greater than 0 : ");
}

else if(dollarAmount  >0){
double dollarToRmb = dollarAmount * exchangeRate;
System.out.println("amount in dollars is yuan: " + dollarToRmb);
}

else if( currencyChoice == 0){
System.out.print("Enter the RMB amount :");
 
}

double rmbAmount = 0;

if (rmbAmount <= 0 ){
System.out.print("the amount must be greater than 0: ");

}

else if( rmbAmount > 0){

double rmbToDollars = rmbAmount / exchangeRate;

System.out.print("the amount in yuan is the amount in dollars" + rmbToDollars);
}











}


}