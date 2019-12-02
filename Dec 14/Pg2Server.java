import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
import java.time.LocalDate;
class Pg2Server{

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(3000);
        Socket soc = ss.accept();
        DataInputStream in = new DataInputStream(soc.getInputStream());
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        System.out.println(in.readUTF());
        System.out.println("Request granted");
        out.writeUTF("Date : " + java.time.LocalDate.now() +" Time : " + java.time.LocalTime.now());      
        in.close();
        out.close();
        soc.close();
        ss.close();

    }
}