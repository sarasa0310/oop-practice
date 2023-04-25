package org.example.gradecalculator;

public class Course {
    private final String subject;
    private final int credit;
    private final String grade; // A+, A, B+, B ...

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        switch (this.grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            default:
                return 0;
        }
    }

    public double multiplyCreditAndGrade() {
        return credit * getGradeToNumber();
    }
}
