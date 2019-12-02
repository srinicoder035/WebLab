import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg3Server{
    public static void main(String[] args) throws Exception{
        impl3 x = new impl3();
        Naming.rebind("rmi://localhost:5000/x",x);
    }
}