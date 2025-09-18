package abstraction;

public abstract class MySqlConnection implements DatabaseConnection
{
	public void executeQuery()
	{
		System.out.println("MySql DB Query Executed Successfully");
    }
	

}


