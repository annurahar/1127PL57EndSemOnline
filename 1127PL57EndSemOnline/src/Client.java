import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Client {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() 
	{
		//create new project
		Project project = new Project("TicketBooking");	
		
		//Story 1 test case
		assertEquals("TicketBooking",project.toString());
		
		//create a team
		Team team=new Team("BookingTeam");
		project.assignTeam(team);
		
		//Story 2 test case
		assertEquals("BookingTeam",project.getTeam().toString());
		
		ProductOwner productOwner = new ProductOwner("Kapil");
		ScrumMaster scrumMaster = new ScrumMaster("Pravin");
		TeamMember member1 = new TeamMember("annu","programmer");
		TeamMember member2 = new TeamMember("abhishek","analyser");
		TeamMember member3 = new TeamMember("prajyot","tester");
		TeamMember member4 = new TeamMember("divya","documentation");
		
		//setting product owner 
		team.setProductOwner(productOwner);
		
		//setting scrum master
		team.setScrumMaster(scrumMaster);

		//adding team members
		team.addTeamMembers(member1);
		team.addTeamMembers(member2);
		team.addTeamMembers(member3);
		team.addTeamMembers(member4);
		
		//creating stories
		Story story1 = new Story("As a customer I want to book tickets and make payments",10,10);
		Story story2 = new Story("As a system administrator I want to generate reports",7,5);
		
		//test case for story 3
		assertEquals(10,story1.getPriorityNumber());
		assertEquals("As a system administrator I want to generate reports",story2.toString());
		
		//creating tasks
		Task task1= new Task("Design database",10);
		Task task2 = new Task("Design UI",15);
		Task task3 =  new Task("Write business logic",25);
		
		//add task for story 1
		story1.addTask(task1);
		story1.addTask(task2);
		story1.addTask(task3);
		
		//add task for story 2
		story2.addTask(task1);
		story2.addTask(task2);
		story2.addTask(task3);
		
		//test case for story 4
		assertEquals("Write business logic",story1.getTask(2).toString());
		assertEquals(10,story1.getTask(1).getHours());
		
	}
}
