public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        // Runs scored by each batsman
        int[] runs = {45, 102, 78, 10, 150, 34};

        int highest = runs[0];
        int lowest = runs[0];
        int sum = 0;

        System.out.println("=== Cricket Score Analyzer ===");

        // Loop through scores
        for (int score : runs) {
            // Highest
            if (score > highest) {
                highest = score;
            }
            // Lowest
            if (score < lowest) {
                lowest = score;
            }
            // Sum for average
            sum += score;

            // Century check
            if (score >= 100) {
                System.out.println("Century Scorer: " + score);
            }
        }

        double average = (double) sum / runs.length;

        System.out.println("\nHighest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
    }
}

