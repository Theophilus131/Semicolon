import java.util.Scanner;

public class NumYear{
public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
  int Minutes = input.nextInt();

int MinYear = 365 * 24 * 60;
int MinDay = 24 * 60;

int Years = Minutes / MinYear;
int remMinutes = Minutes % MinYear;
int Days = remMinutes / MinDay;



System.out.printf(" minutes is approximately %d years and %d days.%n", Years, Days);





}

}