package Practice.GradeCalculator;
import java.util.ArrayList;

public class Assignment {
    public int assignmentNumber; // default assignment number is 1
    static int assignmentCount = 1; // static variable to keep track of the number of assignments created
    public double assignmentScore;

    public Assignment() {}
    public Assignment(int assignmentNumber, double assignmentScore) {
        this.assignmentNumber = assignmentNumber;
        this.assignmentScore = assignmentScore;
}
public double calculateAssignmentGrade(ArrayList<Assignment> assignmentList) {
        double totalScore = 0;
        for (Assignment assignment : assignmentList) {
            totalScore += assignment.assignmentScore;
        }
        totalScore = totalScore / assignmentList.size(); // calculate average score
        return totalScore;
    }

    // override toString method to display assignment information
    public String toString(ArrayList<Assignment> assignmentList) {
        for (Assignment assignment : assignmentList) {
            System.out.println("Assignment " + assignment.assignmentNumber + ": Score: " + assignment.assignmentScore);
        }
        return "";
    }
}