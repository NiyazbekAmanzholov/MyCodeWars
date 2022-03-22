package JustPractice.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");

        List<String> keys = new ArrayList<String>(hashMap.keySet());
        for(int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = hashMap.get(key);

            System.out.println(key + " " + value);
        }
    }
}

class Main2 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");

        List<String> keys = new ArrayList<String>(hashMap.keySet());
        for (String key : keys) {
            String value = hashMap.get(key);

            System.out.println(key + " " + value);
        }
    }
}

class Main3 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");

        List<String> keys = new ArrayList<>(hashMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
             String key = keys.get(i);
             String val = hashMap.get(keys.get(i));

            System.out.println(key + " " + val);
        }
    }
}

class Main4 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");

        List<String> list = hashMap.entrySet()
                .stream()
                .filter(e -> !e.getKey().equals("a"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}

class Main5 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("c", "2");
        hashMap.put("b", "3");
        hashMap.put("v", "1");

        List<String> list = hashMap.entrySet()
                .stream()
                .filter(e -> !e.getKey().equals("a"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}