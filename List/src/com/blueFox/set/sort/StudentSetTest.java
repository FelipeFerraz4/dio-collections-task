package com.blueFox.set.sort;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class StudentSetTest {
    public static void main(String[] args) {
        try {
            StudentSet studentSet = new StudentSet();

            studentSet.addStudent(1, "Clara", 8.2);
            studentSet.addStudent(3, "Merry", 8.3);
            studentSet.addStudent(2, "Joice", 9.1);

            System.out.println(studentSet.getStudents());
            System.out.println(studentSet.getStudentsByName());
            System.out.println(studentSet.getStudentsByAverage());

            studentSet.removeStudent(2);

            System.out.println(studentSet.getStudents());

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
