package Week1.Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops", str2="posts", str1a, str2b;
		char[] stra= {}, strb= {};
		
		//for (int i=0; i<str1.length(); i++) 
			stra=str1.toCharArray();
		//for (int j=0; j<str2.length(); j++)
			strb=str2.toCharArray();
		Arrays.sort(stra);
		Arrays.sort(strb);
		str1a=String.valueOf(stra);
		str2b=String.valueOf(strb);
		System.out.println("Given Strings : "+str1+" & "+str2);
		System.out.println("Sorted Strings : "+str1a+" & "+str2b);
		
		if (str1a.equals(str2b))
			System.out.println("Given Strings \" "+str1+ "\" & '"+str2+"' are Anagram" );
		else
			System.out.println("Given Strings \" "+str1+ "\" & '"+str2+"' are not Anagram" );
	}

}
