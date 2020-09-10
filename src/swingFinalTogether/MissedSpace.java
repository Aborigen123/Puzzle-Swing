package swingFinalTogether;

public class MissedSpace {
	
	private String name;
	
	private String whereMissedSpace;
	
	private int  missedSpace;

	public MissedSpace(String name, String whereMissedSpace, int missedSpace) {
		this.name = name;
		this.whereMissedSpace = whereMissedSpace;
		this.missedSpace = missedSpace;
	}

	public MissedSpace() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhereMissedSpace() {
		return whereMissedSpace;
	}

	public void setWhereMissedSpace(String whereMissedSpace) {
		this.whereMissedSpace = whereMissedSpace;
	}

	public int getMissedSpace() {
		return missedSpace;
	}

	public void setMissedSpace(int missedSpace) {
		this.missedSpace = missedSpace;
	}
	
	

}
