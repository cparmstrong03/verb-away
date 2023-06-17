import java.util.Scanner;
import java.io.*;
import tripackage.Trie;

public class triemaker {
  public static void main(String[] args) throws IOException {

    File file = new File("./words.txt");
    Scanner input = new Scanner(file);
    File outFile = new File("./tri.io");

    Trie tri = new Trie();

    while (input.hasNext()) {
      String word = input.next();
      System.out.print(word);
      tri.insert(word);
    }

  }
}