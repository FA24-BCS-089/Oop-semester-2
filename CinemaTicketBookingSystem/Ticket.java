package CinemaTicketBookingSystem;

public class Ticket{

	private int ticketId;
    	private Customer customer;
    	private int screenNumber;
    	private int seatNumber;
    	private String movieTitle;
    	private double price;

    	public Ticket(int ticketId, Customer customer, int screenNumber, int seatNumber, String movieTitle, double price) {
        	this.ticketId = ticketId;
        	this.customer = customer;
        	this.screenNumber = screenNumber;
        	this.seatNumber = seatNumber;
        	this.movieTitle = movieTitle;
        	this.price = price;
    	}

    	public void displayTicket() {
        	System.out.println("Ticket ID: " + ticketId + ", " + " Movie: " + movieTitle + ", " + " Screen: " + screenNumber + ", " + " Seat: " + seatNumber + ", " + " Price: $" + price);
        	customer.displayCustomer();
    	}
}