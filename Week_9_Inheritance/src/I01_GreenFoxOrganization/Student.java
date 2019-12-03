package I01_GreenFoxOrganization;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer!\n");
    }

    public void introduce(){
        super.introduce();
        System.out.printf("from %s who skipped %d days from the course already.\n", previousOrganization, skippedDays);
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
}
