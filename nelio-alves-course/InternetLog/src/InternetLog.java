import model.entities.Log;
import model.entities.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.TreeSet;

public class InternetLog {
  public static void main(String[] args) {
    URL url = InternetLog.class.getResource("in.txt");
    Set<Log> logs = new TreeSet<>();


    try(BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
      String line = br.readLine();
      String log;

      while (line != null) {
        log = line;
        String[] logFields = line.split(" ");

        String userName = logFields[0];
        String logInstang = logFields[1];

        logs.add(new Log(new User(userName), logInstang));

        line = br.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.print("Total users: " + logs.size());
  }
}
