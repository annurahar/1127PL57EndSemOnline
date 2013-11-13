
public class TeamMember {
	private String name;
	private String role;
	private Task task;
	
	public TeamMember(String name, String role) {
	
		this.name = name;
		this.role = role;
	}
	
	public void allocateTask(Task task)
	{
		this.task=task;
	}
	
	public Task getTask()
	{
		return task;
	}
}
