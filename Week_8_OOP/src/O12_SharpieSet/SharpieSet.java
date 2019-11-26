package O12_SharpieSet;

import O04_Sharpie.Sharpie;
import java.util.ArrayList;
import java.util.List;

/*  Reuse your Sharpie class
    Create SharpieSet class
        - it contains a list of Sharpie
        - countUsable() -> sharpie is usable if it has ink in it
        - removeTrash() -> removes all unusable sharpies
*/

public class SharpieSet {

    List<Sharpie> sharpieSet = new ArrayList<>();

    public SharpieSet( List<Sharpie> sharpieSet){
        this.sharpieSet = sharpieSet;
    }

    public SharpieSet() {}

    public int countUsable (){
        int count = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if ( sharpieSet.get(i).inkAmount > 0 ){
                count++;
            }
        } return count;

    }

    public void removeTrash (){
        for (int i = 0; i < sharpieSet.size(); i++) {
            if ( sharpieSet.get(i).inkAmount == 0){
                sharpieSet.clear();
            }
        }
    }

}


