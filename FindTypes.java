package Week1.Day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char [] testchar=test.toCharArray();
		for(int i=0; i<test.length(); i++) {
			if(Character.isDigit(testchar[i]))
				num++;
			else if(Character.isLetter(testchar[i]))
				letter++;
			else if(Character.isSpaceChar(testchar[i]))
				space++;
			else
				specialChar++;
		}
		System.out.println("Given String : "+test);
		System.out.println("No. of Digits in the given string : "+num);
		System.out.println("No. of Letters in the given string : "+letter);
		System.out.println("No. of blank spaces in the given string : "+space);
		System.out.println("No. of Specialcharacters in the given string : "+specialChar);
	}

}
