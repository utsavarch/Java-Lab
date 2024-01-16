import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathC extends UnicastRemoteObject implements mathI {
    protected MathC() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        if (b != 0) {
            return a / b;
        } else {
            throw new RemoteException("Cannot divide by zero.");
        }
    }

    @Override
    public int factorial(int n) throws RemoteException {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
