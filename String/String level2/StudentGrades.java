import java.util.Random;

public class StudentGrades {

    // Method to generate random 2-digit scores (10–99)
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];  // 3 subjects (PCM)

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // random between 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; 
        // [0] = total, [1] = average, [2] = percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grade
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scoreboard
    public static void displayScoreboard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            String grade = calculateGrade(results[i][2]);
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grade);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // change number of students here

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScoreboard(scores, results);
    }
}
