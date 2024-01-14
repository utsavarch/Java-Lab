// Class with different access modifiers
class MyClass {
    private int privateVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}

// Main class
public class AccessPrivilegesExample {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass();

        // Accessing variables with different access modifiers
        // Uncommenting the next lines will result in compilation errors
        // System.out.println(obj.privateVar);
        // System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.publicVar);

        // Accessing methods with different access modifiers
        // Uncommenting the next lines will result in compilation errors
        // obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.publicMethod();
    }
}
