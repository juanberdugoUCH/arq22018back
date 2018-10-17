package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entidades.Nivel;
import java.util.ArrayList;
import java.util.LinkedList;
public class LevelRepository {
    private final String tabla = "Level";

   public ArrayList<Nivel> recuperarNivel(Connection conexion) throws SQLException { //Lo habia echo con LinkedList (lista doblemente enlazada)
      ArrayList<Nivel> listaNiveles = new ArrayList<Nivel>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            int number = Integer.parseInt(resultado.getString("number")) ;
            int superiorLimit = Integer.parseInt("superiorLimit");
            int inferiorLimit = Integer.parseInt("inferiorLimit");
            int bond = Integer.parseInt("bond");
            
            Nivel nivel = new Nivel(number,superiorLimit,inferiorLimit,bond);
            listaNiveles.add(nivel);
            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
         }
         /*resultado.close();
         consulta.close();
         conexion.close();*/
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaNiveles;
   }       
}
