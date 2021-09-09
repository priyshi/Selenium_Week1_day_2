package sunsep5;

public class PalindromeOfNumber {
	//STEP 1 : Declare the variable as int =454;
	//STEP 2 : Hold the number in a temporary variable.
	//STEP 3 : Reverse that number.
	//STEP 4 : Compare the temporary number with the reversed number.
	//STEP 5 : If both numbers are the same, print "palindrome number".
	//STEP 6 : Else print "not palindrome number".
    //Expected Output
   //Pallindrome of the given number is : 454
	public static void main(String[] args) {
		int num=454, rem, sum =0;
		int Temp=num;
        while(num!=0) {
        	rem=num%10;
        	sum=sum*10+rem;
        	num=num/10;    	
        }
        
        if(Temp==sum) {
        	System.out.println("num : " + Temp + " is a palindrome number");	
        }        	
        else {
        	System.out.println("num : " + Temp + " is not a palindrome number");	
        }
        	
	}

}
