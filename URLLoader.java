import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLLoader {
	
	public static void main(String[] args) throws Exception{
		URL url = new URL("HTTP://www.google.com.br");
		URLConnection connection = url.openConnection();
		InputStream stream = connection.getInputStream();
		
		int i;
		while((i = stream.read()) != -1) {
			char c = (char) i;
			System.out.print(c);
		}
		
		stream.close();
	}

}
