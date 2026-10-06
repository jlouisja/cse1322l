package Practice.GradeCalculator;

import java.util.ArrayList;
// i think i will need to create a class for each sections of grade calculator
// a class for labs
// a class for assignments
// a class for quizzes
// a class for exams
//  each class will have its own methods to calculate the grades based on the weights assigned to each section.
public class GradeCalculator {
    public static void main(String[] args) {
        // create an arraylist of labs
        ArrayList<Lab> labs = new ArrayList<>();
        // create an arraylist of assignments
        ArrayList<Assignment> assignments = new ArrayList<>();
        // create an arraylist of quizzes
        ArrayList<Quiz> quizzes = new ArrayList<>();
        // create an arraylist of exams
        ArrayList<Exam> exams = new ArrayList<>();
        
        // add some labs to the labs arraylist
        labs.add(new Lab(1, 100));
        labs.add(new Lab(2, 96));
        labs.add(new Lab(3, 100));
        labs.add(new Lab(4, 100));
        labs.add(new Lab(5, 100));
        // labs.add(new Lab(6, 100));
        // labs.add(new Lab(7, 100));
        // labs.add(new Lab(8, 100));
        // labs.add(new Lab(9, 100));
        // labs.add(new Lab(10, 100));
        // labs.add(new Lab(11, 100));
        Lab lab = new Lab();
        lab.toString(labs);
        double averageLabGrade = lab.calculateLabGrade(labs);
        System.out.println("Your average lab grade is: " + averageLabGrade + "%");

        // add some assignments to the assignments arraylist
        assignments.add(new Assignment(1, 100));
        assignments.add(new Assignment(2, 100));
        // assignments.add(new Assignment(3, 100));
        // assignments.add(new Assignment(4, 100));
        // assignments.add(new Assignment(5, 100));
        // assignments.add(new Assignment(6, 100));
        Assignment assignment = new Assignment();
        assignment.toString(assignments);
        double averageAssignmentGrade = assignment.calculateAssignmentGrade(assignments);
        System.out.println("Your average assignment grade is: " + averageAssignmentGrade + "%");

        // // add some quizzes to the quizzes arraylist
        quizzes.add(new Quiz(1, 0));
        // quizzes.add(new Quiz(2, 85));
        // quizzes.add(new Quiz(3, 75));
        Quiz quiz = new Quiz();
        quiz.toString(quizzes);
        double averageQuizGrade = quiz.calculateQuizGrade(quizzes);
        System.out.println("Your average quiz grade is: " + averageQuizGrade + "%");

        // // add some exams to the exams arraylist
        double midtermScore = 0;
        double finalScore = 0;
        exams.add(new Exam("Midterm", 0));
        exams.add(new Exam("Final", 0));
        for (Exam exam : exams) {
            if (exam.getExamName().equals("Midterm")) {
                midtermScore = exam.examScore;
            } else if (exam.getExamName().equals("Final")) {
                finalScore = exam.examScore;
            }
        }
        Exam exam = new Exam();
        exam.toString(exams);
        double averageExamGrade = exam.calculateExamGrade(exams);
        System.out.println("Your average for all exams is: " + averageExamGrade + "%");

        double finalGrade = (averageLabGrade * 0.1) + (averageAssignmentGrade * 0.35) + (averageQuizGrade * 0.05) + (midtermScore * 0.2) + (finalScore * 0.4);
        System.out.println("Your final grade is: " + finalGrade + "%");
    } 
} 