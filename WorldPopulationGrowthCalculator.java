import java.util.Scanner;

public class WorldPopulationGrowthCalculator{
 public static void main(String... args){
  
 Scanner input = new Scanner(System.in);

System.out.print("Enter current World population Growth: ");
    double WorldPopulationGrowth = input.nextDouble();


System.out.print("Enter annual world popultion Growth: ");

 double  AnnualWorldPopulationGrowth = input.nextDouble();

    double EstimatedWorldPopulation1 = 1 * WorldPopulationGrowth * AnnualWorldPopulationGrowth;
          
      System.out.printf("  EstimatedWorldPopulation1 is  %.2f", EstimatedWorldPopulation1 );    





   




}
}