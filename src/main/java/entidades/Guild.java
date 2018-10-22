package entidades;

public class Guild {
	private String name;
	private Integer totalMembers;
	private Integer totalOfficers;
	private String leaderName;
	private Integer idGuild;
	
	public Guild(String name, Integer totalMembers, Integer totalOfficers, String leaderName, Integer idGuild) {
		super();
		this.name = name;
		this.totalMembers = totalMembers;
		this.totalOfficers = totalOfficers;
		this.leaderName = leaderName;
		this.idGuild = idGuild;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMembers() {
		return totalMembers;
	}
	public void setTotalMembers(Integer totalMembers) {
		this.totalMembers = totalMembers;
	}
	public Integer getTotalOfficers() {
		return totalOfficers;
	}
	public void setTotalOfficers(Integer totalOfficers) {
		this.totalOfficers = totalOfficers;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public Integer getIdGuild() {
		return idGuild;
	}
	public void setIdGuild(Integer idGuild) {
		this.idGuild = idGuild;
	}
	
	
}
