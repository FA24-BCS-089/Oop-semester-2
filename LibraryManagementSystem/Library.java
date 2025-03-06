package LibraryManagementSystem;

public class Library {
    	private String name;
   	private Person staff;
    	private Book book;
    	private Person inCharge;

    	public Library(String name, Person staff, Book book, Person inCharge) {
        	this.name = name;
        	this.staff = new Person(staff);
        	this.book = new Book(book);
        	this.inCharge = new Person(inCharge);
    	}

    	public Library(Library other) {
        	this.name=other.name;
		this.staff=new Person(other.staff);
		this.book=new Book(other.book);
		this.inCharge=new Person(other.inCharge);
    	}

    	public void show() {
        	System.out.println("Library Name: " + name);
        	System.out.println("In-Charge:");
        	inCharge.show();
        	System.out.println("Staff:");
        	staff.show();
        	System.out.println("Book Available:");
        	book.show();
    	}

    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	Library library = (Library) obj;
        	return name.equals(library.name) && staff.equals(library.staff) && book.equals(library.book) && inCharge.equals(library.inCharge);
    	}

    	public String getName(){
		return name;
	}

    	public void setName(String name){
		this.name = name;
	}
}	