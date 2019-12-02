import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg5Server{
    public static void main(String[] args) throws Exception{
        impl5 x = new impl5();
        Naming.rebind("rmi://localhost:5000/x",x);
    }
}