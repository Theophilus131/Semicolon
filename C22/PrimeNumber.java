	public class PrimeNumber{
	public static void main(String [] args){
	
	for( int number =1; number <= 100 ; number++){	
		int prime = 0;
          
	for(int i =2; i <= number/2; i++){
		if(number % i == 0){
			prime = prime + 1;
				
	
		}
		}
			if(prime == 0 && number !=1 ){
			System.out.println(number);
	
	}
	
}

			}



		}