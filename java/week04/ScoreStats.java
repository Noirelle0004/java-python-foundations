public class ScoreStats {

    public static void main(String[] args) {

        int[] scores = {88, 59, 76, 92, 45, 100, 67};

        int total = findTotal(scores);
        double average = findAverage(scores);
        int max = findMax(scores);
        int min = findMin(scores);
        int passCount = countPass(scores);
        int failCount = countFail(scores);

        System.out.println("total = " + total);
        System.out.println("average = " + average);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("pass count = " + passCount);
        System.out.println("fail count = " + failCount);
    }

    public static int findTotal(int[] scores) {
        int total = 0;

        for (int score : scores) {
            total = total + score;
        }

        return total;
    }

    public static double findAverage(int[] scores) {
        int total = findTotal(scores);
        return (double) total / scores.length;
    }

    public static int findMax(int[] scores) {
        int max = scores[0];

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

        return max;
    }

    public static int findMin(int[] scores) {
        int min = scores[0];

        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }

        return min;
    }

    public static int countPass(int[] scores) {
        int count = 0;

        for (int score : scores) {
            if (score >= 60) {
                count = count + 1;
            }
        }

        return count;
    }

    public static int countFail(int[] scores) {
        int count = 0;

        for (int score : scores) {
            if (score < 60) {
                count = count + 1;
            }
        }

        return count;
    }
}