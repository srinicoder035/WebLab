import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;

class Pg2Client{

    public static void main(String[] args) throws Exception{
        
        Socket soc = new Socket(InetAddress.getLocalHost(),3000);
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        DataInputStream in = new DataInputStream(soc.getInputStream());
        out.writeUTF("Request to Server");
        String readMessage = in.readUTF();
        System.out.println(readMessage);
        System.out.println("Recieved from Server");
        in.close();
        out.close();
        soc.close();
    
    }
}