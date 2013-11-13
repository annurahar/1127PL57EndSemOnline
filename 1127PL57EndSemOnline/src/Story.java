
public class Story {
	private String description;
	private int priorityNumber;
	private int storyPoint;
	private int taskHours;
	
	public Story(String description, int priorityNumber, int storyPoint, int taskHours) {
		
		this.description = description;
		this.priorityNumber = priorityNumber;
		this.storyPoint = storyPoint;
		this.taskHours = taskHours;
	}

	public String toString() {
		return description;
	}

	public int getPriorityNumber() {
		return priorityNumber;
	}

	public int getStoryPoint() {
		return storyPoint;
	}

	public int getTaskHours() {
		return taskHours;
	}
}
