public class CompoundInterest{
public static void main(String [] args){

double Principal = 1000;
double annualRate = 0.05;
int numberYear=1;

for( numberYear=1; numberYear <= 10; numberYear ++  ){

double amountDeposit = Principal * Math.pow(1 + annualRate, numberYear);


System.out.printf(" Year %d is %f%n amount ", numberYear, amountDeposit );



}







 
}









  }