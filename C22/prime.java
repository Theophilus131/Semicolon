public class prime{
public static void main(String [] args){
 int count = 0;
for( int number = 2; number <= 50 ; number++){
	count = 0;
	 
	for(int i = 1; i <= 50; i++){
	 if(number % i == 0){
	   count++;
	}
	
}
	if(count == 2){
	System.out.println(number);
}
}
		

}
}