
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.pointsList = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.pointsList.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        double ave = 0.0;
        int sumOfGrades = 0;
        if (grades.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < grades.size(); i++) {
                sumOfGrades += grades.get(i);
                ave = (double) sumOfGrades / (i + 1);
            }

            return ave;
        }
    }

    public double averageOfPoints() {
        double ave = 0.0;
        int sumOfPoints = 0;
        if (pointsList.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < grades.size(); i++) {
                sumOfPoints += pointsList.get(i);
                ave = (double) sumOfPoints / (i + 1);
            }

            return ave;
        }
    }
}
