package edu.deakin;

import java.util.ArrayList;
import java.util.List;

public class taskInbox {
	
	public List<task> getTaskList()
	{	
		//create list of tasks
		List<task> taskList = new ArrayList<>();
		
		//create tasks
		task task1 = new task("P1", "intro to coding", "pass", "completed", "-");
		task task2 = new task("P2", "hello world", "pass", "completed", "-");
		task task3 = new task("C1", "if-else statement", "credit", "discuss", "2 weeks");
		task task4 = new task("D1", "algorithms", "distinction", "resubmit", "3 weeks");
		task task5 = new task("HD1", "complexity", "high distinction", "not started", "3 weeks");
		
		//add tasks to the list
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);
		
		//return inbox
		return taskList;
	}
		
}
