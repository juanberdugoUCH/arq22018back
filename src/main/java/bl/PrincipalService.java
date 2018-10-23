package bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import dal.*;
import entidades.Guild;
import entidades.Level;
import entidades.Member;

public class PrincipalService {
	
	Connection connection;
	
	public PrincipalService() {
		
		this.connection = new Conexion().obtener();
		
	}

	public void GetData() {
		
		 ArrayList<Level> niveles = new ArrayList<Level>();
		 ArrayList<Guild> gremios = new ArrayList<Guild>();
		 ArrayList<Member> miembros = new ArrayList<Member>();
		 
		 LevelRepository repoNivel = new LevelRepository();
		 MemberRepository repoMiembro = new MemberRepository();
		 GuildRepository repoGremio = new GuildRepository();
		 
		 //Recupero todos los niveles
		 try {
			niveles = repoNivel.recuperarNivel(connection);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		 
		 //Recupero todos los Gremios
		 try {
			 gremios = repoGremio.recuperarNivel(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		 
		 //Recupero todos los Miembros
		 try {
			 miembros = repoMiembro.recuperarNivel(connection);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
	}
}
