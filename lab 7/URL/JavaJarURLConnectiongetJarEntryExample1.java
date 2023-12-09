import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.Attributes;
import java.util.jar.JarFile;

public class JavaJarURLConnectiongetJarEntryExample1 {
    private final static String JAR_URL = "jar:file:D:/Downloads/mysql-connector-j-8.1.0/mysql-connector-j-8.1.0.jar!/";

    public static void main(String[] args) throws Exception {
        System.out.println("Jar Name: mysql-connector-j-8.1.0.jar");
        try {
            URL fileSysUrl = new URL(JAR_URL);
            JarURLConnection jarURLConn = (JarURLConnection) fileSysUrl.openConnection();

            // Check if the JAR entry is null
            if (jarURLConn.getJarEntry() == null) {
                System.out.println("No JAR entry found.");
            } else {
                Attributes attr = jarURLConn.getAttributes();
                JarFile jarFile = jarURLConn.getJarFile();
                System.out.println("Jar Entry: " + jarURLConn.getJarEntry());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
