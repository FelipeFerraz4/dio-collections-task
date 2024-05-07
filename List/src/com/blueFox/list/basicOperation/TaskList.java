package com.blueFox.list.basicOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.blueFox.list.basicOperation.exception.EmptyTaskListException;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        Random random = new Random();
        int id = Math.abs(random.nextInt());
        taskList.add(new Task(id, description));
    }
    
    public void removeTask(String description) throws EmptyTaskListException{
        List<Task> taskToRemove = new ArrayList<>();
        if(!taskList.isEmpty()){
            for (Task task : taskList) {
                if(task.getDescription().equalsIgnoreCase(description)){
                    taskToRemove.add(task);
                }
            }
            taskList.removeAll(taskToRemove);
        } else {
            throw new EmptyTaskListException("Empty task list");
        }
    }

    public int getTotalTask() {
        return taskList.size();
    }

    public List<Task> getDescriptionTask() throws EmptyTaskListException {
        List<Task> tasks = null;
        if(!taskList.isEmpty()) {
            tasks = taskList;
        } else {
            throw new EmptyTaskListException("Empty task list");
        }
        return tasks;
    }
}
