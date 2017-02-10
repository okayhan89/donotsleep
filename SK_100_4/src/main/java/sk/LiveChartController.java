package sk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveChartController {

	
	String dbName = "ExampleDB";
	String userName = "lemoner";
	String password = "tjsqhd11";
	String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
	String port = "3306";
	String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
			+ password;
	
	@RequestMapping("/humiditylive")
	public Float humiditylive() throws Exception {
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
		String SQL = "select * from SensorDB_1 order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		Float sample = null;
		while (rs.next()) {
		//System.out.println(rs.getString("name"));
		//System.out.println(rs.getString("id"));
			sample = Float.parseFloat(rs.getString("humidity"));
		}
		//System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return sample;
	}
	
	@RequestMapping("/temperaturelive")
	public Float temperaturelive() throws Exception {
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
		String SQL = "select * from SensorDB_1 order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		Float sample = null;
		while (rs.next()) {
		//System.out.println(rs.getString("name"));
		//System.out.println(rs.getString("id"));
			sample = Float.parseFloat(rs.getString("temperature"));
		}
		//System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return sample;
	}
	
	
	
	@RequestMapping("/discomfortlive")
	public Float discomfortlive() throws Exception {
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
		String SQL = "select * from SensorDB_1 order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		Float sample = null;
		while (rs.next()) {
			sample = Float.parseFloat(rs.getString("discomfort"));
		}
		con.close();
		rs.close();
		return sample;
	}
	
	@RequestMapping("/eyelive")
	public Float eyelive() throws Exception {
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
		String SQL = "select * from SensorDB_1 order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		Float sample = null;
		while (rs.next()) {
			sample = Float.parseFloat(rs.getString("eye"));
		}
		con.close();
		rs.close();
		return sample;
	}
	
	@RequestMapping("/co2live")
	public Float co2live() throws Exception {
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
		String SQL = "select * from SensorDB_1 order by id desc limit 1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		Float sample = null;
		while (rs.next()) {
			sample = Float.parseFloat(rs.getString("co2"));
		}
		con.close();
		rs.close();
		return sample;
	}
}
