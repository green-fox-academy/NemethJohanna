package O13_Farm;

import O03_Animal.Animal;

import java.util.HashMap;

public class Farm {

    private static Animal add;

    public Farm(){}

    // breed() -> creates a new animal if there's place for it
    public void breed () {
        int slot = 10;
        if ( slot > 0 ){
            Farm.add = new Animal();
        } else {
            System.out.println("There is NO FREE place for a new animal!");
        }
    }

    // slaughter() -> removes the least hungry animal
    public void slaughter(){
        HashMap<String, Integer> farm = new HashMap<String, Integer>();

        for (int i = 0; i < farm.size(); i++) {
            farm.get(i);
            //remove(i)
        }

        //végig megyek for ciklussal a farm állatain.
        //kikeresem a legalacsonyabb számú hunger értéket
        //eltávolítom azt az állatot.
        //
        //hungervalue????
    }

}
