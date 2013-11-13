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
		assertEquals("TicketBooking",project.getProjectName());
		
		//create a team
		Team team=new Team("BookingTeam");
		project.assignTeam(team);
		
		//Story 2 test case
		assertEquals("BookingTeam",project.getTeam().toString());
		
	}
}
