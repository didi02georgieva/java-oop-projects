package entity;

public class Student extends Person {

    // Fields
    private String university;
    private String speciality;
    private int facNumber;

    // Constructor
    public Student() {
        // default constructor
    }

    public Student(String name,
       int age, String university,
       String speciality, int facNumber) {
        super(name, age);
        this.university = university;
        this.speciality = speciality;
        this.facNumber = facNumber;
    }

    // Override Methods
    @Override
    public String getTypicalDrink() {
        return "Vodka";
    }

    @Override
    public void run() {
        System.out.printf("The student with name: %s is running!", this.getName());
    }

    @Override
    public String toString() {
        return String.format(
          "The student with name: %s is learning in speciality: %s",
          this.getName(),
          this.getSpeciality()
        );
    }

    // Getters and Setters
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getFacNumber() {
        return facNumber;
    }

    public void setFacNumber(int facNumber) {
        this.facNumber = facNumber;
    }

    // Override methods
    @Override
    public void getUpEarly() {
        System.out.println("The student gets up at 10 o'clock");
    }

    @Override
    public void run(int minutes) {

    }

    @Override
    public void study() {

    }

    @Override
    public void think() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void act() {

    }
    

}


