package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElementWithList
{
	public static void main(String[] args) 
	{
		// Find the missing element in an array using list interface
		// Declare the list
		java.util.List<Integer> List = new java.util.ArrayList<>();
		List.addAll(Arrays.asList(1,2,3,4,10,6,8));
		//Missing elements list
		List<Integer> MissingElements = new ArrayList<>();
		// Sort the list
		java.util.Collections.sort(List);
		// Print the sorted list
		System.out.println("The sorted list is: " + List);
		
		// Find the missing elements
		// Check the current element + 1 is not equal to the next element.
		for (int i = 0; i < List.size() - 1; i++)
		{
			int current = List.get(i);
			int next = List.get(i + 1);
			if (current + 1 != next)
			{
				for (int j = current + 1; j < next; j++) 
				{
					MissingElements.add(j);
				}
			}
		}
	
	
		System.out.println("The missing elements are: " + MissingElements);
	}
	
}