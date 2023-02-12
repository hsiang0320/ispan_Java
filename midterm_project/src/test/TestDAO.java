package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import RecordDao.RecordDataAccessObject;
import bean.MRTRecord;
import data.UrlData;

public class TestDAO {

	public static void main(String[] args) {
		// Test createMRTRecoed(ArrayList<MRTRecord> records)
		// RecordDataAccessObject recDAO = new RecordDataAccessObject();
		// UrlData urlData = new UrlData();
		// recDAO.createMRTRecoed(urlData.getData());

		// Test createMRTRecoed(MRTRecord record)
//		MRTRecord rec = new MRTRecord("2023/01/01", "日", "9999");
//		RecordDataAccessObject recDAO = new RecordDataAccessObject();
//		recDAO.createMRTRecoed(rec);

		// Test findRecordByDate(Calendar date)
//		RecordDataAccessObject recDAO = new RecordDataAccessObject(); 
//		Calendar calendar=new GregorianCalendar(2022,Calendar.DECEMBER,20);
//		System.out.println(recDAO.findRecordByDate(calendar));

		// Test findAllRecords
//		RecordDataAccessObject recDAO = new RecordDataAccessObject();
//		for (MRTRecord mrtRecord : recDAO.findAllRecords()) {
//		System.out.println(mrtRecord);
//		}

		// Test updateRecord
//		MRTRecord rec = new MRTRecord("2023/01/01", "日", "999999");
//		RecordDataAccessObject recDAO = new RecordDataAccessObject();
//		recDAO.updateRecord(rec);

		// Test deleteRecordBydate
//		RecordDataAccessObject recDAO = new RecordDataAccessObject(); 
//		Calendar calendar=new GregorianCalendar(2023,0,1);
//		recDAO.deleteRecordBydate(calendar);

		// Test writeToCsv
//		RecordDataAccessObject recDAO = new RecordDataAccessObject();
//		recDAO.writeToCsv();

	}

}
