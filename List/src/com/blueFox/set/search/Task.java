package com.blueFox.set.search;

public class Task {
    private int taskId;
    private String taskDescription;
    private boolean taskStatus;
    
    public Task(int taskId, String taskDescription, boolean taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    @Override
    public String toString() {
        return "[taskId: " + taskId + ", taskDescription: " + taskDescription + ", taskStatus: " + taskStatus + "]";
    }
}
