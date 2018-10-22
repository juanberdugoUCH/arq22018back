package entidades;

public class Member {
	private String nickname;
	private String name;
	private Boolean discord;
	private Integer level;
	private Integer totalPoints;
	
	public Member(String nickname, String name, Boolean discord, Integer level, Integer totalPoints) {
		super();
		this.nickname = nickname;
		this.name = name;
		this.discord = discord;
		this.level = level;
		this.totalPoints = totalPoints;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getDiscord() {
		return discord;
	}
	public void setDiscord(Boolean discord) {
		this.discord = discord;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	
}
