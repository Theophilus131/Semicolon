import java.util.Scanner;

 public class DifferenceInteger{
public static void main (String [] args){

 Scanner input = new Scanner(System.in);

  System.out.print("input two integers: ");
    int input1 = input.nextInt();
    int input2 = input.nextInt();
    
 if( input1 > input2){

 
 int Difference = input1 - input2;

  System.out.println("output is " + Difference);

}


}
}