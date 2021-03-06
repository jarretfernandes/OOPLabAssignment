package pojo;

public class Player implements Cloneable {
	private String fullName;
	private Integer jerseyNumber;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void kickBall(Ball ball) {
		System.out.println(fullName + " kicked " + (ball != null ? "ball" : "air"));
	}
	
	public Player() {
		fullName = "";
		jerseyNumber = 0;
	}

	public Player(String fullName, Integer jerseyNumber) {
		this.fullName = fullName;
		this.jerseyNumber = jerseyNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(Integer jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
}
