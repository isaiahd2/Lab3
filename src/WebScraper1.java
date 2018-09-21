import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper1 {
    public static void main(String[] unused) {

    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static int wordcount(String website){
        Scanner a = new Scanner(website);
        int words = 0;
        while (a.hasNext()){
            a.next();
            words++;
        }
        return words;
    }

public static void main(String[] args) {
    System.out.println("Run");
    String text1 = urlToString()
}
