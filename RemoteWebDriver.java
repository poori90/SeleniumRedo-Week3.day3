package week3.day3;

public class RemoteWebDriver implements WebDriver{

	//class to class = 'Extends ' ;
	// Interface - Abstract class = 'Implements' (Abstract Class );
	// Class - Interface = 'Implements ' (Concrete Class)
	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("Execution get ");
		
	}
	@Override
	public void keys() {
		// TODO Auto-generated method stub
		
	}
	
	// In Concrete class , we  can create object to access the methods from the Iterface.
	public static void main(String[] args) {
		
		RemoteWebDriver obj= new RemoteWebDriver();
		obj.click();
		obj.clicked();
		obj.findElement();
		obj.findElements();
		obj.run();
		obj.get();
	}



	

}
