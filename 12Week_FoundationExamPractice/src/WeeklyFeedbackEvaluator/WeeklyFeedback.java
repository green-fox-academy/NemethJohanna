//package WeeklyFeedbackEvaluator;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class WeeklyFeedback {
//
//    private static Path paths;
//
//    public WeeklyFeedback(Paths paths) {
//        this.paths = Paths.get("C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\12Week_FoundationExamPractice\\src\\Ratings");
//    }
//
//    public static void main(String[] args) {
//       fileReading(paths);
//       matReviewAvg();
//    }
//
//    private static void fileReading(Path path) {
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(path);
//        } catch (IOException e) {
//            System.out.println("Unable to read file: my-file.txt");
//        }
//    }
//
//    public static double matReviewAvg (){
//        fileReading(paths);
//        List<Integer> line = new ArrayList<>();
//        int average = 0;
//        int avg = 0;
//        for (int i = 0; i < line.size(); i++) {
//            for (int j = 0; j < line.size(); j++) {
//                if (i == 0){
//                    average += (i / line.size());
//                }
//            }
//        }
//
//        return average;
//    }
//
//
//}
