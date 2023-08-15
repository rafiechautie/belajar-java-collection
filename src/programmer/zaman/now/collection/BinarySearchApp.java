package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
  public static void main(String[] args) {

    //buat data list
    List<Integer> list = new ArrayList<>(1000);
    for (int i = 1; i <= 1000; i++) {
      list.add(i);
    }

    //mencari angka 333 di list
    int index = Collections.binarySearch(list, 333);// akan mengembalikan indexnya
    System.out.println(index);

    //mengubah behavior dari compataror, misal ingin mencari dari belakang
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };

    int index2 = Collections.binarySearch(list, 333);
    System.out.println(index2);

  }
}
