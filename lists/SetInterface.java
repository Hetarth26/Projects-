package lists;

public class SetInterface {

	public static void main(String[] args)
	{
		//Writing a Java program that takes a string as input and prints only the unique characters from that String 
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		java.util.Set<Character> charSet = new java.util.HashSet<Character>();
		for (char c : charArray)
		{
			charSet.add(c);
		}		
		
		System.out.println("Input string is: " + companyName);
	
		
		
		// Print the unique characters as a string
		StringBuilder uniqueChars = new StringBuilder();
		for (Character c : charSet)
		{
			uniqueChars.append(c);
		}
		System.out.println("Unique characters in the string are: " + uniqueChars.toString());
		
		
	}

}
