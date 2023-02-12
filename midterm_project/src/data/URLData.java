package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import bean.MRTRecord;

public class URLData {
	String urlString = "https://data.tycg.gov.tw/opendata/datalist/datasetMeta/"
			+ "download?id=abb025a1-db60-4c2e-b32b-89fbd9b6a8e9&rid=095277f6-5236-4144-b20a-7f9445f88d29";

	public URLData() {
	}

	public ArrayList<MRTRecord> getData() {
		ArrayList<MRTRecord> listRecords = new ArrayList<>();
		try {
			URL url = new URL(urlString);
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream, "MS950");
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str = "";
			bufferedReader.readLine();
			while ((str = bufferedReader.readLine()) != null) {
				MRTRecord mrt = new MRTRecord(str);
				listRecords.add(mrt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listRecords;

	}

}
