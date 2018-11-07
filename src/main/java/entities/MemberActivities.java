package entities;

public class MemberActivities {
	private Integer idMemberActivity;
	private Integer idUsser;
	private Integer idActivity;
	
	public MemberActivities(Integer idMemberActivity, Integer idUsser, Integer idActivity) {
		super();
		this.idMemberActivity = idMemberActivity;
		this.idUsser = idUsser;
		this.idActivity = idActivity;
	}

	public Integer getIdMemberActivity() {
		return idMemberActivity;
	}

	public void setIdMemberActivity(Integer idMemberActivity) {
		this.idMemberActivity = idMemberActivity;
	}

	public Integer getIdUsser() {
		return idUsser;
	}

	public void setIdUsser(Integer idUsser) {
		this.idUsser = idUsser;
	}

	public Integer getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(Integer idActivity) {
		this.idActivity = idActivity;
	}
}
