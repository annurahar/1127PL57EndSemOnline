import java.util.ArrayList;


public class Sprint {
	private int days;
	private ArrayList stories = new ArrayList();
	
	public Sprint(int days) {
		this.days = days;
	}
	
	public void assignStory(Story story)
	{
		stories.add(story);
		
	}
	
	public Story getStory(int index)
	{
		return (Story) stories.get(index);
	}

	public ArrayList getStories() {
		return stories;
	}
}
