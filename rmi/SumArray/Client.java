package rmi.SumArray;

import java.io.*;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            float num = 0;
            ArrayList<Float> numArray = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter a number (0 = exit)");
                num = sc.nextInt();
                numArray.add(num);
            } while (num != 0);
            sc.close();
            InterfaceServer obj = (InterfaceServer) Naming.lookup("//localhost/SumArray");
            System.out.println("Dev: " + obj.sum(numArray));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }   
    
}
