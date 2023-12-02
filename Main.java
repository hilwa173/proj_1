import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

            Main.run();
        
            }
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Main.displayMenu();
            int choice = scanner.nextInt();
            Main.handleChoice(choice);
        }
    }

    public static void displayMenu() {

        System.out.println("Welcome to School Library App!");
        System.out.println("Please select an option by entering a number:");
        System.out.println("1 - List all books");
        System.out.println("2 - List all people");
        System.out.println("3 - Create a person");
        System.out.println("4 - Create a book");
        System.out.println("5 - Create a rental");
        System.out.println("6 - List all rental for a given person id");
        System.out.println("7 - Exit");

    }

    public static void handleChoice(int choice) {
        App app=new App();
        switch (choice) {
            case 1:
                app.listBooks();
                break;
            case 2:
                 app.listPeople();
                break;
            case 3:
                app.createPerson();
                break;
            case 4:
                app.createBook();
                break;
            case 5:
                app.createRental();
                break;
            case 6:
                app.listRentals();
                break;
            case 7:
                exitProgram();
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }


    public static void exitProgram() {
        System.out.println("Thanks for using the School Library App!");
        System.exit(0);
    }


        }

