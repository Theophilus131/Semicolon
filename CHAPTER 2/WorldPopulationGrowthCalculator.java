//Pt = Po (1 + r)^t;
//Pt: The final value (e.g., future amount, population) after time t.
//Po: The initial value (e.g., starting amount, initial population) at time t = 0.
//r: The growth rate per period (as a decimal, e.g., 5% = 0.05). Positive r means growth; negative r means decay.
//t: The number of time periods (e.g., years, months).
//(1 + r)^t: The growth factor raised to the power of t, reflecting how the value compounds over time.




import java.util.Scanner;

public class WorldPopulationGrowthCalculator{
 public static void main(String... args){
  
 Scanner input = new Scanner(System.in);

 double firstYearEstimatedpopulation = 0;
  double secondYearEstimatedpopulation = 0;
double thirdYearEstimatedpopulation = 0;
double fourthYearEstimatedpopulation = 0;
double fifthYearEstimatedpopulation = 0;


 
System.out.println("Enter current World population Growth: ");
     double worldPopulationGrowth = input.nextDouble();


System.out.println("Enter annual world popultion Growth: ");
 double annualWorldpopulationGrowthrate   = input.nextDouble();


 
          firstYearEstimatedpopulation  =  worldPopulationGrowth * (1 + annualWorldpopulationGrowthrate );
         
          secondYearEstimatedpopulation = firstYearEstimatedpopulation * ((1 + annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  ));

          thirdYearEstimatedpopulation   = secondYearEstimatedpopulation * ((1 + annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  )) * (1 +     		annualWorldpopulationGrowthrate );


          fourthYearEstimatedpopulation  = thirdYearEstimatedpopulation *  ((1 + annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  )) * ((1 + 			annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  ));



	  fifthYearEstimatedpopulation   = fourthYearEstimatedpopulation  *  ((1 + annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  )) *((1 +        		annualWorldpopulationGrowthrate ) * (1 + annualWorldpopulationGrowthrate  )) * (1 + annualWorldpopulationGrowthrate );




      System.out.printf("  EstimatedWorldPopulation1 for the first year is  %f%n",     firstYearEstimatedpopulation );    
      System.out.printf(" EstimatedWorldPopulation1 for the second year is  %f%n    ", secondYearEstimatedpopulation);
      System.out.printf(" EstimatedWorldPopulation1 for the third year is  %f%n    ",   thirdYearEstimatedpopulation);
      System.out.printf(" EstimatedWorldPopulation1 for the fourth year is  %f%n    ", fourthYearEstimatedpopulation);
      System.out.printf(" EstimatedWorldPopulation1 for the fifth year is  %f%n    ",  fifthYearEstimatedpopulation);
     



   




}
}