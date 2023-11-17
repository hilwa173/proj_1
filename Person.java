public class Person implements Nameable {
    int id;
    String name="unknown";
    int age;
    boolean parent_Permission=true;

    public Person(String name, int age, boolean parent_Permission) {
        this.name = name;
        this.age = age;
        this.parent_Permission = parent_Permission;
    }

    public int getId() {
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
        return isOfAge() || parent_Permission;
    }

    @Override
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

        public int getRentalCount() {
            return rentalCount;
        }

        public void setRentalCount(int rentalCount) {
            this.rentalCount = rentalCount;
        }

        private int rentalCount;

        public void addRental(Rental rental){

        }

        // other methods...
    }
