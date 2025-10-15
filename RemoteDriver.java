package week3.day3;


public abstract class RemoteDriver implements WebDriver{
	
	@Override
	public void findElement() {
		
		System.out.println("Abstract FindElement from Interface");
	}
	@Override
	public void findElements() {
		
		System.out.println("Abstract FindElements from Interface");
	}
	@Override
	public void get() {
		System.out.println("Abstract get method from Interface ");
		
	}
	
	public static void main(String[] args) {
		
		//abstract class unable to create the object for Interface 
		
		//WebDriver obj = new WebDriver(); 
	}
}

