import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            // Print status code and message
            System.out.println("Status Code = " + huc.getResponseCode());
            System.out.println("Message = " + huc.getResponseMessage());

            // Print header fields
            for (int i = 1; ; i++) {
                String key = huc.getHeaderFieldKey(i);
                String value = huc.getHeaderField(i);

                if (key == null && value == null) {
                    // No more header fields
                    break;
                }

                System.out.println(key + " = " + value);
            }

            huc.disconnect();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
