    import ja

  
 	public class TrianglePrinting{
	public static void main(String [] args){


	for( int i = 1; i<=10; i++){

	for(int j= 1; j<= i; j++){   

   	System.out.print("*");
  
 		}

 	System.out.println("  ");
	}
		System.out.println();
  


  for(int i = 1; i <= 10; i++ ){

        for(int j =10; j >=i; j--){
           System.out.print("*");
           }
   
	  System.out.println();

		}

	System.out.println();
  
	
	for(int i= 1; i <= 10; i++)
    {

            for(int j = 1; j <= i; j++)
                {System.out.print(" ");}
                
 		for(int a= 10; a >= i; a--)
                   {System.out.print("*");}
           
             System.out.println();
              
     }
   

     System.out.println();
      

	 for(int i = 1; i <= 10; i++){
          
  	for(int j = 10; j>= i; j--)
           {System.out.print(""); }
   
         for(int a = 1; a<=i; a++)
             {System.out.print("*");}
            
            System.out.println();
       


             
        }




}





	import java.util.Scanner;

 	public class BinarySum{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

 	System.out.print("enter firstNumber");
  	int firstNumber= input.nextInt();

 	System.out.print("enter firstNumber");
   	int secondNumber = input.nextInt();

  
	int Sum = firstNumber + secondNumber;
  
	//String binaryString = Integer.toBinaryString(number);
	String binaryString = Integer.toBinaryString(number);


}


}


