// Class with overloaded and overridden methods
class Calculator {
    // Overloaded method
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method
    double add(double a, double b) {
        return a + b;
    }

    // Overridden method
    void displayInfo() {
        System.out.println("Calculator class");
    }
}

// Subclass extending Calculator
class AdvancedCalculator extends Calculator {
    // Overridden method
    @Override
    void displayInfo() {
        System.out.println("AdvancedCalculator class");
    }
}

// Main class
public class OverloadingOverridingExample {
    public static void main(String[] args) {
        // Creating objects of both classes
        Calculator basicCalc = new Calculator();
        AdvancedCalculator advCalc = new AdvancedCalculator();

        // Invoking overloaded methods
        System.out.println("Sum (int): " + basicCalc.add(2, 3));
        System.out.println("Sum (double): " + basicCalc.add(2.5, 3.5));

        // Invoking overridden method
        basicCalc.displayInfo();
        advCalc.displayInfo();
    }
}
