class Teacher extends Person {
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }



    public Teacher(int id, String name, int age,boolean parent_Permission, String specialization) {
        super(id, name, age,parent_Permission);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}
