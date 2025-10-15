package week3.day3;

public abstract class MySqlConnection implements DatabaseConnection{
	
	@Override
	public void connect() {
		System.out.println("This is Connect method from Database Connection implemented in MySqlConnection");
		
	}

	@Override
	public void disconnect() {
		System.out.println("This is disconnect method from Database Connection implemented in MySqlConnection");
		
	}
	
	@Override
	public void executeUpdate() {
		System.out.println("This is executeUpdate method from Database Connection implemented in MySqlConnection");
		
	}
	
	public void executeQuery() {
		System.out.println("This is executeQuery method from Database Connection implemented in MySqlConnection");

	}

}
