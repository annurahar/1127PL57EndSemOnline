
public class TeamMember {
	private String name;
	private String role;
	private Task task;
	private int hoursTaken;
	public int getHoursTaken() {
		return hoursTaken;
	}

	public TeamMember(String name, String role) {
	
		this.name = name;
		this.role = role;
	}
	
	public void allocateTask(Task task)
	{
		this.task=task;
		task.setMember(this);
	}
	
	public Task getTask()
	{
		return task;
	}
	
	public void completedTaskIn(int hours)
	{
		this.hoursTaken=hours;
	}
}
