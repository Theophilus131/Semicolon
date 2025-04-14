import java.util.Scanner;

public class MinusNumber {
public static void main(String [] args){

Scanner input = new Scanner(System.in);

 int minus = 0;
  int counter = 0;
int stop = 0000;

System.out.println("Enter any integer and end process when -1 is inputed: "+ stop);
 int integer = input.nextInt();

while( integer != stop){
  minus = integer - minus;
  integer = input.nextInt();
  counter++;  
}

 System.out.printf("The difference of the numbers is %d%n ", minus);


}

}