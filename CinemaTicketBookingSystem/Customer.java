package CinemaTicketBookingSystem;

public class Customer{

    	private int customerId;
    	private String name;
    	private String phoneNumber;
    	private String email;

    	public Customer(int customerId, String name, String phoneNumber, String email) {
        	this.customerId = customerId;
        	this.name = name;
        	this.phoneNumber = phoneNumber;
        	this.email = email;
    	}

    	public void displayCustomer() {
        	System.out.println("Customer ID: " + customerId + ", " + " Name: " + name + ", " + " Phone: " + phoneNumber + ", " + " Email: " + email);
    	}

    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (!(obj instanceof Customer)) return false;
        	Customer other = (Customer) obj;
        	return customerId == other.customerId;
    	}
}

