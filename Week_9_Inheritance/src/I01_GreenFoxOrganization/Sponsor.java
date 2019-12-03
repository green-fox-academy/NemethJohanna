package I01_GreenFoxOrganization;

public class Sponsor extends Person{

    private String company;
    private int hiredStudents;

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    public void introduce(){
        super.introduce();
        System.out.printf("who represents %s and hired %d students so far\n", company, hiredStudents);
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.\n");
    }

}
