
import java.util.Scanner;
public class Ave{
public static void main(String [] args){

 Scanner input = new Scanner(System.in);

int total = 0;
int counter = 0;

System.out.print("enter  grade or -1 to end the whole process: ");
  int grade = input.nextInt();

while(grade != -1){
 total = total + grade;
 counter = counter + 1;

System.out.print("enter grade or-1 to end the whole process: ");
   grade = input.nextInt();

}

 if (counter != 0 ){

  double average = total / counter;

   System.out.printf("total is %d%n", total);
 System.out.printf("average is %f%n:", average);
}


else{
  System.out.print("No grades were entered");
}
  



}



}