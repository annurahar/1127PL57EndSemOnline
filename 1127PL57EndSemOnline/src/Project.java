
public class Project {
	private String projectName;
	private Team team;
	
	public Project(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void assignTeam(Team team)
	{
		this.team=team;
	}

	public Team getTeam() {
		return team;
	}
	
}
