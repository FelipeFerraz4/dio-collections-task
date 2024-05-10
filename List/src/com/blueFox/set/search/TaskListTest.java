package com.blueFox.set.search;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class TaskListTest {
    public static void main(String[] args) {
        try {
            TaskList taskList = new TaskList();

            taskList.addTask(1, "buy bread");
            taskList.addTask(2, "buy cheese");
            taskList.addTask(3, "buy ham");
            taskList.addTask(4, "buy milk");

            System.out.println(taskList.getTaskTotal());
            taskList.removeTask("buy milk");
            System.out.println(taskList.getTasks());

            taskList.markTaskAsCompleted("buy bread");

            System.out.println(taskList.getCompletedTask());
            System.out.println(taskList.getPendingTasks());

            taskList.clearTaskList();

            System.out.println(taskList.getTaskTotal());

        } catch (EmptySetException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ElementNotFindException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
