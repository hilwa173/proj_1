import java.util.ArrayList;
import java.util.List;
public class Person implements Nameable{
    int id;
    String name;
    int age;
    boolean parentPermission;
    String stud_class;
    private List<Rental> rentals;
    public Person(int id,String name,int age) {
        this.name = name;
        this.age = age;
        this.id=id;
        this.parentPermission = parentPermission;
        this.rentals = new ArrayList<>();
    }





    public int getid() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private boolean isOfAge() {
        return age >= 18;
    }
    public boolean canUseServices() {
        return isOfAge() || parentPermission;
    }
    @Override
    public String getCorrectName() {

        if (name.length() > 10) {
            return name.substring(0, 10).toUpperCase();
        } else {
            return name.toUpperCase();
        }
    }

    public List<Rental> getRentals() {
        return rentals;
    }
    public Rental addRental(Rental rental) {
        rentals.add(rental);
        return rental;
    }

}