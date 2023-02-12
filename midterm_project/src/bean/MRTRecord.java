package bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MRTRecord {
	private Calendar date;
	private String dayOfWeek;
	private int totalVolume;

	public MRTRecord() {

	}

	public MRTRecord(String date, String dayOfWeek, String Total_Volume) {
		String[] split = date.split("/");
		Calendar cal = new GregorianCalendar(Integer.parseInt(split[0]), Integer.parseInt(split[1]) - 1,
				Integer.parseInt(split[2]));
		this.date = cal;
		this.dayOfWeek = dayOfWeek;
		this.totalVolume = Integer.parseInt(Total_Volume);
	}

	

	@Override
	public String toString() {
		return date.get(Calendar.YEAR) + "年" + (date.get(Calendar.MONTH) + 1) + "月" + date.get(Calendar.DATE)
				+ "號" + "\t星期" + dayOfWeek + "\t總運量:" + totalVolume;
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

	public int getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(int totalVolume) {
		this.totalVolume = totalVolume;
	}

}
