package ar.edu.unlp.info.oo1.jobScheduler;

public class JobSchedulerFIFO extends JobScheduler{
	

	protected JobDescription selectJob() {
		return jobs.get(0);
        
	}
	
}
