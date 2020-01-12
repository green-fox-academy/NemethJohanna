package WeeklyFeedbackEvaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyFeedback {

    public static void main(String[] args) {
        String paths = "Ratings";
        Path path = Paths.get(paths);
        matReviewAvg(path);
    }

    public static void matReviewAvg(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println("Unable to read file: Ratings.txt");
        }

        String[][] matrix = new String[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).split(" ");
        }

        float averageMatReview = 0f;
        float averagePreSkills = 0f;
        float averageHelpfulness = 0f;
        float averageExplanations = 0f;

        for (int i = 0; i < matrix.length; i++) {
            averageMatReview += (Float.parseFloat(matrix[i][0])) / matrix[i].length;
            averagePreSkills += ((Float.parseFloat(matrix[i][1])) / matrix[i].length);
            averageHelpfulness += ((Float.parseFloat(matrix[i][2])) / matrix[i].length);
            averageExplanations += ((Float.parseFloat(matrix[i][3])) / matrix[i].length);

        }

        HashMap<String, Float> ratings = new HashMap<>();
        ratings.put("matReview", averageMatReview);
        ratings.put("presSkills", averagePreSkills);
        ratings.put("helpfulness", averageHelpfulness);
        ratings.put("explanations", averageExplanations);

        for (Map.Entry<String, Float> entry : ratings.entrySet()) {
            System.out.printf("%s: %f\n", entry.getKey(), entry.getValue());
        }
    }

}
