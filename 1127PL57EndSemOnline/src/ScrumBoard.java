import java.util.ArrayList;


public class ScrumBoard {
	private ArrayList toDoTasks = new ArrayList();
	private ArrayList doing = new ArrayList();
	private ArrayList done = new ArrayList();
	
	public void addToDoTask(Task task)
	{
		toDoTasks.add(task);
	}
	
	public void addDoing(Task task)
	{
		doing.add(task);
	}
	
	public void addDone(Task task)
	{
		done.add(task);
	}
	
	public void removetoDoTask(Task task)
	{
		toDoTasks.remove(task);
	}
	
	public void removeDoing(Task task)
	{
		doing.remove(task);
	}
	
	public Task getToDoTask(int index)
	{
		return (Task) toDoTasks.get(index);
	}
	
	public Task getDoing(int index)
	{
		return (Task) doing.get(index);
	}
	
	public Task getDone(int index)
	{
		return (Task) done.get(index);
	}
	
}

