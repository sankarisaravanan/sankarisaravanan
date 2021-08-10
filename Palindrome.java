package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		String str1="madam",revstr="";
		for (int i=(str1.length()-1); i>=0; i--) 
			revstr=revstr+str1.charAt(i);			
		System.out.println("Given String : " + str1);
		System.out.println("Reversed String : " + revstr);
		if(str1.equals(revstr))
			System.out.println("Given String " + str1 + " is a Palindrome");
		else
			System.out.println("Given String " + str1 + " is not a Palindrome");
	}

}
