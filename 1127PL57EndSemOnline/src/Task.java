
public class Task {
	private String description;
	private int hours;
	private TeamMember member;
	
	
	public TeamMember getMember() {
		return member;
	}

	public void setMember(TeamMember member) {
		this.member = member;
	}

	public Task(String description, int hours) {
		
		this.description = description;
		this.hours = hours;
	}

	public String toString() {
		return description;
	}

	public int getHours() {
		return hours;
	}
	
	
}
