package CinemaTicketBookingSystem;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Grand Cinema", "Lahore", 2);
        Screen screen1 = new Screen(1, "Inception", 5, 5);
        Screen screen2 = new Screen(2, "Interstellar", 5, 5);

        cinema.addScreen(0, screen1);
        cinema.addScreen(1, screen2);

        Customer customer1 = new Customer(101, "Laraib", "03249876543", "laraib@gmail.com");
        Customer customer2 = new Customer(102, "Qadeer", "03035678912", "qadeer@gmail.com");

        boolean booked1 = screen1.bookSeat(2, 3, customer1);
        boolean booked2 = screen2.bookSeat(1, 1, customer2);

        if (booked1) {
            Ticket ticket1 = new Ticket(1, customer1, 1, 3, "Inception", 10.0);
            ticket1.displayTicket();
        }

        if (booked2) {
            Ticket ticket2 = new Ticket(2, customer2, 2, 1, "Interstellar", 10.0);
            ticket2.displayTicket();
        }

        cinema.displayCinema();
    }
}
