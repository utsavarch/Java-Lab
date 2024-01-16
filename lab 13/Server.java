import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and export the registry on port 1099
            Registry registry = LocateRegistry.createRegistry(8086);

            // Create and bind the MathC object to the registry
            MathC mathObj = new MathC();
            registry.rebind("Math", mathObj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
