import java.util.Scanner;

public class GasMileage{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


int TotalMiles = 0;
int TotalGallons = 0;

System.out.println(" Enter Miles Driven or (-1 to stop): ");

  int Miles = input.nextInt();

while (Miles != -1 ){

System.out.print("Enter Gallons used or (-1 to  stop): ");
  int gallons = input.nextInt();



 double tripMPG = (double) Miles  / gallons;

  TotalMiles = TotalMiles + Miles;
  TotalGallons = TotalGallons + gallons;


double overallMPG = (double) TotalMiles/TotalGallons;

System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);



}



}

}