package Week1.Day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int array1[] = {2,8,1,17,12,6,20,9,11,7,13};
		System.out.print("Second Largest Element in the given Array : ");
		Arrays.sort(array1);
		System.out.print(array1[(array1.length)-2]);
	}

}
