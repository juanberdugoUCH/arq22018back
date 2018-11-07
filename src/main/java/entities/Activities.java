package entities;

public class Activities {
	private Integer idActivity;
	private String activityName;
	private double valueActivity;

	public Activities(Integer idActivity, String activityName, double valueActivity) {
		this.idActivity = idActivity;
		this.activityName = activityName;
		this.valueActivity = valueActivity;
	}

	public Integer getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(Integer idActivity) {
		this.idActivity = idActivity;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public double getValueActivity() {
		return valueActivity;
	}

	public void setValueActivity(double valueActivity) {
		this.valueActivity = valueActivity;
	}

}
