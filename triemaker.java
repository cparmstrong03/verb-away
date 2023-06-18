import java.util.Scanner;

import java.io.*;
import tripackage.Trie;
import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class triemaker {
  public static void main(String[] args) throws IOException {

    File file = new File("./words.txt");
    Scanner input = new Scanner(file);
    File outFile = new File("./tri.io");

    FileOutputStream f = new FileOutputStream(outFile);
    ObjectOutputStream o = new ObjectOutputStream(f);

    Trie tri = new Trie();

    while (input.hasNext()) {
      String word = input.next();
      System.out.print(word);
      tri.insert(word);

      o.writeObject(tri);
    }
    input.close();
    System.out.print("done");

  }
}