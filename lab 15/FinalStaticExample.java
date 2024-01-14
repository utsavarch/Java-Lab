class Constants {
    static final double PI;
    final int SIZE = 10;

    static {
        PI = 3.14159; // Legal because it's in a static block
    }
}

public class FinalStaticExample {
    public static void main(String[] args) {
        System.out.println("PI Value: " + Constants.PI);
        // Uncommenting the next line will result in a compilation error
        // Constants.PI = 3.14159;
    }
}
