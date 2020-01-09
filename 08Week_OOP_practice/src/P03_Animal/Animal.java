package P03_Animal;

public class Animal {

    int hungerValue;
    int thirstValue;

    public Animal() {
        this.hungerValue = 50;
        this.thirstValue = 50;
    }

    public void eat(){
        this.hungerValue --;
    }

    public void drink(){
        this.thirstValue --;
    }

    public void play(){
        this.thirstValue++;
        this.hungerValue++;
    }
}
