package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.MemberActivities;

public class MemberActivitiesRepository {
	private final String table = "MemberActivity";
	public ArrayList<MemberActivities> getMemberActivities(Connection cnx) throws SQLException {
		ArrayList<MemberActivities> listMemberActivities = new ArrayList<MemberActivities>();
	      try{
	         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet result = query.executeQuery();
	         while(result.next()){
	        	 
	        	 Integer idMemberActivity = result.getInt("idMemberActivity");
	        	 Integer idUsser =result.getInt("idUsser");
	        	 Integer idAvtivity= result.getInt("idActivity");
	            
	        	 MemberActivities memberActivity = new MemberActivities(idMemberActivity, idUsser, idAvtivity);
	            listMemberActivities.add(memberActivity);
	            System.out.println("SELECT Realizado - Member Activities obtenidos de forma exitosa...");
	         }
	      }catch(SQLException ex){
            System.out.println("Error al obtener los Member Activities: " + ex.getCause());
            throw new SQLException(ex);
	      } 
      return listMemberActivities;
	}
}
