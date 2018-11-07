package entities;

public class Member {
	private Integer idUsser;
	private String nameFamily;
	private String nameCharacter;
	
	
	public Member(Integer idUsser, String nameFamily, String nameCharacter) {
		this.idUsser = idUsser;
		this.nameFamily = nameFamily;
		this.nameCharacter = nameCharacter;
	}

	public Integer getIdUsser() {
		return idUsser;
	}


	public void setIdUsser(Integer idUsser) {
		this.idUsser = idUsser;
	}


	public String getNameFamily() {
		return nameFamily;
	}


	public void setNameFamily(String nameFamily) {
		this.nameFamily = nameFamily;
	}


	public String getNameCharacter() {
		return nameCharacter;
	}


	public void setNameCharacter(String nameCharacter) {
		this.nameCharacter = nameCharacter;
	}
	
}
