import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
     ArrayList<Person> people;
    ArrayList<Book> books;
     ArrayList<Rental> rentals;

    public App() {
        people = new ArrayList<>();
        books = new ArrayList<>();
        rentals = new ArrayList<>();
    }
Main main=new Main();
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            main.displayMenu();
            int choice = scanner.nextInt();
            handleChoice(choice);
        }
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                listBooks();
                break;
            case 2:
                listPeople();
                break;
            case 3:
                createPerson();
                break;
            case 4:
                createBook();
                break;
            case 5:
                createRental();
                break;
            case 6:
                listRentals();
                break;
            case 7:
                exitProgram();
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }

    public void exitProgram() {
        System.out.println("Thanks for using the School Library App!");
        System.exit(0);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            System.out.println("Books:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " with id " + book.getId());
            }
        }
    }

    public void listPeople() {

        if (people.isEmpty()) {
            System.out.println("No people available");
        } else {
            System.out.println("People:");
            for (Person person : people) {
                System.out.println(person.getName() + " age: " + person.getAge()
                        + " (" + person.getClass().getSimpleName() + ") with id " + person.getId());
            }
        }
    }
    public void createPerson() {
        System.out.println("Create a person:");
        System.out.println("1. Student");
        System.out.println("2. Teacher");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                createStudent();
                break;
            case 2:
                createTeacher();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
//new
        scanner.nextLine();
        System.out.println("enter ID of students");
        int id=scanner.nextInt();
        System.out.println("Does the student have parent permission? (Y/N)");
        String parentPermission = scanner.next().toUpperCase();
        scanner.nextLine();
        System.out.println("enter students class");
        String classroom=scanner.nextLine();
        Student student = new Student(id,name,age,classroom,parentPermission.equals("Y"));

        System.out.println("Created student " + student.getName() + " with id " + student.getId());
        people.add(student);
    }

    public void createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter teacher ID");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter teacher name:");
        String name = scanner.nextLine();
        System.out.println("Enter teacher age:");
        int age = scanner.nextInt();

        System.out.println("Enter teacher specialization:");
        scanner.nextLine(); // Consume the newline character
        String specialization = scanner.nextLine();

        Teacher teacher = new Teacher(id,name,age, specialization);

        System.out.println("Created teacher " + teacher.getName() + " with id " + teacher.getId());
        people.add(teacher);
    }

    public void createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter book author:");
        String author = scanner.nextLine();

        Book book = new Book(title, author);

        System.out.println("Created book " + book.getTitle() + " by " + book.getAuthor() + " with id " + book.getId());
        books.add(book);
    }

    public void createRental() {
        listPeople();
        System.out.println("Enter person id:");
        Scanner scanner = new Scanner(System.in);
        int personId = scanner.nextInt();

        listBooks();
        System.out.println("Enter book id:");
        int bookId = scanner.nextInt();

        Person person = findPersonById(personId);
        Book book = findBookById(bookId);

        if (person == null) {
            System.out.println("Person with id " + personId + " not found");
        } else if (book == null) {
            System.out.println("Book with id " + bookId + " not found");
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date currentDate=null;
            Rental rental = new Rental(currentDate, person, book);

            System.out.println("Created rental " + rental.getPerson().getName() + " - "
                    + rental.getBook().getTitle() + " - date: " + rental.getDate());
            rentals.add(rental);
        }
    }

    public void listRentals() {
        listPeople();
        System.out.println("Enter person id:");
        Scanner scanner = new Scanner(System.in);
        int personId = scanner.nextInt();

        Person person = findPersonById(personId);

        if (person != null) {
            System.out.println("Rentals for " + person.getName() + ":");
            ArrayList<Rental> personRentals = findRentalsByPerson(person);
            if (personRentals.isEmpty()) {
                System.out.println("No rentals found");
            } else {
                for (Rental rental : personRentals) {
                    System.out.println(rental.getBook().getTitle() + " by " + rental.getBook().getAuthor() + " on " + rental.getDate());
                }
            }
        } else {
            System.out.println("Person with id " + personId + " not found");
        }
    }

    private Person findPersonById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    private ArrayList<Rental> findRentalsByPerson(Person person) {
        ArrayList<Rental> personRentals = new ArrayList<>();
        for (Rental rental : rentals) {
            if (rental.getPerson().equals(person)) {
                personRentals.add(rental);
            }
        }
        return personRentals;
    }


}