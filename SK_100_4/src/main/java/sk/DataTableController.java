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

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTableController {


	String dbName = "ExampleDB";
	String userName = "lemoner";
	String password = "tjsqhd11";
	String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
	String port = "3306";
	String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
			+ password;
	
	@RequestMapping("/dataTable1")
	public String dataTable() throws Exception {
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

		List<String> row = null;
		List<ArrayList<String>> result = new ArrayList();

		int count = 0;
		//System.out.println("1111");
		
		//System.out.println(numberofColumn);
		
		while (rs.next()) {
			//System.out.println("2");
			row = new ArrayList<String>();
			for (int j = 1; j <= numberofColumn; j++) {
				//System.out.println("3");
				//System.out.print(rs.getString(j) + "  ");
				row.add((rs.getString(j)));

				//System.out.println(row.toString());
			}
			//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");

			result.add(count, (ArrayList<String>) row);
			count++;
			//System.out.println(count);
			//System.out.println(result.toString());

		}

		System.out.println(result.toString());
		
		con.close();
		rs.close();
		
		Map<String, List> mapobject=new HashMap<String, List>();
		mapobject.put("data", result);
		
		System.out.println(mapobject);
		
		System.out.println("test object2");

		System.out.println("0");
		JSONObject jobj = new JSONObject();
		System.out.println("1");
		jobj.put("data", result);
		System.out.println("2");
		String data = jobj.toString();
		System.out.println("3");
		//System.out.println("jobj is "+jobj);
		System.out.println("datTable Test "+data);
		System.out.println("4");
		return data;
	}
}
