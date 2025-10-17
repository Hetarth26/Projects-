package javachallenges;

public class Challenge4
{
	
	 public int singleNumber(int[] nums)
	 {
	        int result = 0;
	        for (int num : nums)
	        {
	            result ^= num; // XOR each number
	        }
	        return result;
	    }

	public static void main(String[] args)
	{
		Challenge4 challenge = new Challenge4();
		int[] nums = {4, 1, 2, 1, 2};
		int[] nums2 = {2, 2, 1};
		int[] nums3 = {1};
		int[] nums4 = {1,6,1,6,0};
		
		int singleNum = challenge.singleNumber(nums);
		int singleNum2 = challenge.singleNumber(nums2);
		int singleNum3 = challenge.singleNumber(nums3);
		int singleNum4 = challenge.singleNumber(nums4);
		
		System.out.println("Unique element in array [4, 1, 2, 1, 2]: " + singleNum); // Output: 4
		System.out.println("Unique element in array [2, 2, 1]: " + singleNum2); // Output: 1
		System.out.println("Unique element in array [1]: " + singleNum3); // Output: 1
		System.out.println("Unique element in array[1,6,1,6,0]: " + singleNum4); // Output: 0
		
	}

}
