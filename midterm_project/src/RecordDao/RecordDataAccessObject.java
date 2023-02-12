package RecordDao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

import bean.MRTRecord;
import connUtil.ConnectionFactory;

public class RecordDataAccessObject implements RecordDAO {
	@Override
	public boolean createMRTRecoed(MRTRecord record) {
		String sql = "insert into Table1 (Date,Day_Of_Week,Total_Capacity) values(?,?,?)";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// Date date = record.getDate().getTime();
			// java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			Date sqlDate = new Date(record.getDate().getTimeInMillis());
			pstmt.setDate(1, sqlDate);
			pstmt.setString(2, record.getDayOfWeek());
			pstmt.setInt(3, record.getTotalCapacity());
			int updateCount = pstmt.executeUpdate();
			System.out.println("新增了" + updateCount + "筆資料");
			if (updateCount < 1) {
				return false;
			} else {			
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean createMRTRecoed(ArrayList<MRTRecord> records) {
		int updateCount = 0;
		String sql = "insert into Table1 (Date,Day_Of_Week,Total_Capacity) values(?,?,?)";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (MRTRecord record : records) {
				Date sqlDate = new Date(record.getDate().getTimeInMillis());
				pstmt.setDate(1, sqlDate);
				pstmt.setString(2, record.getDayOfWeek());
				pstmt.setInt(3, record.getTotalCapacity());
				updateCount += pstmt.executeUpdate();
			}
			System.out.println("新增了" + updateCount + "筆資料");
			if (updateCount < 1) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public MRTRecord findRecordByDate(Calendar date) {
		String sql = "select Date,Day_Of_Week,Total_Capacity from Table1 where Date=?";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Date sqlDate = new Date(date.getTimeInMillis());
			pstmt.setDate(1, sqlDate);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			MRTRecord record = new MRTRecord();
			Calendar cal = Calendar.getInstance();
			cal.setTime(rs.getDate(1));
			record.setDate(cal);
			record.setDayOfWeek(rs.getString(2));
			record.setTotalCapacity(Integer.parseInt(rs.getString(3)));
			return record;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public ArrayList<MRTRecord> findAllRecords() {
		ArrayList<MRTRecord> recList = new ArrayList<>();
		String sql = "select * from Table1 ";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				MRTRecord record = new MRTRecord();
				Calendar cal = Calendar.getInstance();
				cal.setTime(rs.getDate(1));
				record.setDate(cal);
				record.setDayOfWeek(rs.getString(2));
				record.setTotalCapacity(Integer.parseInt(rs.getString(3)));
				recList.add(record);
			}

			return recList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean updateRecord(MRTRecord record) {
		int updateCount = 0;
		String sql = "update Table1 set Date=?, Day_Of_Week=?, Total_Capacity=? where Date=?";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Date sqlDate = new Date(record.getDate().getTimeInMillis());
			pstmt.setDate(1, sqlDate);
			pstmt.setString(2, record.getDayOfWeek());
			pstmt.setInt(3, record.getTotalCapacity());
			pstmt.setDate(4, sqlDate);
			updateCount += pstmt.executeUpdate();
			System.out.println("修改了" + updateCount + "筆資料");
			if (updateCount < 1) {
				return false;
			} else {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteRecordBydate(Calendar date) {
		int deleteCount = 0;
		String sql = "delete from Table1 where Date=? ";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Date sqlDate = new Date(date.getTimeInMillis());
			pstmt.setDate(1, sqlDate);
			deleteCount += pstmt.executeUpdate();
			System.out.println("刪除了" + deleteCount + "筆資料");
			if (deleteCount < 1) {
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean writeToCsv() {
		ArrayList<MRTRecord> Records = findAllRecords();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.csv"))) {
			for (MRTRecord record : Records) {
				Date date = new Date(record.getDate().getTimeInMillis());
				bufferedWriter.write(sdf.format(date) + "," + record.getDayOfWeek() + "," 
				+ record.getTotalCapacity());
				bufferedWriter.newLine();
			}
			System.out.println("輸出成功");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
}
