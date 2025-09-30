package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Team team1 = new Team("GangGang", "A24");
        Team team2 = new Team("GangGang2", "A24");


        Student Elev1 = new Student("Jens", true, new int[]{4});
        Student Elev2 = new Student("Ole", true, new int []{02, 4, 12, 7});
        Student Elev3 = new Student("Mckoy", true, new int []{4});
        Student Elev4 = new Student("Hans", true, new int[] {7});
        Student Elev5 = new Student("Phillip", true, new int[] {10});
        Student Elev6 = new Student("Anders", false, new int[] {12});


        team1.addStudent(Elev1);
        team1.addStudent(Elev2);
        team1.addStudent(Elev3);

        team2.addStudent(Elev4);
        team2.addStudent(Elev5);
        team2.addStudent(Elev6);


        System.out.println(team1.toString());
        System.out.println(team2.toString());

        team1.removeStudent("Jens");
        System.out.println(team1.toString());

        System.out.println(Arrays.toString(team2.activeStudents()));

        System.out.println(team1.gradeHigh(Elev2.getGrades()));

        System.out.println(Elev2.calcAvg(Elev2.getGrades()));

        System.out.println(team1.avgTeamGrade());
    }

}
