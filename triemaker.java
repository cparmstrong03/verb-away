import java.util.Scanner;
import java.io.*;
import tripackage.Trie;

public class ReadWords {
  public static void main(String[] args) throws IOException {

    File file = new File("words.txt");
    Scanner input = new Scanner(file);

    Trie tri = new Trie();

    while (input.hasNext()) {
      String word = input.next();
      tri.insert(word);
    }

  }
}