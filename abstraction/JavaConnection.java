package abstraction;


public class JavaConnection extends MySqlConnection
{
	@Override
	public void connect()
	{
		System.out.println("Java DB Connecting...");

	}

	@Override
	public void disconnect()
	{
		System.out.println("Java DB Disconnected, thank you!");

	}

	@Override
	public void executeUpdate()
	{
		System.out.println("Java DB Update Started...");

	}



	public static void main(String[] args) 
	{
		DatabaseConnection dbConn = new JavaConnection();
		System.out.println("Starting Java Database Connection...\n");
		dbConn.connect();
		System.out.println("Java Database Connected successfully\n");
		dbConn.executeUpdate();
		System.out.println("\nPerforming Update Operation...");
		System.out.println("\n...");
		System.out.println("\nUpdate Operation Completed Successfully\n");
		System.out.println("Executing Query Operation...\n");
		System.out.println("\n...\n");
		dbConn.executeQuery();
		System.out.println("\nDisconnecting from Java Database...\n");
		dbConn.disconnect();
	}

}
