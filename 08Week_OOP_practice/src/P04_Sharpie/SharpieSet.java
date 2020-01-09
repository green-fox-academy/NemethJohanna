package P04_Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpies = new ArrayList<Sharpie>();

    public void add (Sharpie sharpie){
        sharpies.add(sharpie);
    }

    public int countUsable() {
        int usable = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                usable += i;
            }
        }

        return usable;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount <= 0) {
                sharpies.remove(i);
            }
        }
    }
}