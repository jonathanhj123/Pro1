package Model;

import java.util.Arrays;

public class Student {

    private String name = "Jens";
    private Boolean active = true;

    private int grades[];

    public Student(String name, Boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
    }


    public Boolean getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double calcAvg(int[] grades) {
        int avg = 0;
        for ( int i = 0; i < grades.length; i ++) {
            avg += grades[i];
        }
        avg /= grades.length;
        return avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
