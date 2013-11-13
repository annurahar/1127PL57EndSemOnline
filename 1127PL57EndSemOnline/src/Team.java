import java.util.ArrayList;


public class Team {
	private String teamname;
	private ProductOwner productOwner;
	private ScrumMaster scrumMaster;
	private ArrayList teamMembers = new ArrayList();
	
	public Team(String teamname) {
		this.teamname = teamname;
	}

	/*public String getTeamname() {
		return teamname;
	}*/
	
	public String toString()
	{
		return teamname;
	}
	
	public void addTeamMembers(TeamMember member) {
		teamMembers.add(member);
	}

	public void setProductOwner(ProductOwner productOwner) {
		this.productOwner = productOwner;
	}

	public void setScrumMaster(ScrumMaster scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public void assignProject(Project project) {
		// TODO Auto-generated method stub
		
	}
}
