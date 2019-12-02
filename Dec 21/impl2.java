import java.net.InetAddress;
import java.rmi.*;
import java.rmi.server.*;
public class impl2 extends UnicastRemoteObject implements inface2{
    public impl2()throws Exception{
        super();
    }
    public void CMD(String cmd) throws Exception{
        Runtime r = Runtime.getRuntime();
        Process p = r.exec(cmd);
        System.out.println("The "+ cmd + " has been executed");
    }
}