import java.rmi.*;
import java.rmi.server.*;
public class impl3 extends UnicastRemoteObject implements inface3{
    public impl3()throws Exception{
        super();
    }
    public int fact(int x){
        int ans = 1;
        for(int i =1;i<=x;i++)
            ans*=i;
        return ans;
    }
}