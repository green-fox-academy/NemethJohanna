package FishTank;

public class Main {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new ClownFish("Nemo"));
        aquarium.addFish(new Kong("Kongi"));
        aquarium.addFish(new Tang("Tangi"));

        for (int i = 0; i < 9; i++) {
            aquarium.feedAquarium();
        }

        aquarium.getStatus();
        System.out.println();

        aquarium.removeFish();
        aquarium.getStatus();
    }
}
