import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Book {
        private int id;
        private String title;
        private String author;
        private ArrayList<Rental> rentals;

        public Book(String title, String author) {
                this.id = new Random().nextInt(1000) + 1;
                this.title = title;
                this.author = author;
                this.rentals = new ArrayList<>();
        }

        // Getter and setter methods for title
        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        // Getter and setter methods for author
        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        // Getter method for id
        public int getId() {
                return id;
        }

        // Getter method for rentals
        public ArrayList<Rental> getRentals() {
                return rentals;
        }

        // Method to add rental
        public Rental addRental(Date date, Person person) {
                Rental rental = new Rental(date, person, this);
                rentals.add(rental);
                return rental;
        }
}


