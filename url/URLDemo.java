package url;

import java.net.*;
import java.util.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a URL: ");
            String url = sc.nextLine();
            sc.close();
            URL u = new URL(url);
            System.out.println("Protocol : " + u.getProtocol());
            System.out.println("Host : " + u.getHost());
            System.out.println("File : " + u.getFile());
            System.out.println("Port : " + u.getPort());
            System.out.println("Ref : " + u.getRef());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL : " + args[0]);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
