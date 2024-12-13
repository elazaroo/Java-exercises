package rmi.ObjectSend;

import java.rmi.*;
import java.util.Scanner;

public class Client {
    protected static Operations operation;

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            float num1 = sc.nextFloat();
            System.out.println("Enter the second number:");
            float num2 = sc.nextFloat();
            sc.close();
            InterfaceServer obj = (InterfaceServer) Naming.lookup("//localhost/operations");
            operation = obj.operations(num1, num2);
            System.out.println("Sum: " + operation.sum());
            System.out.println("Sub: " + operation.sub());
            System.out.println("Mul: " + operation.mul());
            System.out.println("Div: " + operation.div());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }   
    
}
