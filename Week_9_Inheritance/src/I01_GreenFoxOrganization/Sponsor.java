package I01_GreenFoxOrganization;

public class Sponsor extends Person{

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        super(name, age, gender);
        this.company = "Google";
        this.hiredStudents = 0;
    }

    //introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
    public void introduce(){
        super.introduce();
        System.out.printf(" who represents %s and hired %d students so far\n", company, hiredStudents);
    }
    public void hire(){
        hiredStudents++;
    }
    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.\n");
    }

}
