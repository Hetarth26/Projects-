package abstraction;

public interface DatabaseConnection
{
	abstract void connect();

	abstract void disconnect();
	
	abstract void executeUpdate();

	abstract void executeQuery();


}
