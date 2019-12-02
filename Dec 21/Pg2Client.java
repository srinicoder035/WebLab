import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg2Client{
    public static void main(String[] args) throws Exception{
        String path = "rmi://localhost:5000/x";
        inface2 find = (inface2) Naming.lookup(path);
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        find.CMD(n);
    }
}