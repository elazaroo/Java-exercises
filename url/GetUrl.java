package url;

import java.net.*;
import java.util.*;
import java.io.*;

public class GetUrl {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a URL: ");
            String url = sc.nextLine();
            sc.close();
            URL u = new URL(url);
            BufferedReader in
                = new BufferedReader(new InputStreamReader(u.openStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            in.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL : " + args[0]);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
