import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteDownloader {
	
	public static String download(String urlVal, String path) throws IOException{
		URL url = new URL(urlVal);
		final int EOF  = -1;
		FileOutputStream fs = new FileOutputStream(path);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		while(singleByte!=EOF){
			fs.write(singleByte);
			//System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		fs.close();
		return "Download Done";
	}
	
	public static void main(String[] args) throws IOException {
		download("https://sportsillustratedblog.files.wordpress.com/2014/05/111436350.jpg","/Users/amit/Documents/FileOutput/image.jpg");
	}

}
