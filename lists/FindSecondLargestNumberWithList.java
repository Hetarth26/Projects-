package lists;
import java.util.Arrays;
import java.util.List;


public class FindSecondLargestNumberWithList {

	public static void main(String[] args)
	{
		//Find the second largest number in an array using list interface
		//Declare the list
		java.util.List<Integer> List = new java.util.ArrayList<>();
		List.addAll(Arrays.asList(3,2,11,4,6,7));
		//Sort the list
		java.util.Collections.sort(List);
		//Print the sorted list
		System.out.println("The sorted list is: " + List);
		//Get the second largest number
		int size = List.size();
		int secondLargest = List.get(size-2);
		//Print the second largest number	
		System.out.println("The second largest number is: " + secondLargest);
		
	}

}
