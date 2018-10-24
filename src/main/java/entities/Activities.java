package entities;

public class Activities {
	private String activityName;
	private int numPoints;
	private int maxPoints;

	public Activities(String activityName, int numPoints, int maxPoints) {
		super();
		this.activityName = activityName;
		this.numPoints = numPoints;
		this.maxPoints = maxPoints;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getNumPoints() {
		return numPoints;
	}

	public void setNumPoints(int numPoints) {
		this.numPoints = numPoints;
	}

	public int getMaxPoints() {
		return maxPoints;
	}

	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}
}
