package com.blueFox.list.basicOperation;

import com.blueFox.list.basicOperation.exception.EmptyTaskListException;

public class Test {
    public static void main(String[] args) {
        try {
            TaskList taskList = new TaskList();

            System.out.println(taskList.getTotalTask());
            // taskList.removeTask("buy milk");
            // System.out.println(taskList.getDescriptionTask());

            taskList.addTask("buy bread");
            taskList.addTask("buy cheese");
            taskList.addTask("buy ham");
            taskList.addTask("buy milk");

            System.out.println(taskList.getTotalTask());

            taskList.removeTask("buy milk");
            
            System.out.println(taskList.getDescriptionTask());

        } catch (EmptyTaskListException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
