package programmer.zaman.now.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

  public static enum Gender {
    MALE, FEMALE, NOT_MENTION
  }

  public static void main(String[] args) {

    //contoh jika semua data di enum gender dimasukkan
    Set<Gender> genders = EnumSet.allOf(Gender.class);
    //contoh jika datanya dimasukkan satu satu ke enum set
    // Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);

    for (var gender: genders){
      System.out.println(gender);
    }

  }
}
