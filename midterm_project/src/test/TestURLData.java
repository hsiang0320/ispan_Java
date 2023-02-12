package test;

import java.util.ArrayList;
import bean.MRTRecord;
import data.UrlData;

public class TestURLData {

	public static void main(String[] args) {
		UrlData urlData = new UrlData();
		ArrayList<MRTRecord> mrtList = urlData.getData();
		for (MRTRecord mrt : mrtList) {
			System.out.println(mrt.toString());
		}

	}

}
