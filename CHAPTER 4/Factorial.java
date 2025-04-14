// use for loop to multiply a number from 5 to 1


public class Factorial{
public static void main(String [] args){

int n = 5;
int factorial = 1;

for (int i = n; i >= 1; i --){ 
  
 factorial *= i;
}

System.out.printf("%n factorial of 5 is %d%n:", + factorial);



}

}