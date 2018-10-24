package entities;

import java.util.Date;

public class Contract {
	private Integer idFamily;
	private Double salary;
	private Date validSince;
	private Date validUntil;
	private Double compensation;

    public Contract(Integer idFamily, Double salary, Date validSince, Date validUntil, Double compensation) {
        super();
        this.idFamily = idFamily;
        this.salary = salary;
        this.validSince = validSince;
        this.validUntil = validUntil;
        this.compensation = compensation;
    }

    public Integer getIdFamily() {
        return idFamily;
    }

    public void setIdFamily(Integer idFamily) {
        this.idFamily = idFamily;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getCompensation() {
        return compensation;
    }

    public void setCompensation(Double compensation) {
        this.compensation = compensation;
    }

    public Date getValidSince() {
        return validSince;
    }

    public void setValidSince(Date validSince) {
        this.validSince = validSince;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
