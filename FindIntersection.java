package Week1.Day2;

public class FindIntersection {

	public static void main(String[] args) {
		int array1[] = {1,10,12,13,5,20,7};
		int array2[] = {2,8,1,17,12,6,20,9,11,7,13};
		System.out.print("Intersection Elements in the given 2 Arrays : ");
		for (int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if (array1[i]==array2[j]) {
					System.out.print(array1[i]+" ");
					break;
				}	
			}
		}	
	}

}
