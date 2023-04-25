package org.example.gradecalculator;

/*
    • 요구사항
        • 평균학점 = (학점 수 * 교과목 평점)의 합계 / 총 학점 수
        • 일급 컬렉션 사용
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {

    @DisplayName("평균학점 계산")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("OOP", 3, "A+"),
                new Course("Data Structure", 3, "A"),
                new Course("Japanese 2", 2, "B")
        );

        GradeCalculator gradeCalculator = new GradeCalculator(courses);

        double averageGrade = gradeCalculator.calculateAverageGrade();

        assertThat(averageGrade).isEqualTo(3.9);
    }

}
