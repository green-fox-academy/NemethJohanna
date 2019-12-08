package O10_TeachersStudents;

public class Student {

 /* Student
      - learn() -> prints the student is learning something new "PIPA"
      - question(teacher) -> calls the teachers answer method*/

    String SName;
    String learn;


    public Student (String SName){
        this.SName = SName;
    }

    public void learn(){
        System.out.println("The student is learning something new");
    }

    public void question(Teacher teacher) {
        System.out.println(this.SName + " asks " + " and ");
    }
}