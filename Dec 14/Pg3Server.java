import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;
class Pg3Server{
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(3000);
        Socket socket = server.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        while(true){
            String receiveData = in.readUTF();
            String sendData = "";
            if(receiveData.equals("PING") ){
                System.out.println(receiveData + " received");
                System.out.println("PONG sent.");
                sendData = "PONG";
                out.writeUTF(sendData);
            }
            if(receiveData.equals("EXIT")){
                break;
            }
            out.writeUTF(sendData);            
        }
        in.close();
        out.close();
        socket.close();
        server.close();               
    }                    
}             