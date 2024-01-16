import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup the registry for the MathC object
            mathI mathObj = (mathI) Naming.lookup("//localhost:8086/Math");

            // Call MathC methods directly
            System.out.println("Addition: " + mathObj.add(5, 3));
            System.out.println("Subtraction: " + mathObj.subtract(10, 4));
            System.out.println("Multiplication: " + mathObj.multiply(5, 6));
            System.out.println("Division: " + mathObj.divide(20.0, 4.0));
            System.out.println("Factorial: " + mathObj.factorial(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
