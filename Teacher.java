class Teacher extends Person {
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }



    public Teacher( int id,String name,int age, String specialization) {
        super(id,name,age);
        this.specialization = specialization;
    }


    @Override
    public boolean canUseServices() {
        return true;
    }
}


