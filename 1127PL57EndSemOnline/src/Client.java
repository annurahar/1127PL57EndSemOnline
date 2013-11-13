import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Client {
	final static int DAYS=5;
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
		Task task4 = new Task("Write test cases",13);
		
		//add task for story 1
		story1.addTask(task1);
		story1.addTask(task2);
		story1.addTask(task3);
		story1.addTask(task4);
		
		//add task for story 2
		story2.addTask(task1);
		story2.addTask(task2);
		story2.addTask(task3);
		story2.addTask(task4);
		
		//test case for story 4
		assertEquals("Write business logic",story1.getTask(2).toString());
		assertEquals(15,story1.getTask(1).getHours());
		
		//define sprint 1 and assign stories to it
		Sprint sprint1 = new Sprint(DAYS);
		sprint1.assignStory(story1);
		sprint1.assignStory(story2);
		
		//test case for story 5
		assertEquals("As a customer I want to book tickets and make payments",sprint1.getStory(0).toString());
		assertEquals(7,sprint1.getStory(1).getPriorityNumber());
		
		//allocating task to team members;
		member1.allocateTask(task1);
		member2.allocateTask(task2);
		member3.allocateTask(task3);
		member4.allocateTask(task4);
		
		//test case for story 6
		assertEquals("Design database",member1.getTask().toString());
		
		//adding to do task to scrum board
		ScrumBoard scrumBoard = new ScrumBoard();
		scrumBoard.addToDoTask(task1);
		scrumBoard.addToDoTask(task2);
		scrumBoard.addToDoTask(task3);
		scrumBoard.addToDoTask(task4);
		
		//updating scrum board : moving task1 to "doing" list on day1 of sprint1  
		scrumBoard.removetoDoTask(task1);
		scrumBoard.addDoing(task1);
		
		
		//updating scrum board : moving task1 to "done" list at the end of day 2 
		scrumBoard.removeDoing(task1);
		scrumBoard.addDone(task1);
		
		//test case for story 7
		assertEquals("Design database",scrumBoard.getDone(0).toString());
		
	}	
}
