package composition;

import entity.Student;

public class RichStudent2 extends Student {

    public RichStudent2() {
    }

    public RichStudent2(String name, int age, String university, String speciality, int facNumber) {
        super(name, age, university, speciality, facNumber);
    }

    @Override
    public String getTypicalDrink() {
        return "50 Years Black Johny";
    }
}
