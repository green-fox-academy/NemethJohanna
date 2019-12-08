package I01_GreenFoxOrganization;

public class Person implements java.lang.Cloneable {

    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void introduce(){
        System.out.printf("Hi, I'm %s, a %d year old %s \n", name, age, gender);
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!\n");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Hello, I am cloning!!");
        return super.clone();
    }

    public String getName() {
        return name;
    }
}
