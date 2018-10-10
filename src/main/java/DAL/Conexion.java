package DAL;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
	   private static Connection cnx = null;
	   public static Connection obtener() throws SQLException, ClassNotFoundException {
	      if (cnx == null) {
	         try {
	            Class.forName("com.mysql.jdbc.Driver");
	            cnx = DriverManager.getConnection("jdbc:mysql://localhost/rb_blackdesert", "root", "Xv242a2018");
	            System.out.println("CONECTADO");
	         } catch (SQLException ex) {
	            throw new SQLException(ex);
	         } catch (ClassNotFoundException ex) {
	            throw new ClassCastException(ex.getMessage());
	         }
	      }
	      return cnx;
	   }
	   public static void cerrar() throws SQLException {
	      if (cnx != null) {
	         cnx.close();
	      }
	   }
	}