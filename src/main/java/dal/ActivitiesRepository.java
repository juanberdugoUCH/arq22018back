package dal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entities.Activities;

public class ActivitiesRepository {
	private final String table = "Activities";
	public ArrayList<Activities> getActivities(Connection cnx) throws SQLException {
		ArrayList<Activities> listActivities = new ArrayList<Activities>();
	      try{
	         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet result = query.executeQuery();
	         while(result.next()){
	        	 
	        	 String activityName =result.getNString("activityName");
	        	 int numPoints= Integer.parseInt(result.getNString("numPoints"));
	        	 int maxPoints= Integer.parseInt(result.getNString("maxPoints"));
	            
	            Activities activity = new Activities(activityName, numPoints, maxPoints);
	            listActivities.add(activity);
	            System.out.println("SELECT Realizado - Contratos obtenidos de forma exitosa.");
	         }
	      }catch(SQLException ex){
            System.out.println("Error al obtener los contratos: " + ex.getCause());
            throw new SQLException(ex);
	      } 
      return listActivities;
	}
}
