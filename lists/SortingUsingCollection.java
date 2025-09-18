package lists;

public class SortingUsingCollection
{

	public static void main(String[] args)
	{
		//Declate a string array 
		String [] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		//Add the collection to a list
		java.util.List<String> list = java.util.Arrays.asList(arr);
		
		//Arrange the collection in ascending order
		java.util.Collections.sort(list);
		//System.out.println("The ascending order is: " + list);
				
		//Use reverse loop to iterate the collection

		for (int i = list.size() - 1; i >= 0; i--) 
		{
			System.out.print(list.get(i) + ", ");
		}
	

	}

}
