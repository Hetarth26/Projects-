package abstraction;

public abstract class CanaraBank implements Payments
{

	public void recordPaymentDetails()
	{
		System.out.println("Payment Details are recorded by the Bank");
	}
}
