package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entidades.Level;
import java.util.ArrayList;

public class LevelRepository {
    private final String table = "Level";

   public ArrayList<Level> recuperarNivel(Connection conexion) throws SQLException {
      ArrayList<Level> levelList = new ArrayList<Level>();
      try{
         PreparedStatement query = conexion.prepareStatement("SELECT * FROM " + this.table);
         ResultSet result = query.executeQuery();
         while(result.next()){
        	String pjName = result.getString("pjName");
            int level = Integer.parseInt(result.getString("number")) ;
            int superiorLimit = Integer.parseInt(result.getString("superiorLimit"));
            int inferiorLimit = Integer.parseInt(result.getString("inferiorLimit"));
            int bond = Integer.parseInt(result.getString("bond"));
            int currentPoints = Integer.parseInt(result.getString("currentPoints"));
            
            Level nivel = new Level(pjName,level,superiorLimit,inferiorLimit,bond,currentPoints);
            levelList.add(nivel);
            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
         }
         /*resultado.close();
         consulta.close();
         conexion.close();*/
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return levelList;
   }       
}
