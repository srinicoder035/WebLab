import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg3Client{
    public static void main(String[] args) throws Exception{
        String path = "rmi://localhost:5000/x";
        inface3 find = (inface3) Naming.lookup(path);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = find.fact(n);
        System.out.println("The factorial is "+ ans);
    }
}