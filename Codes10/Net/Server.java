import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORT = 7654;
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Server Start and Waiting for the Client....");
		Socket socket = server.accept();
		System.out.println("Handshaking DOne...");
		System.out.println("Enter the Message Send to Client");
		String message = new Scanner(System.in).nextLine();
		OutputStream os = socket.getOutputStream();
		DataOutputStream ds = new DataOutputStream(os);
		ds.writeUTF(message);
		//os.write(message.getBytes());
		ds.close();
		os.close();
		socket.close();
		System.out.println("Message Send to Client");
		

	}

}
