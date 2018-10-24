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
	
	public ArrayList<PrincipalModel> GetDataMock(){
		ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();
		
		PrincipalModel miembroUno = new PrincipalModel();
		miembroUno.ActivityPoint = new ArrayList<ActivityDto>();
		ActivityDto dtoUno = new ActivityDto();
		ActivityDto dtoDos = new ActivityDto();
		
		dtoDos.ActivityName = "pesca";
		dtoDos.ActivityPoint = 20;
		dtoUno.ActivityName = "caza";
		dtoUno.ActivityPoint = 20;
		miembroUno.ActivityPoint.add(dtoDos);
		miembroUno.ActivityPoint.add(dtoUno);
		PrincipalModel miembroDos = new PrincipalModel();
		miembroDos.ActivityPoint = new ArrayList<ActivityDto>();
		ActivityDto dtoTres = new ActivityDto();
		dtoTres.ActivityName = "pesca";
		dtoTres.ActivityPoint = 20;
		miembroUno.ActivityPoint.add(dtoTres);
		miembroDos.NameMember = "Gonzalo";
		miembroDos.Level = 5;
		
		result.add(miembroUno);
		result.add(miembroDos);
		return result;
	}
}
