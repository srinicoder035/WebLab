import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;
class Pg4Server{
    public static void main(String[] args) throws Exception{      
        DatagramSocket server = new DatagramSocket(3000);
        while(true){
            byte[] sendbyte=new byte[1024];
            byte[] receivebyte=new byte[1024];
            DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
            server.receive(receiver);
            String data = new String(receiver.getData()).trim();
            if(data.equals("Exit")){
                break;
            }
            data = data.toUpperCase();
            System.out.println(data);                
            InetAddress addr=receiver.getAddress();
            int port=receiver.getPort();
            sendbyte = data.getBytes();
            DatagramPacket sender = new DatagramPacket(sendbyte,sendbyte.length,addr,port);
            server.send(sender);
        }
    }
}