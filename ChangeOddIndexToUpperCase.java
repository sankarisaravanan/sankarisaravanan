package Week1.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str1="changeme", resultstr="";
		char oddchar;
		for (int i=0; i<str1.length(); i++) {
			oddchar=str1.charAt(i);
			if( i % 2 != 0 )
				oddchar=Character.toUpperCase(oddchar);
			resultstr=resultstr+Character.toString(oddchar);
			
		}
		System.out.println("Given String : " + str1);
		System.out.println("Changed Odd Index to Uppercase String : " + resultstr);
	}

}
