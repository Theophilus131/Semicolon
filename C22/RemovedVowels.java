// your task is to write a function that takes a string and return a new string with all vowels removed.
 
 //for example, the string " the website is for losers LOl!" wound become " ths wbsts fr lsrs ll;

  import java.util.Scanner;
  public class RemovedVowels{
  public static void main(String [] args){

  Scanner input = new Scanner(System.in);

   System.out.println(" Enter words ");
   String userInput = input.nextLine();


String theo = userInput.replaceAll("[aeiouAEIOU]", "");

 
 System.out.println(theo);
   

}


}