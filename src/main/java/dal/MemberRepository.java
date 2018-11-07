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
        	 
        	Integer idUsser = result.getInt("idUsser");
            String nameFamily = result.getString("nameFamily");
            String nameCharacter = result.getString("nameCharacter");

            
            Member member = new Member(idUsser, nameFamily, nameCharacter);
            memberList.add(member);
            System.out.println("SELECT Realizado - Objeto Member realizado de forma exitosa.");
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return memberList;
   }    
}
