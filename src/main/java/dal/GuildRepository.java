package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Guild;

public class GuildRepository {
	private final String table = "Guild";

	   public ArrayList<Guild> getGuilds(Connection cnx) throws SQLException {
	      ArrayList<Guild> guildList = new ArrayList<Guild>();
	      try{
	         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet result = query.executeQuery();
	         while(result.next()){
	        	int idGuild = Integer.parseInt(result.getString("idGuild"));
	            String name = result.getString("nameGuild");
	            String leaderName = result.getString("leaderName");
	            int totalMembers = Integer.parseInt(result.getString("totalMembers"));
	            int totalOfficers = Integer.parseInt(result.getString("totalOfficers"));
	            
	            
	            Guild gld = new Guild(name,totalMembers,totalOfficers,leaderName,idGuild);
	            guildList.add(gld);
	            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
	         }
	      }catch(SQLException ex){
	         throw new SQLException(ex);
	      }
	      return guildList;
	   }    
}
