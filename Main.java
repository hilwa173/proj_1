import java.util.Date;
public class Main {
    public static void main(String[] args){
        Person person = new Person("maximilianus",23,true);
        System.out.println(person.correctName());
        CapitalizerDecor capitalizedPerson = new CapitalizerDecor(person);
        System.out.println(capitalizedPerson.correctName());
        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correctName());
        
            }
        }

