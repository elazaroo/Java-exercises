package url;

import java.net.*;
import java.util.*;

public class GetHeader {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a URL: ");
            String url = sc.nextLine();
            sc.close();
            URL u = new URL(url);
            
            URLConnection uc = u.openConnection();
            System.out.println("Content-Type : " + uc.getContentType());
            System.out.println("Content-Encoding : " + uc.getContentEncoding());
            System.out.println("Content-Date : " + new Date(uc.getDate()));
            System.out.println("Content-Last-Modified : " + new Date(uc.getLastModified()));
            System.out.println("Content-Expiration : " + new Date(uc.getExpiration()));
            System.out.println("Content-Length : " + uc.getContentLength());

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL : " + args[0]);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}