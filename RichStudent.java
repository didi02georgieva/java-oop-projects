package composition;

import entity.Student;

public class RichStudent {

    //Fields
    private Student student = new Student();

    public RichStudent(String name, int egn, String university, String specialty, int facNumber){

        student = new Student(name,egn,university, specialty, facNumber);
    }
    // Methods
    public void run(){
        student.run();
    }
    // Methods with different behaviour
    public String getTypicalDrink(){
        return "50 years Black Johny";
    }
    @Override
    public String toString() {
        return student.toString();
    }
    //getters and setters
    public String getUniversity(){
        return student.getUniversity();
    }

    public String getSpecialty(){
        return student.getSpeciality();
    }

    public void setUniversity(String university){
        student.setUniversity(university);
    }

    public void setSpecialty(String specialty){
        student.setSpeciality(specialty);
    }

    // end of getters and setters



}
