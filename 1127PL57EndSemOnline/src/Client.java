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
		Project project = new Project("TicketBooking");	
		assertEquals("TicketBooking",project.getProjectName());
	}
}
