  import java.util.Scanner;

 public class SeparatingDigitsInteger{
public static void main(String... args){

 Scanner input = new Scanner(System.in);


 System.out.print("Enter integer: ");
  int num= input.nextInt();

  if (num >= 10000){
     if (num <= 99999){
    System.out.print("yes good to go");


  int firstnum = (num / 10000) % 10;
   int Secondnum =(num / 1000) % 10;
    int Thirdnum =(num / 100) % 10;
    int fourthnum =(num / 10) % 10;
     int fifthnum = num % 10;

System.out.printf("%n%d, %d, %d, %d, %d%n", firstnum, Secondnum, Thirdnum, fourthnum, fifthnum);
 
 }
}

if(num < 10000){
System.out.println("sorry, please input five digits");
}
if(num > 99999) {
System.out.println("sorry, please input five digit number");
}



}

}