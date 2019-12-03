package I01_GreenFoxOrganization;

public class Mentor extends Person{

    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = "intermediate";
    }

    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.\n");
    }

    public void introduce(){
        super.introduce();
        System.out.printf(" and %s mentor", level);
    }
}
