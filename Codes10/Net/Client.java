import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		String ip= "localhost";
		final int PORT = 7654;
		Socket socket = new Socket(ip,PORT);
		System.out.println("Client Comes....");
		InputStream is = socket.getInputStream();
		DataInputStream di = new DataInputStream(is);
		System.out.println(di.readUTF());
//		int singleByte = is.read();
//		while(singleByte!=-1){
//			System.out.print((char)singleByte);
//			singleByte = is.read();
//		}
		di.close();
		is.close();
		socket.close();
	}

}
