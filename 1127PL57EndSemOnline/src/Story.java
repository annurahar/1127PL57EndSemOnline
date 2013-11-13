import java.util.ArrayList;


public class Story {
	private String description;
	private int priorityNumber;
	private int storyPoint;
	private ArrayList tasks = new ArrayList();
	
	public Story(String description, int priorityNumber, int storyPoint) {
		
		this.description = description;
		this.priorityNumber = priorityNumber;
		this.storyPoint = storyPoint;
		
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

	public void addTask(Task task)
	{
		tasks.add(task);
	}
	
	public Task getTask(int index)
	{
		return (Task) tasks.get(index);
	}
}
