package javachallenges;

public class Challenge2
{

	//Given a non-negative integer x, compute and return the square root of x.
	//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
	//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
	
	//Method to calculate square 
	
	public static int square(int num) 
	{
		return num * num;	
	}
	
	//Method to calculate square root
	public static int squareRoot(int sqNum) 
	{
		int n = 1;
		while (n*n <= sqNum)
		{
			n++;
		}
		return n-1;
	
	}
	
	
	public static void main(String[] args)
	{
		//Call Square Method
		int num1 = 5;
		int square = square(num1);
		
		//Call Square Root Method
		int num2 = 36;
		int squareRoot = squareRoot(num2);
		
		//Print Results
		System.out.println("The square of " + num1 + " is: " + square);
		System.out.println("The square root of " + num2 + " is: " + squareRoot);
		
		
	}
	
}