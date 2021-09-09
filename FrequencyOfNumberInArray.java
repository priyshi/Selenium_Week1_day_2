package sunsep5;

import java.util.Arrays;

public class FrequencyOfNumberInArray {
	//*Print the frequency of number in an array*
	//=====================================
	//Step 1: Declare and initialize an array arr int[] arr={3,4,2,5,1,2,6,3,6,2,4,7,1}.

	//Step 2: Declare another array fr with the same size of array arr. It is used to store the frequencies of elements present in the array.

	//Step 3: Variable visited will be initialized with the value -1. It is required to mark an element visited that is, it helps us to avoid counting the same element again.

	//Step 4:The frequency of an element can be counted using two loops. One loop will be used to select an element from an array, and another loop will be used to compare the selected element with the rest of the array.

	//Step 5: Initialize count to 1 in the first loop to maintain a count of each element. Increment its value by 1 if a duplicate element is found in the second loop. (Since we have counted this element and didn't want to count it again. Mark this element as visited by setting fr[j] = visited. Store count of each element to fr)

	//Step 6: Finally, print out the element along with its frequency.

	//*Expected Output*
	//1 occured 2 times//2 occured 3 times//3 occured 2 times//4 occured 2 times//5 occured 1 times//6 occured 2 times//7 occured 1 times
	
	public static void main(String[] args) {
		int[] arr1={3,4,2,5,1,2,6,3,6,2,4,7,1};
		int[] fr=new int[13];
		int variablevisited=-1;
		int frequency;
		int count;
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			count=1;
			for (int j =i+1; j < fr.length; j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				  fr[j]=variablevisited;
				  
				}
			}
			
			if(fr[i]!=variablevisited) {
				fr[i]=count;
				System.out.println(+arr1[i] + "occured" + fr[i] + " times ");
			} 
			
		}
		

		
	}

}
