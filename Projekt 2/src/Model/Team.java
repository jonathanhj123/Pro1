package Model;

import java.util.ArrayList;

public class Team {

    private String name;
    private String room;

    private ArrayList<Student> students;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student)  {
            students.add(student);
    }


    public String[] activeStudents() {
        int count = 0;
        for (Student i : students) {
            if (i.getActive()) {
                count++;
            }
        }
        String[] activeStudents = new String[count];
        count = 0;

        for (Student i : students) {
            if (i.getActive()) {
                activeStudents[count] = i.getName();
                count++;
            }
        }
        return activeStudents;

    }

    public int gradeHigh(int[] grades) {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {

            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }


    public void removeStudent (String name) {
        int i = 0;
        while ( i < students.size()) {
            if (name.equalsIgnoreCase(students.get(i).getName())) {
                students.remove(i);
                i--;
            }
            i++;
        }

    }

    public double avgTeamGrade() {
        double totalSum = 0;
        int totalElements = 0;

        for (Student student : students) {
            int[] grades = student.getGrades();
            for (int grade : grades) {
                totalSum += grade;
                totalElements++;
            }
        }

        if (totalElements > 0) {
            return totalSum / totalElements;
        } else {
            return 0;
        }
    }

//    public Student[] highScoreStudents(double minAverage) {
//
//    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", room='" + room + '\'' +
                ", grades=" + students +
                '}';
    }
}
