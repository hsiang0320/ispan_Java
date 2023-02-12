package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) {
		try {
			URL url = new URL(
					"https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=abb025a1-db60-4c2e-b32b-89fbd9b6a8e9&rid=095277f6-5236-4144-b20a-7f9445f88d29");
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream,"MS950");
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str = "";
			bufferedReader.readLine();
			while ((str = bufferedReader.readLine()) != null) {
				String[] split = str.split(",");
				for (int i = 0; i < split.length; i++) {
					String string = split[i];
					System.out.print(string + "\t");

				}
				System.out.println();
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
