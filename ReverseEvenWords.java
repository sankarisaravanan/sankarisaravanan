package Week1.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester", revword, testresult="";
		String[] words = {};
		words = test.split(" ");
		System.out.println(words.length);
		for(int i=0; i<words.length; i++) {
			revword="";
			if ((i+1) % 2 == 0) {
				char[] wordchar = words[i].toCharArray();
				for(int j=words[i].length()-1; j>=0; j--) 
					revword = revword+wordchar[j];				
				System.out.println(revword);
			}
			else
				revword = words[i];
		testresult = testresult + " " +revword;		
		}	
		System.out.println("Given String :" + test);
		System.out.println("String with reversed even words : "+ testresult);
	}

}
