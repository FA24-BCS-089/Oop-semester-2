package CinemaTicketBookingSystem;

public class Screen {

    	private int screenNumber;
    	private String movieTitle;
    	private Seat[][] seats;

    	public Screen(int screenNumber, String movieTitle, int rows, int cols) {
        	this.screenNumber = screenNumber;
        	this.movieTitle = movieTitle;
        	seats = new Seat[rows][cols];
        	initializeSeats();
   	}

    	private void initializeSeats() {
        	for (int i = 0; i < seats.length; i++) {
            		for (int j = 0; j < seats[i].length; j++) {
                		seats[i][j] = new Seat(j + 1, i + 1, "Regular" , 10.0);
            		}
        	}
    	}

   	public boolean bookSeat(int row, int col, Customer customer) {
        	if (row > 0 && row < seats.length && col > 0 && col < seats[0].length) {
            		return seats[row-1][col-1].bookSeat();
        	}
        	return false;
    	}

    	public void displayScreen() {
       		System.out.println("Screen: " + screenNumber + ", " + " Movie: " + movieTitle);
        	for (Seat[] row : seats) {
            		for (Seat seat : row) {
                		seat.display();
            		}
        	}
    	}
}
