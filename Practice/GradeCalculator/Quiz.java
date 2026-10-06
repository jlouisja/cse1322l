package Practice.GradeCalculator;

import java.util.ArrayList;
public class Quiz {
    public int quizNumber; // default quiz number is 1
    static int quizCount = 1; // static variable to keep track of the number of quizzes created
    public double quizScore;

    public Quiz() {}
    public Quiz(int quizNumber, double quizScore) {
        this.quizNumber = quizNumber;
        this.quizScore = quizScore;
    }

    public double calculateQuizGrade(ArrayList<Quiz> quizList) {
        double totalScore = 0;
        for (Quiz quiz : quizList) {
            totalScore += quiz.quizScore;
        }
        totalScore = totalScore / quizList.size(); // calculate average score
        return totalScore;
    }

    // override toString method to display quiz information
    public String toString(ArrayList<Quiz> quizList) {
        for (Quiz quiz : quizList) {
            System.out.println("Quiz " + quiz.quizNumber + ": Score: " + quiz.quizScore);
        }
        return "";
        
    }   
    
}
