package polymorphism;

public class APIClient {

	public static void main(String[] args)
	{
		APIClient client = new APIClient();
	
		client.sendRequest("https://api.example.com/data");
		client.sendRequest("https://leafground.com/checkbox.xhtml", "{ \"Order\": \"1\" }");
		client.sendRequest("http://leaftaps.com/opentaps/control/main", "{ \"Order\": \"2\" }", true);
		
	}
		// Method Overloading
	
		public void sendRequest(String endpoint)
		{
			System.out.println("Sending request to " + endpoint);
		}
		
		public void sendRequest(String endpoint, String requestBody)
		{
			System.out.println("Sending request to " + endpoint);
            System.out.println("Request Body: " + requestBody);
        }
		
		public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
		{
			System.out.println("Sending request to " + endpoint);
            System.out.println("Request Body: " + requestBody);
			if (requestStatus) 
			{
				System.out.println("Request was successful");
			} 
			else
			{
				System.out.println("Request failed");
			}
        }
		
		
}


