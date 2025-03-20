package CinemaTicketBookingSystem;

public class Cinema {
    	private String name;
    	private String location;
    	private Screen[] screens;

    	public Cinema(String name, String location, int totalScreens) {
        	this.name = name;
        	this.location = location;
        	screens = new Screen[totalScreens];
    	}

    	public void addScreen(int index, Screen screen) {
        	if (index >= 0 && index < screens.length) {
            	screens[index] = screen;
        	}
    	}

    	public void displayCinema() {
        	System.out.println("Cinema: " + name + " Location: " + location);
        	for (Screen screen : screens) {
            		if (screen != null) {
                		screen.displayScreen();
            		}
        	}
    	}
}

