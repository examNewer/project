package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCForMysql {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://106.13.209.161:5186/learning_system?useSSL=false&useUnicode=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowPublicKeyRetrieval=true&allowMultiQueries=true";
			conn=DriverManager.getConnection(url,"root","root");
			 System.out.println("Connection status, isClosed: " + conn.isClosed());            statement = conn.createStatement();

			 statement.executeUpdate("CREATE TABLE IF NOT EXISTS staff (id varchar(20),name varchar(20),lastModifiedTime datetime)");

			 for (int i = 0; i < 10; i++) {

			     String sql = String.format("insert into staff (id,name,lastModifiedTime) values('%s','%s',current_timestamp()) ", "no" + i, "name" + i);

			     statement.addBatch(sql);

			 }

			 statement.executeBatch();

			 resultSet = statement.executeQuery("select id,name,lastModifiedTime from staff");

			 ResultSetMetaData metaData = resultSet.getMetaData();

			 int columnCount = metaData.getColumnCount();

			 for (int i = 1; i <= columnCount; i++) {

			     System.out.print(metaData.getColumnLabel(i) + "\t");

			 }

			 System.out.println("");

			 while (resultSet.next()) {

			     for (int i = 1; i <= columnCount; i++) {

			         System.out.print(resultSet.getString(i) + "\t");

			     }

			     System.out.println("");

			 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

	           if (resultSet != null) {

	               try {

	                   resultSet.close();

	               } catch (SQLException ignored) {

	               }

	           }            if (statement != null) {

	               try {

	                   statement.close();

	               } catch (SQLException ignored) {

	               }

	           }

	           if (conn != null) {

	               try {

	                   conn.close();

	               } catch (SQLException ignored) {

	               }

	           }

	       }
	}
}
