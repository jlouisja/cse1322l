package Practice.GradeCalculator;
import java.util.ArrayList;

public class Exam {
    public String examName;
    public double examScore;

    public Exam() {}
    public Exam(String examName, double examScore) {
        this.examName = examName;
        this.examScore = examScore;
    }
    public String getExamName() {
        return examName;
    }

    public double calculateExamGrade(ArrayList<Exam> examList) {
        double totalScore = 0;
        for (Exam exam : examList) {
            totalScore += exam.examScore;
        }
        totalScore = totalScore / examList.size(); // calculate average score
        return totalScore;
    }

    // override toString method to display exam information
    public String toString(ArrayList<Exam> examList) {
        for (Exam exam : examList) {
            System.out.println(exam.examName + " Exam Score: " + exam.examScore);
        }
        return "";
    }
}
