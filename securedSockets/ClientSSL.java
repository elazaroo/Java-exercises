package securedSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ClientSSL {

	public static void main(String[] args) {
		String host="localhost";
		int port=6000;
		
		System.setProperty("javax.net.ssl.trustStore","securedSockets/certs/UsuarioAlmacenSSL");
		System.setProperty("javax.net.ssl.trustStorePassword","890123");
		
		System.out.println("Program Client started...");
		SSLSocketFactory sfact=(SSLSocketFactory) SSLSocketFactory.getDefault();
		try {
			SSLSocket Client=(SSLSocket) sfact.createSocket(host, port);
			
			DataOutputStream outputFlow=new DataOutputStream(Client.getOutputStream());
			
			outputFlow.writeUTF("Greetings to server from client");

			DataInputStream inputFlow=new DataInputStream(Client.getInputStream());

			System.out.println("Receiving from server: \n\t"+inputFlow.readUTF());

			outputFlow.close();
			inputFlow.close();
			Client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
