import java.util.Scanner;

 public class Analysis{
public static void main(String...args){

   Scanner input = new Scanner(System.in);

    int studentCounter = 1; 
     int passes = 0;
      int failures = 0;

 while (studentCounter <= 10){
System.out.print("enter result (1 = pass, 2 = fail): ");
  int result = input.nextInt();

 if (result == 1){
passes = passes + 1;
} 
    else if(result == 2){
failures = failures + 1;
}
 

studentCounter = studentCounter + 1;

}

  System.out.println("passed:" + passes);
  System.out.println("failed:"+ failures);


if (passes > 8){
System.out.println("Bonus to the teacher");
}
 




}


}