
public class Report {

	private boolean isGenerated;
	
	public void generateReportForSprint(Sprint sprint) {
		// TODO Auto-generated method stub
		//int totalStories = sprint.getStories().size();
		Story story1 = sprint.getStory(0);
	
		
		Task task1=story1.getTask(0);
		Task task2=story1.getTask(1);
		Task task3=story1.getTask(2);
		Task task4=story1.getTask(3);
		
		System.out.println("----------------- Report ---------------------");
		System.out.println("\tTask\tIdeal Time\tActual Time");
		System.out.println("\tTask1\t"+task1.getHours()+"\t\t"+task1.getMember().getHoursTaken());
		System.out.println("\tTask2\t"+task2.getHours()+"\t\t"+task2.getMember().getHoursTaken());
		System.out.println("\tTask3\t"+task3.getHours()+"\t\t"+task3.getMember().getHoursTaken());
		System.out.println("\tTask4\t"+task4.getHours()+"\t\t"+task4.getMember().getHoursTaken());
		
		this.isGenerated=true;
	}

	public boolean isGenerated() {
		return isGenerated;
	}

	

}
