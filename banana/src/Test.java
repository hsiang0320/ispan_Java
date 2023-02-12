import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://ws.ndc.gov.tw/Download.ashx?u=LzAwMS9hZG1pbmlzdHJhdG9yLzEwL3JlbGZpbGUvMC8xMTMzOS85YTM0NDZkOC1iOWU0LTRlOGUtYjE0Zi1kNWMyMjEzNTA1MTcuY3N2&n=6L%2bR5bm056aP5Yip5rSl6LK857Wm5LuY6YeR6aGNLmNzdg%3d%3d&icon=..csv");
			InputStream openStream = url.openStream();
			InputStreamReader isr=new InputStreamReader(openStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str="";
			while((str=bufferedReader.readLine())!=null) {
				String[] split = str.split(",");
				for (int i = 0; i < split.length; i++) {
					String string = split[i];
					System.out.println(string);
					
				}
			}
		
		
		
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
