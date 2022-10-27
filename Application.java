import composition.RichStudent;
import composition.RichStudent2;
import entity.Person;
import entity.Professor;
import entity.Student;
import enums.AnimalName;
import nestedclasses.MysteryAnimal;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // Person
        // Person person = new Person();
        // System.out.println(person.toString());
        // person.run();
        // System.out.println();

        // Student
        Student student = new Student("Pesho", 21, "PU", "Informatics", 111111);
        System.out.println(student.toString());
        student.run();
        System.out.println();
        System.out.println(student.getTypicalDrink());
        student.getUpEarly();
        student.getShower();
        System.out.println();

        // Professor
        Professor professor = new Professor("Ivan", 80, "PhD");
        System.out.println(professor.toString());
        System.out.println(professor.getTypicalDrink());
        professor.getUpEarly();
        professor.getShower();

        printPerson();
        testComposition();
        testNestedClasses();
    }

    public static void printPerson() {
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                people.add(new Student());
            } else {
                people.add(new Professor());
            }
        }

        System.out.println("Show all elements from the list: ");
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }


    public static void testComposition(){
        RichStudent richStudent = new RichStudent("Ivan", 2223, "Pu", "Informatics", 456);
        System.out.println(richStudent.getTypicalDrink());
        RichStudent2 richStudent2 = new RichStudent2("Pesho", 225, "Pu", "Informatics", 446);
        System.out.println(richStudent2.getTypicalDrink());
    }

    public static void testNestedClasses(){
        MysteryAnimal mysteryAnimal = new MysteryAnimal(AnimalName.Bella);
        mysteryAnimal.showSound();

        MysteryAnimal mysteryAnimal1 = new MysteryAnimal(AnimalName.Chloe);
        mysteryAnimal1.showSound();

        MysteryAnimal mysteryAnimal2 = new MysteryAnimal(AnimalName.Molly);
        mysteryAnimal2.showSound();

        MysteryAnimal mysteryAnimal3 = new MysteryAnimal(AnimalName.Betty);
        mysteryAnimal3.showSound();
    }


}
