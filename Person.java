import java.util.ArrayList;
import java.util.Date;
public class Person implements Nameable {
    // Fields
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;
    private ArrayList<Rental> rentals;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor
    public Person(int id,String name,int age, boolean parentPermission) {
        super();
        this.id=id;
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
        this.rentals = new ArrayList<>();
    }

    public Person(int age) {
        this(01,"unkown",12,true);
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods
    private boolean ofAge() {
        return age >= 18;
    }

    public String correctName() {
        return name;


    }


        private Rental[] rentals;

        public Rental[] getRentals() {
            return rentals;
        }

        public void setRentals(Rental[] rentals) {
            this.rentals = rentals;
        }

    public boolean canUseServices() {
        return ofAge() || parentPermission;
    }

    public Rental addRental(Date date,Book book) {
        Rental rental = new Rental(date,this,book);
        rentals.add(rental);
        return rental;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

