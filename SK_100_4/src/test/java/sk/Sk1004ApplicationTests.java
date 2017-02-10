package sk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sk1004ApplicationTests {

	@Test
	public void contextLoads() throws SQLException {

		String dbName = "ExampleDB";
		String userName = "lemoner";
		String password = "tjsqhd11";
		String hostname = "dbinstance.csoebcfdirpd.ap-northeast-1.rds.amazonaws.com";
		String port = "3306";
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?&user=" + userName + "&password="
				+ password;

		
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
		
		ResultSetMetaData rsmd = null;
		rsmd = rs.getMetaData();
		
		List<Float> result_1 = new ArrayList();
		int count = 0;
		while (rs.next()) {
			System.out.println("@");
			System.out.println(rs.getString("eye"));
			if(Float.parseFloat(rs.getString("eye")) > 1.0){
				System.out.println("1");
				count++;
			}
		}
		
		System.out.println("sleeping data "+ result_1.toString());
		
		con.close();
		rs.close();
		
		System.out.println(count);
		
		
		
		//System.out.println(result_1.toString());
		
		con.close();
		rs.close();
	}

}
