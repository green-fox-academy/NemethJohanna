package O10_TeachersStudents;

public class Teacher {

  /*  Teacher
      - teach(student) -> calls the students learn method
      - answer() -> prints the teacher is answering a question*/

    String TName;

    public Teacher (String TName){
        this.TName = TName;
    }

    public void teach (Student SName){
        System.out.println(this.TName + " is teaching tha student and he is " + SName.learn);
        //SName.learn();
    }

    public void answer (){
        System.out.println("the teacher is trying to answer the question");
    }
}