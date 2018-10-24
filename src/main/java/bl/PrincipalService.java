package bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import dal.*;
import entities.*;


public class PrincipalService {
	
	Connection connection;
	
	public PrincipalService() {
		
		this.connection = new MySQLAccess().getConnection();
		
	}

	public void GetData() {
		
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
	}
}
