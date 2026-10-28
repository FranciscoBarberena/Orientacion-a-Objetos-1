package ar.edu.unlp.info.oo1.jobScheduler;

public class JobSchedulerMostEffort extends JobScheduler{
	


	protected JobDescription selectJob() {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
	}
	
}
