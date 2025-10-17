package javachallenges;

public class Challenge5 {

	
		public boolean isHappy(int n)
		{
	        int slow = n;
	        int fast = getNext(n);
	        
	        while (fast != 1 && slow != fast)
	        {
	            slow = getNext(slow);
	            fast = getNext(getNext(fast));
	        }
	        
	        return fast == 1;
	    }
	    
	    private int getNext(int n)
	    {
	        int totalSum = 0;
	        while (n > 0)
	        {
	            int digit = n % 10;
	            totalSum += digit * digit;
	            n /= 10;
	        }
	        return totalSum;
	    }
	    
	    public static void main(String[] args)
	    {
	    	Challenge5 challenge5 = new Challenge5();
	    	int number = 19; // Example input
	    	boolean result = challenge5.isHappy(number);
	    	System.out.println("Is " + number + " a happy number? " + result);
	    }
}