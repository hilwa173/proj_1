import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
public class Main {
           public void displayMenu(){
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
    public static void main(String[] args){
        App app=new App();
        app.run();
    }

}


