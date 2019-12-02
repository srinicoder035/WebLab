import java.util.*;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.lang.*;
public class Pg4Client{
    public static void main(String[] args) throws Exception{
        String path = "rmi://localhost:3000/x";
        inface4 find = (inface4) Naming.lookup(path);
        System.out.println("Enter the 2 numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int addAns = find.add(n,m);
        int subAns = find.sub(n,m);
        int mulAns = find.mul(n,m);
        int divAns = find.div(n,m);
        int modAns = find.mod(n,m);
        System.out.println("The addition answer is "+ addAns);
        System.out.println("The subtraction answer is "+ subAns);
        System.out.println("The multiplication answer is "+ mulAns);
        System.out.println("The division answer is "+ divAns);
        System.out.println("The modulus answer is "+ modAns);
    }
}