package week3.day3;

public abstract class CanaraBank implements Payments{

	
	public void recordPaymentDetails() {
		System.out.println("This is recordPaymentDetails method from Canarabank Class ");
	}
	
	@Override
	public void cashOnDelivery() {
		System.out.println("This is Cash On Delivery method implemented in Canarabank Abstract class");
		
	}
	
	@Override
	public void upiPayments() {
		System.out.println("This is UPI Payments method implemented in Canarabank Abstract class");
		
	}
	
	@Override
	public void cardPayments() {
		System.out.println("This is Card Payments method implemented in Canarabank Abstract class");
		
	}
	
	@Override
	public void internetBanking() {
		System.out.println("This is Internet banking  method implemented in Canarabank Abstract class");
		
	}
}
