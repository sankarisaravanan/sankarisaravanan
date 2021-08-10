package Week1.Day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,11,7,6,9};
		int j=0;
		//for (int i=0; i<arr.length; i++)
			//System.out.print(arr[i]);
		Arrays.sort(arr);
		//for (int i=0; i<arr.length; i++)
			//System.out.print(arr[i]);
		System.out.print("The missing elements in the given array : ");
		for (int i=0; i<arr.length; i++) {        	
        	if(arr[i] == ++j)
        		continue;
        	else
        		System.out.print(j + " ");
        	    ++j;
        		
        }
	}

}
