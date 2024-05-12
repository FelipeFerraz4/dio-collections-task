package com.blueFox.set.sort;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int studentId;
    private String studentName;
    private double studentAverage;
    
    public Student(int studentId, String studentName, double studentAverage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAverage = studentAverage;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentAverage() {
        return studentAverage;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
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
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[studentId: " + studentId + ", studentName: " + studentName + ", studentAverage: " + studentAverage
                + "]";
    }

    @Override
    public int compareTo(Student student) {
        return studentName.compareTo(student.getStudentName());
    }
}

class ComparatorByAverege implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // TODO Auto-generated method stub
        return Double.compare(student1.getStudentAverage(), student2.getStudentAverage());
    }

}