package bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import dal.*;
import entities.*;
import model.PrincipalModel;


public class PrincipalService {
	
	Connection connection;
	
	public PrincipalService() {
		
		this.connection = new MySQLAccess().getConnection();
		
	}

	public ArrayList<PrincipalModel> GetMemberActivity(){
		
		ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();
		
		MemberRepository repoMembers = new MemberRepository();
		ActivitiesRepository repoActivities = new ActivitiesRepository();
		MemberActivitiesRepository repoMemberActivities = new MemberActivitiesRepository();
		
		ArrayList<Member> member = new ArrayList<Member>();
		ArrayList<Activities> activities = new ArrayList<Activities>();
		ArrayList<MemberActivities> memberActivities = new ArrayList<MemberActivities>();
		
		try {
			member = repoMembers.getMembers(connection);
			activities = repoActivities.getActivities(connection);
			memberActivities = repoMemberActivities.getMemberActivities(connection);
			
		} catch (SQLException e) {
			System.out.println("CONNECTION FAIL: "+e);
		}
		for(int i = 0; i < member.size(); i++) {
			
			PrincipalModel miembroFinal = new PrincipalModel();
			//Inicializamos las variables en  = 0 para evitar error de nullPointer...
			miembroFinal.cantDiscord = 0;
			miembroFinal.cantCasaMaritima = 0;
			miembroFinal.cantidadMision = 0;
			miembroFinal.cantRenovacionContrato= 0;
			miembroFinal.cantAyudarMiembro = 0;
			
			//Asignamos los datos del Member
			miembroFinal.nickname = member.get(i).getNameFamily();
			miembroFinal.name = member.get(i).getNameCharacter();
			
			for( int j = 0; j<memberActivities.size(); j++) {
				
				if(member.get(i).getIdUsser().equals(memberActivities.get(j).getIdUsser())) {
					//Contamos la cantidad de veces que realizan los miembros una actividad...
					if(memberActivities.get(j).getIdActivity().equals(2))
						miembroFinal.cantDiscord += 1;
					
					if(memberActivities.get(j).getIdActivity().equals(3))
						miembroFinal.cantCasaMaritima += 1;
					
					if(memberActivities.get(j).getIdActivity().equals(4))
						miembroFinal.cantidadMision += 1;
					
					if(memberActivities.get(j).getIdActivity().equals(5))
						miembroFinal.cantRenovacionContrato += 1;
					
					if(memberActivities.get(j).getIdActivity().equals(6))
						miembroFinal.cantAyudarMiembro += 1;	
					
				}
				
				for( int k = 0; k<activities.size(); k++) {
					//Asignamos los puntos...
					if(activities.get(k).getIdActivity().equals(2))
					miembroFinal.tpDiscord = (int) miembroFinal.cantDiscord * activities.get(k).getValueActivity();
					
					if(activities.get(k).getIdActivity().equals(3))
					miembroFinal.tpCasaMaritima =  (int) miembroFinal.cantCasaMaritima * activities.get(k).getValueActivity();
					
					if(activities.get(k).getIdActivity().equals(4))
					miembroFinal.tpMision =  miembroFinal.cantidadMision * activities.get(k).getValueActivity();
					
					if(activities.get(k).getIdActivity().equals(5))
					miembroFinal.tpRenovacionContrato = (int)  miembroFinal.cantRenovacionContrato * activities.get(k).getValueActivity();
					
					if(activities.get(k).getIdActivity().equals(6))
					miembroFinal.tpAyudaMiembro = (int)  miembroFinal.cantAyudarMiembro * activities.get(k).getValueActivity();
					
					}
			}
			
			//Sumamos el total de los puntos obtenidos...
			miembroFinal.tp = miembroFinal.tpDiscord + miembroFinal.tpCasaMaritima + miembroFinal.tpMision + miembroFinal.tpRenovacionContrato + miembroFinal.cantAyudarMiembro;
			
			//Asignamos el valor del nivel del bono en base a la sumatoria total...
			if(miembroFinal.tp<=10) {
				miembroFinal.nivelBono = (int)  miembroFinal.tp;
			}else {
				miembroFinal.nivelBono = 10;
			}
			
			//Agregamos al primer miembro de la lista...
			result.add(miembroFinal);
		}

		return result;
	}

}
