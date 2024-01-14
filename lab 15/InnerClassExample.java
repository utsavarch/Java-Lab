// Outer class
class Outer {
    private int outerVar = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

// Main class
public class InnerClassExample {
    public static void main(String[] args) {
        // Creating objects of both outer and inner classes
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        // Accessing the inner class method
        innerObj.display();
    }
}
