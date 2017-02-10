package sk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.couchbase.client.deps.io.netty.handler.codec.http.HttpRequest;


@RestController
public class AjaxController {

	String dbName = "ExampleDB";
	String userName = "lemoner";
	String password = "tjsqhd11";
	String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
	String port = "3306";
	String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
			+ password;
/*
	@RequestMapping("/index1")
	public String index1() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from ExampleTable";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			for (int j = 1; j <= numberofColumn; j++) {

				System.out.print(rs.getString(j) + "  ");
				row.add(Float.parseFloat(rs.getString(j)));

				System.out.println(row.toString());
			}
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

			result.add(count, (ArrayList<Float>) row);
			count++;
			System.out.println(count);
			System.out.println(result.toString());

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}*/
/*
	@RequestMapping("/index2")
	public String index2(HttpServletRequest req, @RequestParam(value = "userId") String userId) throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from ExampleTable";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			for (int j = 1; j <= numberofColumn; j++) {

				System.out.print(rs.getString(j) + "  ");
				row.add(Float.parseFloat(rs.getString(j)));

				System.out.println(row.toString());
			}
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

			result.add(count, (ArrayList<Float>) row);
			count++;
			System.out.println(count);
			System.out.println(result.toString());

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g
		System.out.println(req.getParameter("params"));
		System.out.println(userId);

		con.close();
		rs.close();

		return result.toString();
	}*/
/*
	@RequestMapping("/index3")
	public String index3(HttpServletRequest req) throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from ExampleTable";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			for (int j = 1; j <= numberofColumn; j++) {

				System.out.print(rs.getString(j) + "  ");
				row.add(Float.parseFloat(rs.getString(j)));

				System.out.println(row.toString());
			}
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

			result.add(count, (ArrayList<Float>) row);
			count++;
			System.out.println(count);
			System.out.println(result.toString());

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g
		System.out.println(req.getParameter("params"));

		con.close();
		rs.close();

		return result.toString();
	}
	*/
	//android --> dataTable
	@RequestMapping("/index4")
	public String index4() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from ExampleTable";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			for (int j = 1; j <= numberofColumn; j++) {

				System.out.print(rs.getString(j) + "  ");
				row.add(Float.parseFloat(rs.getString(j)));

				System.out.println(row.toString());
			}
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

			result.add(count, (ArrayList<Float>) row);
			count++;
			System.out.println(count);
			System.out.println(result.toString());

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}

	@RequestMapping("/android")
	public void android(HttpServletRequest req) throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection conn = null;

		conn = DriverManager.getConnection(jdbcUrl);
		Statement stmt = (Statement) conn.createStatement();

		String username = req.getParameter("username");

		String command = "insert into ExampleTable(id, name) values(9, '" + username + "');";

		int rowNum = stmt.executeUpdate(command);

		conn.close();
		stmt.close();

	}

	
	
	@RequestMapping("/android1")
	public void android1(HttpServletRequest req) throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection conn = null;

		conn = DriverManager.getConnection(jdbcUrl);
		Statement stmt = (Statement) conn.createStatement();

		String date = req.getParameter("date");
		String time = req.getParameter("time");
		double heart = Double.parseDouble(req.getParameter("heart"));
		double humidity = Double.parseDouble(req.getParameter("humidity"));
		double temperature = Double.parseDouble(req.getParameter("temperature"));
		double discomfort = Double.parseDouble(req.getParameter("discomfort"));

		String command = "insert into SensorDB(date, time, heart, humidity, temperature, discomfort) values('" + date
				+ "', '" + time + "', " + heart + ", " + humidity + ", " + temperature + ", " + discomfort + ");";

		int rowNum = stmt.executeUpdate(command);

		conn.close();
		stmt.close();

	}
	
	
	
	//최종 heart 제외 안드로이드 -> 서버
	@RequestMapping("/android2")
	public void android2(HttpServletRequest request) throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Cannot find the driver in the classpath!", e);
		}
		Connection conn = null;

		conn = DriverManager.getConnection(jdbcUrl);
		Statement stmt = (Statement) conn.createStatement();

		String date = request.getParameter("date");
		   String time = request.getParameter("time");
		   double co2 = Double.parseDouble(request.getParameter("co2"));
		   double humidity = Double.parseDouble(request.getParameter("humidity"));
		   double temperature = Double.parseDouble(request.getParameter("temperature"));
		   double discomfort = Double.parseDouble(request.getParameter("discomfort"));
		   double eye = Double.parseDouble(request.getParameter("eye"));

		   String command = "insert into SensorDB_1(date, time, humidity, temperature, discomfort, eye, co2) values('" + date
		            + "', '" + time + "', " + humidity + ", " + temperature + ", " + discomfort + ", "+ eye + ", " + co2 + ");";

		int rowNum = stmt.executeUpdate(command);

		conn.close();
		stmt.close();

	}

	
	@RequestMapping("/heart")
	public String heart() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("heart")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;
		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	
	@RequestMapping("/humidity")
	public String humidity() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("humidity")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	
	@RequestMapping("/temperature")
	public String temperature() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("temperature")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	
	@RequestMapping("/discomfort")
	public String discomfort() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("discomfort")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	
	
	@RequestMapping("/eye")
	public String eye() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("eye")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	

	@RequestMapping("/co2")
	public String co2() throws Exception {
		try {
			System.out.println("Loading driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
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
		String SQL = "select * from SensorDB_1";
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		int numberofColumn = rsmd.getColumnCount();

		List<Float> row = null;
		List<ArrayList<Float>> result = new ArrayList();

		int count = 0;

		while (rs.next()) {
			row = new ArrayList<Float>();
			
			row.add(Float.parseFloat(rs.getString("id")));
			row.add(Float.parseFloat(rs.getString("co2")));
			
			result.add(count, (ArrayList<Float>) row);
			count++;

		}

		System.out.println(result.toString());

		// System.out.println(req.get);

		// req.g

		con.close();
		rs.close();

		return result.toString();
	}
	
	
	
	
}
