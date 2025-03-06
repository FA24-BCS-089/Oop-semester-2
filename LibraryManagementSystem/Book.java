package LibraryManagementSystem;

public class Book {
    private String title;
    private String ISSM;
    private int edition;
    private Date publicationDate;
    private Person author;

    public Book(String title, String ISSM, int edition, Date publicationDate, Person author) {
        this.title = title;
        this.ISSM = ISSM;
        this.edition = edition;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }

    public Book(Book other) {
        this.title = other.title;
        this.ISSM = other.ISSM;
        this.edition = other.edition;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }

    public void show() {
        System.out.println("  Title: " + title);
        System.out.println("  ISSM: " + ISSM);
        System.out.println("  Edition: " + edition);
        System.out.print("  Published on: ");
        publicationDate.show();
        System.out.println("  Author:");
        author.show();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return edition == book.edition && title.equals(book.title) && ISSM.equals(book.ISSM) && publicationDate.equals(book.publicationDate) && author.equals(book.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISSM() {
        return ISSM;
    }

    public void setISSM(String ISSM) {
        this.ISSM = ISSM;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }
}
