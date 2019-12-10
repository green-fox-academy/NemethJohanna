import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Domino domino1 = new Domino(1, 4);
        Domino domino2 = new Domino(2, 3);
        Domino domino3 = new Domino(5, 3);

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(domino1);
        dominoes.add(domino2);
        dominoes.add(domino3);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        Todo todo1 = new Todo("Buy milk", "medium", true);
        Todo todo2 = new Todo("Buy clothes", "low", false);
        Todo todo3 = new Todo("Pay bills", "high", true);

        List<Todo> todos = new ArrayList<>();
        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);

        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
