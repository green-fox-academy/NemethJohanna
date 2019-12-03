package I01_GreenFoxOrganization;

public class Person {
    // 1. field
    private String name;
    private int age;
    private String gender;

    // 2. constructor
    public Person (String name, int age, String gender){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    // 3. public fuggvenyek
    public void introduce(){
        System.out.printf("Hi, I'm %s, a %d year old %s ", name, age, gender);
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    // 4. private fuggvenyek


}
