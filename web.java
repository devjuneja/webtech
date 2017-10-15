import java.io.*;
import java.net.*;

public class web {
   public static void main(String[] args) throws Exception {
      System.setProperty("java.net.useSystemProxies","true");
     // System.setProperty("https.proxyHost","192.168.1.104");
     // System.setProperty("https.proxyPort","8080");
      URL url = new URL("http://www.google.com");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line;
      File file=new File("kartik.html");
      FileWriter na=new FileWriter(file);
      while ((line = reader.readLine()) != null)
      {
      System.out.println(line);
      na.write(line);
      }
    reader.close();
   }

}
