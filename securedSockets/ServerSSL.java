package securedSockets;

import java.io.*;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class ServerSSL {
    public static void main(String[] args) throws IOException {
        int port = 6000;

        System.setProperty("javax.net.ssl.keyStore", "securedSockets/certs/AlmacenSSL");
        System.setProperty("javax.net.ssl.keyStorePassword", "1234567");

        SSLServerSocketFactory sfact = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
		SSLServerSocket serverSSL = (SSLServerSocket) sfact.createServerSocket(port);
		SSLSocket connectedClient = null;

        DataInputStream inputFlow = null;
		DataOutputStream outputFlow = null;

        for(int i=1;i<5;i++){
			System.out.println("Waiting for client "+i);
			connectedClient=(SSLSocket) serverSSL.accept();
			inputFlow=new DataInputStream(connectedClient.getInputStream());
			// CLient sends a message
			System.out.println("Receiving from client: "+i+"\n\t"+inputFlow.readUTF());
			outputFlow=new DataOutputStream(connectedClient.getOutputStream());
			// Send a message to client
			outputFlow.writeUTF("Greetings to client from server");
			connectedClient.close();
		}
		// Close streams and sockets
		inputFlow.close();
		outputFlow.close();
		serverSSL.close();
    }
}