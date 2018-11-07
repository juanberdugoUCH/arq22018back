package dal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entities.Activities;

public class ActivitiesRepository {
	private final String table = "Activty";
	public ArrayList<Activities> getActivities(Connection cnx) throws SQLException {
		ArrayList<Activities> listActivities = new ArrayList<Activities>();
	      try{
	         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet result = query.executeQuery();
	         while(result.next()){
	        	 
	        	 Integer idActivity = result.getInt("idActivity");
	        	 String activityName =result.getString("nameActivity");
	        	 double valueActivity= result.getDouble("valueActivity");
	            
	            Activities activity = new Activities(idActivity, activityName, valueActivity);
	            listActivities.add(activity);
	            System.out.println("SELECT Realizado - Activities obtenidos de forma exitosa...");
	         }
	      }catch(SQLException ex){
            System.out.println("Error al obtener las Activities: " + ex.getCause());
            throw new SQLException(ex);
	      } 
      return listActivities;
	}
}
