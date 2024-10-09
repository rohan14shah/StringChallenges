/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        int n = post.indexOf("#");
        while (n != -1) {
            int m = post.indexOf(" ", n);
            if (m == -1) {
                m = post.length();
            }
                System.out.println("Hashtag: " + post.substring(n, m));


            n = post.indexOf("#", m);


        }


    }

}
