package edu.deakin;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class testInbox {
	
	taskInbox inbox;
	List<task> tasklist;
	
	@Before
	public void setup()
	{
		inbox = new taskInbox();
		tasklist = inbox.getTaskList();
	}
	@Test
	public void testGetTaskInbox()
	{
        for(task currentTask : tasklist) {
            Assert.assertNotNull(currentTask.getTaskNumber());
            Assert.assertNotNull(currentTask.getDescription());
            Assert.assertNotNull(currentTask.getTaskType());
            Assert.assertNotNull(currentTask.getStatus());
            Assert.assertNotNull(currentTask.getTimeLeft());
        }
	}
	
	@Test
	public void testTask1()
	{
        task currentTask = tasklist.get(0);
        Assert.assertEquals(currentTask.getTaskNumber(), "P1");
        Assert.assertEquals(currentTask.getDescription(), "intro to coding");
        Assert.assertEquals(currentTask.getTaskType(), "pass");
        Assert.assertEquals(currentTask.getStatus(), "completed");
        Assert.assertEquals(currentTask.getTimeLeft(), "-");
	        
	}
	
	@Test
	public void testTask3()
	{
		
        task currentTask = tasklist.get(2);
        Assert.assertEquals(currentTask.getTaskNumber(), "C1");
        Assert.assertEquals(currentTask.getDescription(), "if-else statement");
        Assert.assertEquals(currentTask.getTaskType(), "credit");
        Assert.assertEquals(currentTask.getStatus(), "discuss");
        Assert.assertEquals(currentTask.getTimeLeft(), "2 weeks");
	        
	}
	
	@Test
	public void testTask4()
	{
		
        task currentTask = tasklist.get(3);
        Assert.assertEquals(currentTask.getTaskNumber(), "D1");
        Assert.assertEquals(currentTask.getDescription(), "algorithms");
        Assert.assertEquals(currentTask.getTaskType(), "distinction");
        Assert.assertEquals(currentTask.getStatus(), "resubmit");
        Assert.assertEquals(currentTask.getTimeLeft(), "3 weeks");
	        
	}
	
	@Test
	public void testTask2()
	{
		 
        task currentTask = tasklist.get(4);
        Assert.assertEquals(currentTask.getTaskNumber(), "HD1");
        Assert.assertEquals(currentTask.getDescription(), "complexity");
        Assert.assertEquals(currentTask.getTaskType(), "high distinction");
        Assert.assertEquals(currentTask.getStatus(), "not started");
        Assert.assertEquals(currentTask.getTimeLeft(), "3 weeks");
	        
	}
}
