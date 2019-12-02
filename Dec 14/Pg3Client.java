import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;

class Pg3Client{

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",3000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the data\nType EXIT to exit");
            String sendData = sc.next();
            out.writeUTF(sendData);
            if(sendData.equals("EXIT")){
                break;
            }
            String receiveData = in.readUTF();
            if(receiveData.length() != 0 ){
                System.out.println(receiveData);
            }
        }
        sc.close();
        in.close();
        out.close();
        socket.close();              
    }                    
}             