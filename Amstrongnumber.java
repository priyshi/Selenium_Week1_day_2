package sunsep5;

public class Amstrongnumber {

	public static void main(String[] args) {
		
		int calculated = 0;
		int remainder;
		int input= 153;
		

		
		int original=input;
		
		while(input>0) {
			
			remainder=input%10;
		    calculated=calculated+(remainder*remainder*remainder);	
			input=input/10;
			}
		if (calculated==original) {
			System.out.println("Input: "+original+ " is a amstrong number");
		}	
		else{
				System.out.println("Input: "+original + " is not a amstrong number");
		
			
		}
		
		

	}

}
