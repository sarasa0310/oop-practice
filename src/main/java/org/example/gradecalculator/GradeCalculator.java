package org.example.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /*
    • 요구사항
        • 평균학점 = (학점 수 * 교과목 평점)의 합계 / 총 학점 수
        • MVC 패턴(Model-View-Controller) 기반으로 구현한다.
        • 일급 컬렉션 사용
    */

    public double calculateAverageGrade() {
        double totalMultipliedCreditAndGrade = courses.sumMultiPliedCreditAndGrade();

        int totalCredit = courses.sumCredit();

        return (double) Math.round(totalMultipliedCreditAndGrade / totalCredit * 10) / 10;
    }
}
