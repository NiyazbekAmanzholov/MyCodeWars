package kyu8.task29;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PushAnObjectIntoArray {  
  public static List<String> push(){
    List<String> items = new ArrayList<>();
    items.add("an object");
    return items;
  }
}

class PushAnObjectIntoArray2 {
  public static List<String> push() { return Arrays.asList("an object"); }
}

class PushAnObjectIntoArray3 {
  static List<String> push() {
    return new ArrayList<>(Collections.singleton("an object"));
  }
}
class PushAnObjectIntoArray4 {
  public static List<String> push() {
    return new ArrayList<>(Collections.singleton("an object"));
  }
}
