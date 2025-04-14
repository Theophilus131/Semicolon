import java.util.Scanner;

public class ProductAndSum{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

 System.out.print("input First Integer: ");
    int input1 = input.nextInt();

 System.out.print("input Second Integer: ");
  int input2 = input.nextInt();

if( input1 > 0  && input2 > 0 ){
if (input1 < 0  && input2 < 0){

}
}
int product = input1 * input2;
 System.out.println("product is: " + product);


if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)) {
            int product = num1 * num2;
            System.out.println("Both numbers have the same sign. Product: " + product);
        } else {
            int sum = num1 + num2;
            System.out.println("Numbers have different signs. Sum: " + sum);
        }



}


}