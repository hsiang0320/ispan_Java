package teat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=abb025a1-db60-4c2e-b32b-89fbd9b6a8e9&rid=095277f6-5236-4144-b20a-7f9445f88d29");
			InputStream opeStream=url.openStream();
			InputStreamReader isr=new InputStreamReader(opeStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String string="";
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
