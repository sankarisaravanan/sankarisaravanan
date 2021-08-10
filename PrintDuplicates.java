package Week1.Day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		int array1[] = {2,8,1,17,2,6,20,8,11,7,13};
		System.out.print("Duplicate Elements in the given Array : ");
		for (int i=0; i<array1.length; i++) {
			for(int j=i+1; j<array1.length; j++) {
				if (array1[i]==array1[j]) 
					System.out.print(array1[i]+" ");								
			}
		}	

	}

}
