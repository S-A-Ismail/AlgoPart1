import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double championResult = 0;
        String championWord = "";
        int currentResult = 0;
        String currentWord = ".";
        int i=1;
        while (true) {
            currentWord = StdIn.readString();
            if (!StdIn.isEmpty()) {
                boolean result = StdRandom.bernoulli((double) 1/i);
                if (result == true) {
                    currentResult += 1;
                }
                if (currentResult > championResult) {
                    championResult = currentResult;
                    championWord = currentWord;
                }
                i++;
            }
            else {
                break;
            }
        }
        StdOut.println(championWord);
    }
}