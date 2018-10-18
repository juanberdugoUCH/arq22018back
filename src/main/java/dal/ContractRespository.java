package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entidades.Contrato;

public class ContractRespository {
	private final String table = "Contract";
	String pattern = "dd/mm/yyyy";
    SimpleDateFormat format = new SimpleDateFormat(pattern);
	
	public ArrayList<Contrato> recuperarNivel(Connection conexion) throws SQLException { //Lo habia echo con LinkedList (lista doblemente enlazada)
		ArrayList<Contrato> listContracts = new ArrayList<Contrato>();
	      try{
	         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.table);
	         ResultSet resultado = consulta.executeQuery();
	         while(resultado.next()){
	            int idFamily = Integer.parseInt(resultado.getString("idFamily")) ;
	            double salary = Integer.parseInt("salary");
	            //Date validSince = format.parse(resultado.getString("validSince"));
	            //Date validUntil = format.parse(resultado.getString("validUntil"));
	            double compensation = Integer.parseInt("compensation"); 
	            
	            
	            Contrato contract = new Contrato();
	            listContracts.add(contract);
	            System.out.println("SELECT Realizado - Objeto producto realizado de forma exitosa.");
	         }
	         /*resultado.close();
	         consulta.close();
	         conexion.close();*/
	      }catch(SQLException ex){
	         throw new SQLException(ex);
	      }
	      return listContracts;
	   }
}
