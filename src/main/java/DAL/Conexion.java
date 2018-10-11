package DAL;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
   private Connection cnx = null;
   public Connection obtener(){
      if (cnx == null) {
    	  try{
	            try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            cnx = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/ravenbunny", "ravenbunny", "ravenbunny");
	            System.out.println("CONECTADO");
            }catch (SQLException ex) {
        	 System.out.print(ex);
        	 }
      }
      return cnx;
  }
   public void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
}