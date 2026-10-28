package ar.edu.unlp.info.oo1.jobScheduler;

public class JobSchedulerHighestPriority extends JobScheduler{
	
	


	protected JobDescription selectJob() {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
            
	}
	
}
