import java.io.*;
import java.net.*;
class Ping{
    public static void sendPingRequest(String ipAddress) throws UnknownHostException,IOException{
        InetAddress pingRequest = InetAddress.getByName(ipAddress);
        System.out.println("Sending ping request to "+ ipAddress);
        if(pingRequest.isReachable(80)){
            System.out.println("Host Reachable");
        }
        else{
            System.out.println("Unable to connect to host");
        }
    }
    public static void main(String[] args) throws UnknownHostException,IOException{
        String ipAddress = "127.0.0.1"; 
        sendPingRequest(ipAddress); 
        ipAddress = "133.192.31.42"; 
        sendPingRequest(ipAddress); 
        ipAddress = "145.154.42.58"; 
        sendPingRequest(ipAddress); 
    }
}