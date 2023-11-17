import java.util.Date;
public class Main {
    public static void main(String[] args){
        Person person = new Person("maximilianus",23,true);
        System.out.println(person.correctName());
        CapitalizerDecor capitalizedPerson = new CapitalizerDecor(person);
        System.out.println(capitalizedPerson.correctName());
        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correctName());

                // Create a Classroom
                Classroom classroom = new Classroom("  Class", 30);

                // Create Students and add them to the Classroom
                Student student1 = new Student();
                Student student2 = new Student();
                classroom.addStudent(student1);
                classroom.addStudent(student2);

                // Create a Book
                Book book = new Book("c++", " Abebe ");

                // Create a Person
       Person person1 = new Person("kebe",12,true);

                // Create a Rental between the Person, Book, and a Date
                Rental rental = new Rental(new Date(), book, person);

                // Accessing relationships
                System.out.println("Classroom Label: " + classroom.getLabel());
                System.out.println("Number of Students in Classroom: " + classroom.getStudentCount());

                System.out.println("Book Title: " + book.getTitle());
                System.out.println("Book Author: " + book.getAuthor());

                System.out.println("Person's Rentals Count: " + person.getRentalCount());
            }
        }

