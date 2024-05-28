package edu.deakin;

public class task {
	String tasknumber;
	String description;
	String tasktype;
	String status;
	String timeleft;
	
	//constructor for task object
    public task(String tasknumber, String description, String tasktype, String status, String timeleft) {
        this.tasknumber = tasknumber;
        this.description = description;
        this.tasktype = tasktype;
        this.status = status;
        this.timeleft = timeleft;
    }
    
    //returns task number
    public String getTaskNumber()
    {
    	return tasknumber;
    }
    
    //returns task description
    public String getDescription()
    {
    	return description;
    }
    
    //returns task type
    public String getTaskType()
    {
    	return tasktype;
    }
    
    //returns task status
    public String getStatus()
    {
    	return status;
    }
    
    //returns the time left
    public String getTimeLeft()
    {
    	return timeleft;
    }
}
