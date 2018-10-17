package entidades;

public class Nivel {
	private Integer number;
	private Integer superiorLimit;
	private Integer inferiorLimit;
	private Integer bond;
	//Constructor
	public Nivel(Integer number, Integer superiorLimit, Integer inferiorLimit, Integer bond) {
		super();
		this.number = number;
		this.superiorLimit = superiorLimit;
		this.inferiorLimit = inferiorLimit;
		this.bond = bond;
	}
	//Sets and Gets
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getSuperiorLimit() {
		return superiorLimit;
	}
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
	
	
}
