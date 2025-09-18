package abstraction;

public class Amazon extends CanaraBank {

	public static void main(String[] args)
	{
        Amazon a = new Amazon();
        System.out.println("Welcome to Amazon");
        System.out.println("Payment Methods available in Amazon: \n");
        a.cashonDelivery();
        a.upiPayments();
        a.cardPayments();
        a.internetBanking();
        System.out.println("\nNote:");
        a.recordPaymentDetails();   
        System.out.println("\nAdditional Services: \n");
        a.OverseasAccount();
        Payments.CustomerService();
        System.out.println("\nTerms and Conditions apply....");
    }

	@Override
	public void cashonDelivery() 
	{
	    System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() 
	{
		System.out.println("UPI Payments");
		
	}

	@Override
	public void cardPayments() 
	{
		System.out.println("Card Payments");
		
	}

	@Override
	public void internetBanking()
	{
		System.out.println("Internet Banking");
		
	}
	
}

