package com.blueFox.set.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class StudentSet {
    private Set<Student> students;

    public StudentSet() {
        this.students = new HashSet<>();
    }

    public void addStudent(int studentId, String studentName, double studentAverage) {
        students.add(new Student(studentId, studentName, studentAverage));
    }

    public void removeStudent(int studentId) throws EmptySetException, ElementNotFindException {
        if (students.isEmpty()) {
            throw new EmptySetException("Empty student set");
        }
        
        Student studentsToRemove = null;
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                studentsToRemove = student;
                break;
            }
        }

        if (studentsToRemove == null) {
            throw new ElementNotFindException("Student not find");
        }

        students.remove(studentsToRemove);
    }

    public Set<Student> getStudents() throws EmptySetException {
        if (students.isEmpty()) {
            throw new EmptySetException("Empty student set");
        }

        return students;
    }

    public Set<Student> getStudentsByName() throws EmptySetException {
        if (students.isEmpty()) {
            throw new EmptySetException("Empty student set");
        }

        Set<Student> studentsByName = new TreeSet<>(students);
        return studentsByName;
    }
    
    public Set<Student> getStudentsByAverage() throws EmptySetException {
        if (students.isEmpty()) {
            throw new EmptySetException("Empty student set");
        }

        Set<Student> studentsByAverage = new TreeSet<>(new ComparatorByAverege());
        studentsByAverage.addAll(students);
        return studentsByAverage;
    }
}
