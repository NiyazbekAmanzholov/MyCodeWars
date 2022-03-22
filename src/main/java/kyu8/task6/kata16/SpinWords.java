package kyu8.task6.kata16;

import java.util.Vector;
public class SpinWords {

  public String spinWords(String str) {
        String buffer_string = "";
        // Split strings to array
        String[] str_arr = str.split(" ");
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].length() >= 5) {
                buffer_string += reverse(str_arr[i]);
                buffer_string += " ";
            }
            else {
                buffer_string += str_arr[i];
                buffer_string += " ";
                }
            }
        return (buffer_string.trim());
  }
  public String reverse(String str) {
        Vector<String> str_vec = new Vector<String>();
        String[] str_arr = str.split("");
        for (int i = str_arr.length - 1; i >= 0; i--) {
            str_vec.addElement(str_arr[i]);
        }
        Object[] rev_str = str_vec.toArray();
        String buff = "";
        for (Object i : rev_str) {
            buff += (String)i;
        }
        return buff;
  }
}