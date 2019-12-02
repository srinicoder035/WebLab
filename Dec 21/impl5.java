import java.net.InetAddress;
import java.rmi.*;
import java.rmi.server.*;
public class impl5 extends UnicastRemoteObject implements inface5{
    public impl5()throws Exception{
        super();
    }
    public String DNS(String x){
        String hostname ="";
        try{
            InetAddress address = InetAddress.getByName(x);
            hostname = address.getHostAddress();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return hostname;
    }
}