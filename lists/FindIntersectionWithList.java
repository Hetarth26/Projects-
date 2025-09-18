package lists;
import java.util.Arrays;
import java.util.List;



public class FindIntersectionWithList
{
	public static void main(String[] args)
	{
		//Find intersection of numbers using list interface
		
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		list1.addAll(Arrays.asList(3,2,11,4,6,7));
		java.util.List<Integer> list2 = new java.util.ArrayList<>();
		list2.addAll(Arrays.asList(1,2,8,4,9,7));
		
		//Create result variable to store the common elements
		java.util.List<Integer> result = new java.util.ArrayList<>();
		
		//Create a nested loop to check the common elements
		for (int i = 0; i < list1.size(); i++)
		{
			for (int j = 0; j < list2.size(); j++)
			{
				if (list1.get(i).equals(list2.get(j)))
				{
					result.add(list1.get(i));
				}
			}
		}
		
		//Print the common elements in result arraylist
		System.out.println("The common elements are: " + result);
		
	
	}

}
