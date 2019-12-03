package I01_GreenFoxOrganization;

import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;


    /*addStudent(Student): adds the given Student to students list
info(): prints out "The name cohort has students.size() students and mentors.size() mentors."*/

    public void addStudent (Student member){
        students.add(member);
    }
    public void addMentor (Mentor member){
        mentors.add(member);
    }
    public void info(){
        System.out.printf("The %s cohort has %d students and %d mentors", name, students.size(), mentors.size());
    }


}
