import java.rmi.*;
import java.rmi.server.*;
public class impl4 extends UnicastRemoteObject implements inface4{
    public impl4()throws Exception{
        super();
    }
    public int add(int x,int y){
        return (x+y);
    }
    public int sub(int x,int y){
        return (x-y);
    }
    public int div(int x,int y){
        return (x/y);
    }
    public int mul(int x,int y){
        return (x*y);
    }
    public int mod(int x,int y){
        return (x%y);
    }
}