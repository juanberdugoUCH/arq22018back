package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entidades.Member;

public class MemberRepository {
   private final String table = "Member";

   public ArrayList<Member> recuperarNivel(Connection conexion) throws SQLException {
      ArrayList<Member> memberList = new ArrayList<Member>();
      try{
         PreparedStatement query = conexion.prepareStatement("SELECT * FROM " + this.table);
         ResultSet result = query.executeQuery();
         while(result.next()){
            String nickname = result.getString("nickname");
            String name = result.getString("name");
            Boolean discord = result.getBoolean("discord");
            int level = Integer.parseInt(result.getString("level"));
            int totalPoints = Integer.parseInt(result.getString("totalPoints"));
            
            Member mb = new Member(nickname,name,discord,level,totalPoints);
            memberList.add(mb);
            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return memberList;
   }    
}
