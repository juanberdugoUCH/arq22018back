package bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import dal.*;
import entities.*;
import model.ActivityDto;
import model.PrincipalModel;


public class PrincipalService {
	
	Connection connection;
	
	public PrincipalService() {
		
		this.connection = new MySQLAccess().getConnection();
		
	}

	public ArrayList<PrincipalModel> GetData() {
		
		ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();
		
		 ArrayList<Level> niveles = new ArrayList<Level>();
		 ArrayList<Guild> gremios = new ArrayList<Guild>();
		 ArrayList<Member> miembros = new ArrayList<Member>();
		 ArrayList<Activities> actividades = new ArrayList<Activities>();
		 ArrayList<Contract> contratos = new ArrayList<Contract>();
		 
		 LevelRepository repoNivel = new LevelRepository();
		 MemberRepository repoMiembro = new MemberRepository();
		 GuildRepository repoGremio = new GuildRepository();
		 ActivitiesRepository repoActividad = new ActivitiesRepository();
		 ContractRespository repoContrato = new ContractRespository();
		 
		 //Recupero todos los niveles
		 try {
			niveles = repoNivel.getLevels(connection);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		 
		 //Recupero todos los Gremios
		 try {
			 gremios = repoGremio.getGuilds(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		 
		 //Recupero todos los Miembros
		 try {
			 miembros = repoMiembro.getMembers(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		//Recupero todos los Miembros
		 try {
			 contratos = repoContrato.getContracts(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		 
		//Recupero todos los Miembros
		 try {
			 actividades = repoActividad.getActivities(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		 
		 
		 for(int i=0;i<=miembros.size();i++) {
			 PrincipalModel m = new PrincipalModel();
			 //Forma bien hecha por tema de dependencias.
			 /*
			 m.nombre = miembros.get(i).getName();
			 m.tpDiscord = miembros.get(i).getDiscord().toString();
			 m.cantidadCasaMaritima = miembros.get(i).getQuantityCM();
			 m.tpCasaMaritima = miembros.get(i).getTpCM();
			 m.cantidadMision = miembros.get(i).getQuantityMision();
			 m.tpMision = miembros.get(i).getTpMision();
			 m.cantidadRenovacionContrato = miembros.get(i).getQuantityRC();
			 m.tpRenovacionContrato = miembros.get(i).getRenocationContract();
			 m.cantidadAyudarMiembro = miembros.get(i).getQuantityAM();
			 m.tpAyudarMiembro = miembros.get(i).getTpAM();
			 m.tp = miembros.get(i).getTp();
			 m.nivelBono = miembros.get(i).getLevel();
			 */
			 result.add(m);
		 }
		 
		 return result;
	}
	
	public ArrayList<PrincipalModel> GetDataMock(){
		ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();
		
		PrincipalModel miembroUno = new PrincipalModel();
		miembroUno.nombre="Ailin";
		miembroUno.cantidadDiscord="2";
		miembroUno.tpDiscord="34";
		miembroUno.cantidadCasaMaritima="2";
		miembroUno.tpCasaMaritima="32";
		miembroUno.cantidadMision="12";
		miembroUno.tpMision="12";
		miembroUno.cantidadRenovacionContrato="123";
		miembroUno.tpRenovacionContrato="13";
		miembroUno.cantidadAyudarMiembro="123";
		miembroUno.tpAyudarMiembro="23";
		miembroUno.tp="123123";
		miembroUno.nivelBono="6";
		result.add(miembroUno);
		return result;
	}
	
	public ArrayList<PrincipalModel> GetPuntosMock(){
		ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();
		
		PrincipalModel miembroUno = new PrincipalModel();
		miembroUno.nombre="Ailin";
		miembroUno.cantidadDiscord="2";
		miembroUno.tpDiscord="34";
		miembroUno.cantidadCasaMaritima="2";
		miembroUno.tpCasaMaritima="32";
		miembroUno.cantidadMision="12";
		miembroUno.tpMision="12";
		miembroUno.cantidadRenovacionContrato="123";
		miembroUno.tpRenovacionContrato="13";
		miembroUno.cantidadAyudarMiembro="123";
		miembroUno.tpAyudarMiembro="23";
		miembroUno.tp="123123";
		miembroUno.nivelBono="6";
		result.add(miembroUno);
		
		return result;
	}
}
