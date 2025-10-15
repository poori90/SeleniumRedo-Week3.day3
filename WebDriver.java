package week3.day3;

public interface WebDriver {

	//unimplemented methods 
	void findElement();
	public void findElements();
	public void get();
	
	//There are two types of Implementation methods 
	//1. Static method 
	//2. Default method
	
	static void quit() {
		System.out.println("It is a Static Method ");
	}
	default void click() {
		System.out.println("It is a Deafult Click ");
	}
	
	static void doubleValue() {
		System.out.println("It is Double Vlaue method ");
	}
	default void clicked() {
		System.out.println("It is Clicked method ");
		
	}
	void run();
	void keys();
}
