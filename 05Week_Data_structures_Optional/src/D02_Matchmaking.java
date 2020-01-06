import java.util.*;

public class D02_Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        ArrayList<String> matchmaking = new ArrayList<>();          // létrehozok egy üres listát
        int number = 0;                                             // egy számlátót, ami nulla
        for (int i = 0; i < girls.size(); i++) {                    // végig megyek a lány listán
            matchmaking.add(i + number, girls.get(i));        // a lányokat hozzáadom az új listához az (i + number) indexű helyre
            matchmaking.add(i + number + 1, boys.get(i));     // a fiúkat hozzáadom mindig az egyel következő helyre
            number++;                                               // a számot növelem egyel, majd újbül hozzáadogatom a neveket
        }

        for (int i = 0; i < boys.size() - girls.size(); i++) {      // új ciklussal a végső, egyedül maradt nevet is hpzzáadom a listához
            matchmaking.add(matchmaking.size(), boys.get(i + girls.size()));
        }

        return matchmaking;
    }


}
