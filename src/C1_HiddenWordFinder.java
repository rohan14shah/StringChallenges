/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        int n = sentence.indexOf("start");
        int m = sentence.indexOf("end");
        if (n != -1 && m != -1 && n < m) {
            String hiddenWord = sentence.substring(n + "start".length(), m);
            System.out.println("Hidden word: " + hiddenWord);
        }

    }

}
