package sk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighChartController {

	String dbName = "ExampleDB";
	String userName = "lemoner";
	String password = "tjsqhd11";
	String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
	String port = "3306";
	String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
			+ password;

	@RequestMapping("/highchart_eye")
	public String highchart_eye() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;

		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();

		List<Float> result_1 = new ArrayList();
		while (rs.next()) {
			result_1.add(Float.parseFloat(rs.getString("eye")));
		}
		
		System.out.println("eye data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return result_1.toString();
	}
	
	
	@RequestMapping("/highchart_co2")
	public String highchart_co2() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;

		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();

		List<Float> result_1 = new ArrayList();
		while (rs.next()) {
			result_1.add(Float.parseFloat(rs.getString("co2")));
		}
		
		System.out.println("co2 data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return result_1.toString();
	}
	@RequestMapping("/highchart_temperature")
	public String highchart_temperature() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		
		List<Float> result_1 = new ArrayList();
		while (rs.next()) {
			result_1.add(Float.parseFloat(rs.getString("temperature")));
		}
		
		System.out.println("temperature data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return result_1.toString();
	}
	@RequestMapping("/highchart_humidity")
	public String highchart_humidity() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		
		List<Float> result_1 = new ArrayList();
		while (rs.next()) {
			result_1.add(Float.parseFloat(rs.getString("humidity")));
		}
		
		System.out.println("humidity data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return result_1.toString();
	}
	@RequestMapping("/highchart_discomfort")
	public String highchart_discomfort() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		
		List<Float> result_1 = new ArrayList();
		while (rs.next()) {
			result_1.add(Float.parseFloat(rs.getString("discomfort")));
		}
		
		System.out.println("discomfort data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return result_1.toString();
	}
	
	@RequestMapping("/highchart_sleeping")
	public int highchart_sleeping() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1 order by id desc limit 3";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		
		List<Float> result_1 = new ArrayList();
		int count = 0;
		while (rs.next()) {
			if(Float.parseFloat(rs.getString("eye"))>=1){
				count++;
			}
		}
		
		System.out.println("sleeping data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		return count*65;
	}
}
