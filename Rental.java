import java.util.Date;

public class Rental {
    private Date date;
    private Book book;
    private Person person;

    public Rental(Date date, Book book, Person person) {
        this.date = date;
        this.book = book;
        this.person = person;

        book.addRental(this);   // One-to-Many: Book has many Rentals
        person.addRental(this); // One-to-Many: Person has many Rentals
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}