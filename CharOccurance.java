package Week1.Day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str1 = "welcome to chennai"; int count=0;
		char searchchar='e';
		char[] str1char = str1.toCharArray();
		for(int i=0; i<str1.length(); i++)
			if (str1char[i] == searchchar)
				count=count+1;
		System.out.println("Given String : "+str1);
		System.out.println("No. of occurances of '"+searchchar+"' in the given string : "+count);
	}

}
