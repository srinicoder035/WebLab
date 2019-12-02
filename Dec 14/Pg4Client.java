import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;
class Pg4Client{
    public static void main(String[] args) throws Exception{
        
        DatagramSocket client=new DatagramSocket();
        InetAddress addr=InetAddress.getByName("127.0.0.1");
        Scanner s = new Scanner(System.in);
        int port = 3000;
        while(true){
            byte[] sendbyte=new byte[1024];
            byte[] receivebyte=new byte[1024];    
            System.out.println("Enter the string");
            String data;
            data = s.next();
            sendbyte = data.getBytes();
            DatagramPacket sender = new DatagramPacket(sendbyte,sendbyte.length,addr,port);
            client.send(sender);
            if(data.equals("Exit")){
                break;
            }
            DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
            client.receive(receiver);
            data = new String(receiver.getData()).trim();
            System.out.println("Uppercase string");
            System.out.println(data);                
        }
    }
}