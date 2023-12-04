package Inheritance;

public class Animal {
    void cat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.cat();    // Inherited method
        myDog.bark();   // own method
    }
}


