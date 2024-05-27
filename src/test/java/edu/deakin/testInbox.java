package edu.deakin;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class testInbox {
	
	@Test
	public void testGetTaskInbox()
	{
		 taskInbox inbox = new taskInbox();
	        List<task> tasklist = inbox.getTaskList();
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
		 taskInbox inbox = new taskInbox();
	        List<task> tasklist = inbox.getTaskList();
	        task currentTask = tasklist.get(0);
            Assert.assertEquals(currentTask.getTaskNumber(), "P1");
            Assert.assertEquals(currentTask.getDescription(), "intro to coding");
            Assert.assertEquals(currentTask.getTaskType(), "pass");
            Assert.assertEquals(currentTask.getStatus(), "completed");
            Assert.assertEquals(currentTask.getTimeLeft(), "-");
	        
	}
}
