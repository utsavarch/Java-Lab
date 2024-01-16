import java.rmi.Remote;
import java.rmi.RemoteException;

public interface mathI extends Remote {
    int add(int a, int b) throws RemoteException;
    int subtract(int a, int b) throws RemoteException;
    int multiply(int a, int b) throws RemoteException;
    double divide(double a, double b) throws RemoteException;
    int factorial(int n) throws RemoteException;
}
