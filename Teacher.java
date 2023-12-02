public class Teacher extends Person {
    String specialization;
    public Teacher(int id,String name, int age, String specialization) {
        super(id,name, age);
        this.specialization = specialization;
    }
    @Override
    public boolean canUseServices() {
        return true;
    }

    public String getSpecialization() {
        return specialization;
    }
}