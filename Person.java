package entity;

import interfaces.Active;
import interfaces.Adaptable;

public abstract class Person implements
        Adaptable, Active {

    // Fields
    private String name;
    private int age;
    private char gender;
    private int egn;
    private int height;
    private int weight;

    public Person() {
        // default constructor
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void run() {
        System.out.println("The person is running!");
    }

    // Abstract method
    protected abstract String getTypicalDrink();

    // Override methods
    @Override
    public void getShower() {
        System.out.println("The person is getting a shower");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getEgn() {
        return egn;
    }

    public void setEgn(int egn) {
        this.egn = egn;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
