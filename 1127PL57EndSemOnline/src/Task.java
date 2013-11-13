
public class Task {
	private String description;
	private int hours;
	
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
