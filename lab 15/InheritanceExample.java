// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Accessing methods from both base and derived classes
        myDog.eat();
        myDog.bark();
    }
}
