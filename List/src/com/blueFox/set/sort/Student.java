package com.blueFox.set.sort;

public class Student {
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
    public String toString() {
        return "[studentId: " + studentId + ", studentName: " + studentName + ", studentAverage: " + studentAverage
                + "]";
    }
}
