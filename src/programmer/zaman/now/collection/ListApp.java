package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    //jika ingin menentukan kapasitas dari awal dari ArrayList, defaultnya 10
    //sehingga saat memasukkan data kurang dari 100 akan cepet
//    List<String> strings = new ArrayList<>(100);
    // List<String> strings = new LinkedList<>();

    strings.add("Eko");
    strings.add("Kurniawan");

    strings.set(0, "Budi");

    strings.remove(1);
    System.out.println(strings.get(0));

    for (var value : strings){
      System.out.println(value);
    }

  }
}
