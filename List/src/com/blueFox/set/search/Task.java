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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((taskDescription == null) ? 0 : taskDescription.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (taskDescription == null) {
            if (other.taskDescription != null)
                return false;
        } else if (!taskDescription.equals(other.taskDescription))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[taskId: " + taskId + ", taskDescription: " + taskDescription + ", taskStatus: " + taskStatus + "]";
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }
}
