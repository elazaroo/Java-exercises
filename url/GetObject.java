package url;

import java.net.*;
import java.util.*;
import java.io.*;

public class GetObject {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a URL: ");
            String url = sc.nextLine();
            sc.close();
            URL u = new URL(url);
            
            URLConnection uc = u.openConnection();
            String contentType = uc.getContentType();
            int contentLength = uc.getContentLength();

            if (contentType.startsWith("text/") || contentLength == -1) {
                System.out.println("This is not a binary file.");
                return;
            }

            InputStream in = uc.getInputStream();
            BufferedInputStream bin = new BufferedInputStream(in);

            String fileName = u.getFile();
            fileName = fileName.substring(fileName.lastIndexOf('/') + 1);

            FileOutputStream fout = new FileOutputStream(fileName);
            BufferedOutputStream bout =
                new BufferedOutputStream(fout);

            int i;
            while ((i = in.read()) != -1) {
                bout.write(i);
            }

            bout.flush();
            in.close();
            bout.close();

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL : " + args[0]);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
