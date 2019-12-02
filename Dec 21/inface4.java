import java.rmi.*;
public interface inface4 extends Remote{
    public int add(int x,int y) throws RemoteException;
    public int sub(int x,int y) throws RemoteException;
    public int mul(int x,int y) throws RemoteException;
    public int div(int x,int y) throws RemoteException;
    public int mod(int x,int y) throws RemoteException; 
} 