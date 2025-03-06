package LibraryManagementSystem;

public class LibrarySystem {
    	public static void main(String[] args) {

        	Address authorAddress = new Address("Canal Road", "Lahore");
        	Address staffAddress = new Address("Mughal Street", "Gujranwala");

        	Person author = new Person("J.K. Rowling", 58, "Female", authorAddress);
        	Person staff = new Person("John Doe", 40, "Male", staffAddress);
        	Person inCharge = new Person("Sarah Smith", 45, "Female", staffAddress);

        	Date publicationDate = new Date(26, 6, 1997);

        	Book book = new Book("Harry Potter", "978", 1, publicationDate, author);

        	Library library = new Library("City Library", staff, book, inCharge);

        	library.show();
    	}
}
