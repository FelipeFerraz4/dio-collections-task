package com.blueFox.set.search;

import java.util.HashSet;
import java.util.Set;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class TaskList {
    private Set<Task> taskList;

    public TaskList() {
        this.taskList = new HashSet<>();
    }

    public void addTask(int taskId, String taskDescription) {
        taskList.add(new Task(taskId, taskDescription, false));
    }

    public void removeTask(String taskDescription) throws EmptySetException, ElementNotFindException {
        Task taskToRemove = null;
        if (!taskList.isEmpty()) {
            for (Task task : taskList) {
                if(task.getTaskDescription().equalsIgnoreCase(taskDescription)) {
                    taskToRemove = task;
                }
            }
            if (taskToRemove == null) {
                throw new ElementNotFindException("Task Not Find");
            }
            taskList.remove(taskToRemove);
        } else {
            throw new EmptySetException("Empty task list");
        }
    }

    public Set<Task> getTasks() throws EmptySetException {
        if (taskList.isEmpty()){
            throw new EmptySetException("Empty task list");
        }
        return taskList;
    }

    public int getTaskTotal() {
        return taskList.size();
    }

    public Set<Task> getCompletedTask() throws EmptySetException {
        if(taskList.isEmpty()) {
            throw new EmptySetException("Empty task list");
        }

        Set<Task> completedTasks = new HashSet<>();
        for (Task task : taskList) {
            if (task.isTaskStatus()) {
                completedTasks.add(task);
            }
        }

        if (completedTasks.isEmpty()) {
            throw new EmptySetException("Not Find completed task");
        }
        
        return completedTasks;
    }

    public Set<Task> getPendingTasks() throws EmptySetException {
        if(taskList.isEmpty()) {
            throw new EmptySetException("Empty task list");
        }

        Set<Task> pendingTasks = new HashSet<>();
        for (Task task : taskList) {
            if (!task.isTaskStatus()) {
                pendingTasks.add(task);
            }
        }

        if (pendingTasks.isEmpty()) {
            throw new EmptySetException("Not Find completed task");
        }
        
        return pendingTasks;
    }

    public void markTaskAsCompleted(String description) throws EmptySetException, ElementNotFindException {
        if(taskList.isEmpty()) {
            throw new EmptySetException("Empty task list");
        }

        Task markTask = null;
        for (Task task : taskList) {
            if (task.getTaskDescription().equalsIgnoreCase(description)) {
                markTask = task;
            }
        }

        if (markTask == null) {
            throw new ElementNotFindException("Task Not Find");
        }
        markTask.setTaskStatus(true);

    }

    //poderia usar apenas um método para mark
    public void markTaskAsPending(String description) throws EmptySetException, ElementNotFindException {
        if(taskList.isEmpty()) {
            throw new EmptySetException("Empty task list");
        }

        Task markTask = null;
        for (Task task : taskList) {
            if (task.getTaskDescription().equalsIgnoreCase(description)) {
                markTask = task;
            }
        }

        if (markTask == null) {
            throw new ElementNotFindException("Task Not Find");
        }
        markTask.setTaskStatus(false);
    }

    public void clearTaskList() throws EmptySetException {
        if(taskList.isEmpty()) {
            throw new EmptySetException("Empty task list");
        }
        taskList.clear();
    }
}
