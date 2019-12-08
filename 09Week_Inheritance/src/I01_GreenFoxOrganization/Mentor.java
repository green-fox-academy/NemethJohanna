package I01_GreenFoxOrganization;

public class Mentor extends Person{

    private String level;

    public Mentor() {
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.\n");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.printf("and %s mentor.\n", level);
    }
}
