// Class definition
class Car {
    // Instance variables
    String make;
    String model;

    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

// Main class
public class ClassAndObjectExample {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry");

        // Accessing object method
        myCar.displayDetails();
    }
}
