class Student extends Person {
    private Classroom classroom;

    //here is student class
    public Student(String name, int age, boolean parent_permission, String classroom) {
        super(name, age, parent_permission);



    }

    public Student() {
        super("try",12,true);
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}