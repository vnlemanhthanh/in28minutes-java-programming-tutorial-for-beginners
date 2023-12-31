/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.arrays;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Thanh", 97, 98, 100);
        Student student2 = new Student("LE", 12, 232);
        Student student3 = new Student("Cun");

        int number = student.getNumberOfMarks();
        System.out.println("number of marks: "+ number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);

        System.out.println("maximum of marks: " + student.getMaximumMark());
        System.out.println("minimum of marks: " + student.getMinimumMark());

        System.out.println("average of marks: " + student.getAverageMark());

        System.out.println(student);

        student.addNewMark(35);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);

    }
}
