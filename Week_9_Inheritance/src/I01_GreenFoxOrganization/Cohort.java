package I01_GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addStudent (Student studentMember){
        students.add(studentMember);
    }

    public void addMentor (Mentor mentorMember){
        mentors.add(mentorMember);
    }

    public void info(){
        System.out.printf("The %s cohort has %d students and %d mentors.\n", name, students.size(), mentors.size());
    }

}
