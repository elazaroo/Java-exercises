package rmi;

import java.io.*;
import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        String message = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = br.readLine();

            InterfaceServer obj = (InterfaceServer) Naming.lookup("rmi://localhost/ObjectHello");

            message = obj.greeting(name);
            System.out.println(message);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }    
}