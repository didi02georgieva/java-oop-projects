package nestedclasses;

import enums.AnimalName;

public class MysteryAnimal {

    // Fields
    private AnimalName name;  // composition
    private String sound = "default sound";

    private class Cow {
        public Cow(){
            sound = "muuu";
        }
    }
    private class Cat{
        public Cat(){
            sound = "meow";
        }
    }

    private class Dog{
        public Dog(){
            sound = "woof";
        }
    }

    public MysteryAnimal(AnimalName name){

        this.name = name;
        switch(name){

            case Bella:
                new Cow();
                break;
            case Chloe:
                new Cat();
                break;
            case Molly:
                new Dog();
                break;

            default:
                System.out.println("Sorry, we haven't this animal");
                break;
        }

    }
    public void showSound(){
        System.out.println(this.name + " makes " + this.sound);
    }

}
