package excelRead.excelRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.xdevapi.Statement;

public class DButility {
	

	Connection conn = null;
    java.sql.Statement stmt = null;
	
	@SuppressWarnings("rawtypes")
	void createTableIntoDB(String tableName,String createTable) throws SQLException{
	
   
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          conn =DriverManager.getConnection("jdbc:mysql://localhost/santanu", "root", "Pune@2022");
          
          System.out.println("Connection is created successfully:");
          DatabaseMetaData dbm = (DatabaseMetaData) conn.getMetaData();
          ResultSet tables = dbm.getTables(null, null, tableName, null);
          stmt = conn.createStatement();
          
          //check if table exist
          if (!tables.next()) {
        	//for creating table
        	  ((java.sql.Statement) stmt).executeUpdate(createTable);
          }
          
       } catch (Exception e) {
          System.out.println(e);
    }
       
    
        finally {
          try {
             if (stmt != null)
                conn.close();
          } catch (SQLException se) {}
          try {
             if (conn != null)
                conn.close();
          } catch (SQLException se) {
             se.printStackTrace();
          }  
       }
       System.out.println("Please check it in the MySQL DB......... ……..");
    }
	
	void insertData(String insertData) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/santanu", "root", "Pune@2022");
			System.out.println("Connection is created successfully:");

			stmt = conn.createStatement();

			// for inserting Data
			((java.sql.Statement) stmt).executeUpdate(insertData);

			System.out.println("Record is inserted in the table successfully..................");

		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Please check it in the MySQL Table......... ……..");

	}
       
	}


