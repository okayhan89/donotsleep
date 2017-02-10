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
public class ReturnAndroidController {
	
	String dbName = "ExampleDB";
	String userName = "lemoner";
	String password = "tjsqhd11";
	String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
	String port = "3306";
	String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
			+ password;
	
	@RequestMapping("/samplehumidity")
	public Float samplehumidity() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		Statement setupStatement = null;
		Statement readStatement = null;
		ResultSet resultSet = null;
		String results = "";
		int numresults = 0;
		String statement = null;
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		Float sample = null;
		while (rs.next()) {
			sample = Float.parseFloat(rs.getString("humidity"));
		}
		con.close();
		rs.close();
		return sample;
	}
	
	
	@RequestMapping("/co2confirm")
	public int co2confirm() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1 order by id desc limit 10";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		int count = 0;
		Float sum =0.F;
		while (rs.next()) {
			count++;
			sum += Float.parseFloat(rs.getString("co2"));
		}
		Float avg = sum/count;
		System.out.println("---test---");
		con.close();
		rs.close();
		
		if(avg < 1000){
			//안전 co2
			return -1;
		}
		else if(avg <2000){
			//조금위험 co2
			return 0;
		}else{
			//위험위험 co2
			return 1;
		}
	}
	
	@RequestMapping("/temperatureconfirm")
	public int temperatureconfirm() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1 order by id desc limit 10";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		int count = 0;
		Float sum =0.F;
		while (rs.next()) {
			count++;
			sum += Float.parseFloat(rs.getString("temperature"));
		}
		Float avg = sum/count;
		System.out.println("---test---");
		con.close();
		rs.close();
		
		if(avg >= 24 && avg <26){
			//쾌적온도
			return 2;
		}
		else{
			//쾌적온도 아님
			return 3;
		}
	}
	
	@RequestMapping("/humidityconfirm")
	public int humidityconfirm() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection con = null;
		con = DriverManager.getConnection(jdbcUrl);
		String SQL = "select * from SensorDB_1 order by id desc limit 10";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		int count = 0;
		Float sum =0.F;
		while (rs.next()) {
			count++;
			sum += Float.parseFloat(rs.getString("humidity"));
		}
		Float avg = sum/count;
		System.out.println("---test---");
		con.close();
		rs.close();
		
		if(avg >= 40 && avg <60){
			//쾌적습도
			return 4;
		}
		else{
			//쾌적습도 아님
			return 5;
		}
	}

	
	@RequestMapping("/sleepingconfirm")
	public int sleepingconfirm() throws Exception {
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
		
		int count = 0;
		
		while (rs.next()) {
			if(Float.parseFloat(rs.getString("eye"))>1){
				count++;
			}
		}
		System.out.println(count);
		
		if(count <= 1){
			System.out.println("안전");
			return 6;
		}
		else if(count <=2 ){
			//return 4;
			//System.out.println("위험");
			return 7;
		}else{	
			System.out.println("조낸위험");
			return 8;
		}
		
	}
	
}
