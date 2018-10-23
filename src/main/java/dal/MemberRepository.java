package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entities.Member;

public class MemberRepository {
   private final String table = "Member";

   public ArrayList<Member> getMembers(Connection cnx) throws SQLException {
      ArrayList<Member> memberList = new ArrayList<Member>();
      try{
         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
         ResultSet result = query.executeQuery();
         while(result.next()){
            String nickname = result.getString("nickname");
            String name = result.getString("name");
            Boolean discord = result.getBoolean("discord");
            int level = Integer.parseInt(result.getString("level"));
            int totalPoints = Integer.parseInt(result.getString("totalPoints"));
            
            Member member = new Member(nickname,name,discord,level,totalPoints);
            memberList.add(member);
            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return memberList;
   }    
}
