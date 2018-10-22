package dal;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MySQLAccess {
   private Connection cnn = null;
   public Connection getConnection(){
      if (cnn == null) {
    	  try{
	            cnn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/ravenbunny", "ravenbunny", "ravenbunny");
	            System.out.println("Connected");
            }catch (SQLException ex) {
        	 System.out.print(ex);
        	 }
      }
      return cnn;
  }
   public void closeConnection() throws SQLException {
      if (cnn != null) {
         cnn.close();
      }
   }
}