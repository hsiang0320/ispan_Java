package bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MRTRecord {
	private Calendar date;
	private String dayOfWeek;
	private int totalCapacity;

	public MRTRecord() {

	}

	public MRTRecord(String record) {
		String[] splitRecord = record.split(",");
		String[] date = splitRecord[0].split("/");
		Calendar cal = new GregorianCalendar(Integer.parseInt(date[0]), Integer.parseInt(date[1]) - 1,
				Integer.parseInt(date[2]));
		this.date = cal;
		this.dayOfWeek = splitRecord[1];
		this.totalCapacity = Integer.parseInt(splitRecord[2]);
	}

//	public MRTRecord(String date, String dayOfWeek, String totalCapacity) {
//	String[] split = date.split("/");
//	Calendar cal = new GregorianCalendar(Integer.parseInt(split[0]), Integer.parseInt(split[1]) - 1,
//			Integer.parseInt(split[2]));
//	this.date = cal;
//	this.dayOfWeek = dayOfWeek;
//	this.totalCapacity = Integer.parseInt(totalCapacity);
//}

	@Override
	public String toString() {
		return date.get(Calendar.YEAR) + "年" + (date.get(Calendar.MONTH) + 1) + "月" + date.get(Calendar.DATE) + "號"
				+ "\t星期" + dayOfWeek + "\t總運量:" + totalCapacity;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

}
