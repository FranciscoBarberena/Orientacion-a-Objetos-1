package ar.edu.unlp.info.oo1.jobScheduler;

public class JobSchedulerLIFO extends JobScheduler{
	
	



	protected JobDescription selectJob() {
		return jobs.get(jobs.size()-1);
        
	}
	
}
