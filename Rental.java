import java.util.Date;

public class Rental {
    private Date date;
    private Person person;
    private Book book;

    public Rental(Date date, Person person, Book book) {
        this.date = date;

        this.person = person;
        if (!person.getRentals().contains(this)) {
            person.getRentals().add(this);
        }

        this.book = book;
        if (!book.getRentals().contains(this)) {
            book.getRentals().add(this);
        }
    }

    // Getter and setter methods for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getter and setter methods for person
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // Getter and setter methods for book
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
