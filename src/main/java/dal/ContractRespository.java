package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import entities.Contract;

public class ContractRespository {
	private final String table = "Contract";
    private String pattern = "dd/mm/yyyy";
    private SimpleDateFormat format = new SimpleDateFormat(pattern);
	
	public ArrayList<Contract> getContracts(Connection cnx) throws SQLException {
		ArrayList<Contract> listContracts = new ArrayList<Contract>();
	      try{
	         PreparedStatement query = cnx.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet result = query.executeQuery();
	         while(result.next()){
	            int idFamily = Integer.parseInt(result.getNString("idFamily")) ;
	            double salary = Integer.parseInt(result.getNString("salary"));
	            Date validSince = format.parse(result.getNString("validSince"));
	            Date validUntil = format.parse(result.getNString("validUntil"));
	            double compensation = Integer.parseInt(result.getNString("compensation"));

	            Contract contract = new Contract(idFamily, salary, validSince, validUntil, compensation);
	            listContracts.add(contract);
	            System.out.println("SELECT Realizado - Contratos obtenidos de forma exitosa.");
	         }
	      }catch(SQLException ex){
              System.out.println("Error al obtener los contratos: " + ex.getCause());
              throw new SQLException(ex);
	      } catch (ParseException e) {
              System.out.println("Error al parsear las fechas: " + e.getCause());
              e.printStackTrace();
          }
        return listContracts;
	   }
}
