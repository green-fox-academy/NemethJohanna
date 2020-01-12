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
        matReviewAvg(paths);
    }


    public static void matReviewAvg(String paths) {
        Path path = Paths.get(paths);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println("Unable to read file: Ratings.txt");
            e.getStackTrace();
        }

        String[][] matrix = new String[lines.size()][lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).split(" ");
        }

        float averageMatReview = 0f;
        float averagePreSkills = 0f;
        float averageHelpfulness = 0f;
        float averageExplanations = 0f;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                averageMatReview += Float.parseFloat(matrix[i][0]) / matrix[i].length;
                averagePreSkills += Float.parseFloat(matrix[i][1]) / matrix[i].length;
                averageHelpfulness += Float.parseFloat(matrix[i][2]) / matrix[i].length;
                averageExplanations += Float.parseFloat(matrix[i][3]) / matrix[i].length;
            }
        }

        HashMap<String, Float> ratings = new HashMap<>();
        ratings.put("matReview", (float) averageMatReview);
        ratings.put("presSkills", (float) averagePreSkills);
        ratings.put("helpfulness", (float) averageHelpfulness);
        ratings.put("explanations", (float) averageExplanations);

        for (Map.Entry<String, Float> entry : ratings.entrySet()) {
                System.out.printf("%s: %f\n", entry.getKey(), entry.getValue());
        }
    }

}
