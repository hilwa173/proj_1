
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
public class App {
    static List<Book> books = new ArrayList<>();
    static List<Person> people = new ArrayList<>();
    static List<Rental> rentals = new ArrayList<>();
    // List<Classroom> students= new ArrayList<>();
    private static Date date;

    void listAllBooks() {
        //Main.appendOutputText(books.toString());
        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            System.out.println("List of books:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    void listAllPeople() {
        // Main.appendOutputText(people.toString());
        if (people.isEmpty()) {
            System.out.println("No people available");
        } else {
            System.out.println("List of People:");
            for (Person person : people) {
                System.out.println(person.getCorrectName() + " age: " + person.getAge()
                        + " (" + person.getClass().getSimpleName() + ") with id " + person.getid());
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
        scanner.nextLine();
        System.out.println("enter ID of students");
        int id=scanner.nextInt();
        System.out.println("Does the student have parent permission? (Y/N)");
        String parentPermission = scanner.next().toUpperCase();
        scanner.nextLine();
        System.out.println("enter students class");
        String classroom=scanner.nextLine();
        Student student = new Student(id,name,age,classroom,parentPermission.equals("Y"));
        System.out.println("Created student " + student.getName()
                + " with id " + student.getid()+ student.getClassroom());
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
        scanner.nextLine();
        String specialization = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,age, specialization);
        System.out.println("Created teacher " + teacher.getName() + " with id " + teacher.getid());
        people.add(teacher);
    }
    void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        scanner.nextLine();
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    public static void createRental() {
       // Main.appendOutputText(books.toString());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        scanner.nextLine();

        Person person = findPersonById(personId);

        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        Book book = findBookByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        else{

            System.out.printf("Enter The Date: ");
            String d= scanner.nextLine();
            Rental rental = new Rental(d,book,person);

            rentals.add(rental);
            System.out.println("Rental created successfully.");
        }
    }








    void listRentalsByPersonId(int personId) {
       // Main.appendOutputText(rentals.toString());
        Scanner scanner = new Scanner(System.in);
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }
        System.out.println("Rentals for " + person.getName() + " (ID: " + person.getid() + "):");
        boolean rentalsFound = false;
        for (Rental rental : rentals) {
            if (rental.getPerson().getid() == personId) {
                System.out.println("(book "+  rental.getBook().getTitle()+ " author by "+ rental.getBook().getAuthor());
                System.out.println("Date:"+rental.getDate());
                rentalsFound = true;
            }
        }
    }
    public static Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getid() == personId) {
                return person;
            }
        }
        return null;
    }
    public static Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

