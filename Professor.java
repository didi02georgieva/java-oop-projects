package entity;

public class Professor extends Person {

    // Fields
    private String title;

    // Constructors
    public Professor() {
        super();
    }

    public Professor(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    // Override Methods
    @Override
    public String getTypicalDrink() {
        return "50 years Black Johny";
    }

    @Override
    public String toString() {
        return String.format(
          "The professor with name: %s is with title: %s",
          this.getName(),
          this.getTitle()
        );
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override methods
    @Override
    public void getUpEarly() {
        System.out.println("The professor gets up at 7 o'clock");
    }

    @Override
    public void getShower() {
        System.out.println("Never getting a shower");
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
