package CinemaTicketBookingSystem;

public class Seat {

	private int seatNumber;
    	private int rowNumber;
    	private String type; 
    	private double price;
    	private boolean isBooked;

    	public Seat(int seatNumber, int rowNumber, String type, double price) {
        	this.seatNumber = seatNumber;
        	this.rowNumber = rowNumber;
        	this.type = type;
        	this.price = price;
        	this.isBooked = false;
    	}

    	public boolean bookSeat() {
        	if (!isBooked) {
            		isBooked = true;
            		return true;
        	}
        	return false;
    	}

    	public void display() {
        	System.out.println("Seat: " + seatNumber +   " Row: " + rowNumber + " Type: " + type +  " Price: $" + price +  " Booked: " + isBooked);
    	}

    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (!(obj instanceof Seat)) return false;
        	Seat seat = (Seat) obj;
        	return seatNumber == seat.seatNumber && rowNumber == seat.rowNumber;
    	}
}
