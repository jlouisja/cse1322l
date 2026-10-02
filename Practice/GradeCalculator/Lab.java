package Practice.GradeCalculator;
import java.util.ArrayList;

public class Lab {
    public int labNumber; // default lab number is 1
    static int labCount = 1; // static variable to keep track of the number of labs created
    public double labScore;
    public double labWeight = 10; // default weight for labs is 10%
    public ArrayList<Lab> labList = new ArrayList<>(); // list to store all labs

    public Lab() {}
    public Lab(int labNumber, double labScore) {
        this.labNumber = labNumber;
        this.labScore = labScore;
        this.labList.add(this);
    }

    public double calculateLabGrade(ArrayList<Lab> labList) {
        double totalScore = 0;
        for (Lab lab : labList) {
            totalScore += lab.labScore;
        }
        totalScore = totalScore / labList.size(); // calculate average score
        return totalScore;
    }

    // override toString method to display lab information
    public String toString(ArrayList<Lab> labList) {
        for (Lab lab : labList) {
            System.out.println("Lab " + lab.labNumber + ": Score: " + lab.labScore);
        }
        return "";
    }
}
