import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class F07_ReversedOrder {
    // Create a method that decrypts reversed-order.txt

    public static void main(String[] args) {
        Path filePath = Paths.get("reversed-order.txt");
        reverseOrder(filePath);
    }

    private static void reverseOrder(Path filePath) {
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("Unable to read file.");
        }


    }

//    public static void main(String[] args) throws IOException {
////        Path path = Paths.get("reversed-order.txt");
////        List<String> order = new ArrayList();
////        try {
////            order = Files.readAllLines(path);
////            reverseOrder(order);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    public static void reverseOrder (List<String> orderList) {
////        for (int i = orderList.size() - 1; i >= 0; i--) {
////            System.out.println(orderList.get(i));
////        }
////        System.out.println();
////    }
}
