import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ElectionManager {
  public static void main(String[] args) {
    URL url = ElectionManager.class.getResource("in.csv");

    Map<String, Integer> candidates = new HashMap<>();

    try(BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
      String line = br.readLine();

      while (line != null) {
        String[] candidateVotesArray = line.split(",");

        String candidateName = candidateVotesArray[0];
        int candidateVotes = Integer.parseInt(candidateVotesArray[1]);

        if (candidates.get(candidateName) == null) {
          candidates.put(candidateName, candidateVotes);
        } else {
          int votesSum = candidates.get(candidateName) + candidateVotes;
          candidates.put(candidateName, votesSum);
        }

        line = br.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println("Error: File not found");
    }

    for(String key : candidates.keySet()) {
      System.out.println(key + ": " + candidates.get(key));
    }
  }
}
