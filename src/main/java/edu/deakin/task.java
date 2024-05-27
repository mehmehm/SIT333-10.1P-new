package edu.deakin;

public class task {
	String tasknumber;
	String description;
	String tasktype;
	String status;
	String timeleft;
	
    public task(String tasknumber, String description, String tasktype, String status, String timeleft) {
        this.tasknumber = tasknumber;
        this.description = description;
        this.tasktype = tasktype;
        this.status = status;
        this.timeleft = timeleft;
    }
    
    public String getTaskNumber()
    {
    	return tasknumber;
    }
    
    public String getDescription()
    {
    	return description;
    }
    
    public String getTaskType()
    {
    	return tasktype;
    }
    
    public String getStatus()
    {
    	return status;
    }
    
    public String getTimeLeft()
    {
    	return timeleft;
    }
}
