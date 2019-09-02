package minggu01;

public class StringFrequency {

	public static void main(String[] args) {

		// the string that we want to analyze
		String s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat.";
		System.out.println(s);
		s = s.toLowerCase();

		// Counters initialization
		int vowelsCount = 0;
		int consonantsCount = 0;

		// definition of character groups
		String vowels = "aeiouyaeeiouuy";
		String consonants = "bccddfghjklmnpqrrssttvwxzz";

		// the main loop
		for (char c : s.toCharArray()) {
		        if (vowels.contains(String.valueOf(c))) {
		                vowelsCount++;
		        }
		        else if (consonants.contains(String.valueOf(c))) {
		                consonantsCount++;
		        }
		}

		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantsCount);
		System.out.println("Non-alphanumeric characters: " + (s.length() - (vowelsCount + consonantsCount)));
		
		System.out.println();
		System.out.println("========= String Ascii value ========");
		char c; // character
		int i; // ordinal (ASCII) value of the character
		// conversion from text to ASCII value
		c = 'a';
		i = (int)c;
		System.out.printf("The character %c was converted to its ASCII value of %d\n", c, i);
		// conversion from an ASCII value to text
		i = 98;
		c = (char)i;
		System.out.printf("The ASCII value of %d was converted to its textual value of %c", i, c);

	}

}
