// Interface definition
interface Shape {
    void draw();
}

// Class implementing the Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an object of Circle class
        Circle myCircle = new Circle();

        // Invoking the draw method
        myCircle.draw();
    }
}
