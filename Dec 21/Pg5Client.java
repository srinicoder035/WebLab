import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg5Client{
    public static void main(String[] args) throws Exception{
        String path = "rmi://localhost:5000/x";
        inface5 find = (inface5) Naming.lookup(path);
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ans = find.DNS(n);
        System.out.println("The address is "+ ans);
    }
}