package test;

import bean.MRTRecord;

public class TestMRT {

	public static void main(String[] args) {
		String []mrtStrings= {"2022/12/12","四","9527"};
		MRTRecord mrt = new MRTRecord(mrtStrings[0],mrtStrings[1],mrtStrings[2]);
		System.out.println(mrt);

	}

}
