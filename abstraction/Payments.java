package abstraction;

public interface Payments
{
	void cashonDelivery();
	void upiPayments();
	void cardPayments();
	void internetBanking();
	
	// default , static keyword--> implemented methods can be created
	default void OverseasAccount() 
	{
		System.out.println("Overseas Account Facility");
	}
	
	static void CustomerService()
	{
		System.out.println("24*7 Customer Service");
	}

}
	