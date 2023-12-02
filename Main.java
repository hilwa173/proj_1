import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******* WELCOME TO OOP LIBRARY ******");
            System.out.println("Choose an option:");
            System.out.println("1. List all books");
            System.out.println("2. List all people");
            System.out.println("3. Create a person");
            System.out.println("4. Create a book");
            System.out.println("5. Create a rental");
            System.out.println("6. List rentals for a person");
            System.out.println("0. Quit the application");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character
            switch (choice) {
                case 1:
                    app.listAllBooks();
                    break;
                case 2:
                    app.listAllPeople();
                    break;
                case 3:
                    System.out.println("Create a person:");
                    app.createPerson();
                    break;
                case 4:
                    System.out.println("Create a book:");
                    app.createBook();
                    break;
                case 5:
                    System.out.println("Create a rental:");
                    app.createRental();
                    break;
                case 6:
                    System.out.println("List rentals for a person:");
                    System.out.print("Enter person ID: ");
                    int personId = scanner.nextInt();
                    app.listRentalsByPersonId(personId);
                    break;
                case 0:
                    System.out.println("Thank you for using oop library");
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        while (choice != 0);
    }
}













