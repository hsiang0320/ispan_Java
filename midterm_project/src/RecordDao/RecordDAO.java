package RecordDao;

import java.util.ArrayList;
import java.util.Calendar;

import bean.MRTRecord;

public interface RecordDAO {

	boolean createMRTRecoed(MRTRecord record);

	boolean createMRTRecoed(ArrayList<MRTRecord> records);

	MRTRecord findRecordByDate(Calendar date);

	ArrayList<MRTRecord> findAllRecords();

	boolean updateRecord(MRTRecord record);

	boolean deleteRecordBydate(Calendar date);

	boolean writeToCsv();

}