import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {

        //We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.

        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "406-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensua E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println(telephoneBook.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String key : telephoneBook.keySet()) {
            if (telephoneBook.get(key) == "307-687-2982") {
                System.out.println(key);
            }
        }

        //Do we know Chris E. Myers' phone number?
        System.out.println(telephoneBook.containsKey("Chris E. Myers"));
    }
}
