import java.util.ArrayList;


public class Sprint {
	private ArrayList stories = new ArrayList();
	
	public void assignStory(Story story)
	{
		stories.add(story);
	}
	
	public Story getStory(int index)
	{
		return (Story) stories.get(index);
	}
}
