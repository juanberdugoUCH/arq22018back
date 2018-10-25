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
        ArrayList<Member> members = new ArrayList<Member>();
        MemberRepository repoMembers = new MemberRepository();
        ArrayList<PrincipalModel> result = new ArrayList<PrincipalModel>();

        // Recupero todos los Miembros
        try {
            members = repoMembers.getMembers(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Armo la lista de modelos principales
        for (Member member : members) {
            PrincipalModel modelItem = new PrincipalModel();

            modelItem.NameMember = member.getName();
            modelItem.ActivityPoint = new ArrayList<ActivityDto>();
            modelItem.Level = member.getLevel();
            result.add(modelItem);
        }
        return result;
    }
}