import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg2Server{
    public static void main(String[] args) throws Exception{
        impl2 x = new impl2();
        Naming.rebind("rmi://localhost:5000/x",x);
    }
}