import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg4Server{
    public static void main(String[] args) throws Exception{
        impl4 x = new impl4();
        Naming.rebind("rmi://localhost:3000/x",x);
    }
}
