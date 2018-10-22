package entities;

public class Level {
	private String pjName;
	private Integer level;
	private Integer superiorLimit;
	private Integer inferiorLimit;
	private Integer bond; //bono
	private Integer currentPoints;
	//Constructor
	public Integer getSuperiorLimit() {
		return superiorLimit;
	}
	public Level(String pjName, Integer level, Integer superiorLimit, Integer inferiorLimit, Integer bond,
			Integer currentPoints) {
		super();
		this.pjName = pjName;
		this.level = level;
		this.superiorLimit = superiorLimit;
		this.inferiorLimit = inferiorLimit;
		this.bond = bond;
		this.currentPoints = currentPoints;
	}
	//Sets and Gets
	public void setSuperiorLimit(Integer superiorLimit) {
		this.superiorLimit = superiorLimit;
	}
	public Integer getInferiorLimit() {
		return inferiorLimit;
	}
	public void setInferiorLimit(Integer inferiorLimit) {
		this.inferiorLimit = inferiorLimit;
	}
	public Integer getBond() {
		return bond;
	}
	public void setBond(Integer bond) {
		this.bond = bond;
	}
	public String getPjName() {
		return pjName;
	}
	public void setPjName(String pjName) {
		this.pjName = pjName;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getCurrentPoints() {
		return currentPoints;
	}
	public void setCurrentPoints(Integer currentPoints) {
		this.currentPoints = currentPoints;
	}
	
	
}
