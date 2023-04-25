package org.example.gradecalculator;

import java.util.List;

public class Courses { // 일급 컬렉션
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double sumMultiPliedCreditAndGrade() {
        return this.courses
                .stream()
                .mapToDouble(Course::multiplyCreditAndGrade)
                .sum();

//        double sumOfMultipliedCreditAndGrade = 0;
//
//        for (Course course : courses) {
////            sumOfMultipliedCreditAndGrade += course.getCredit() * course.getGradeToNumber();
//            sumOfMultipliedCreditAndGrade += course.multiplyCreditAndGrade();
//        }
//
//        return sumOfMultipliedCreditAndGrade;
    }

    public int sumCredit() {
        return this.courses
                .stream()
                .mapToInt(Course::getCredit)
                .sum();

//        for (Course course : courses) {
//            totalCredit += course.getCredit();
//        }
    }
}
