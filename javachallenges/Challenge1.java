package javachallenges;

public class Challenge1
{
	
	public static void printLastWordAndLength(String s)
	{
		//split the string into words
		String[] words = s.split(" ");
		//get the last word
		String lastWord = words[words.length - 1];
		//print the last word and its length
		System.out.println("\nThe last word is: " + lastWord);
		System.out.println("The length of the last word is: " + lastWord.length() + "\n");
	
	}

	public static void main(String[] args)
	{
		//Given a string s consisting of words and spaces, return the length of the last word in the string.
		String s1 = "Hello World";
		String s2 = "   fly me   to   the moon  ";
		String s3 = "luffy is still joyboy";
		
		System.out.print("The entered string is: " + s1);
		//print last word and its length
		printLastWordAndLength(s1);
		System.out.print("The entered string is: " + s2);
		printLastWordAndLength(s2);
		System.out.print("The entered string is: " + s3);
		printLastWordAndLength(s3);
}
}