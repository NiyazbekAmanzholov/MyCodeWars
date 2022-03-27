package kyu8.task46;
//Вы пишете код для управления светофорами вашего города. Вам нужна функция для обработки каждого изменения от green,
//до yellow, до red, а затем greenснова.
//
//Завершите функцию, которая принимает строку в качестве аргумента, представляющего текущее состояние света,
//        и возвращает строку, представляющую состояние, в которое должен измениться свет.

//        assertEquals("green", TrafficLights.updateLight("red"));
//                assertEquals("yellow", TrafficLights.updateLight("green"));
//                assertEquals("red", TrafficLights.updateLight("yellow"));

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TrafficLights {

  public static void main(String[] args) {
    System.out.println(TrafficLights.updateLight("red"));
  }

  public static String updateLight(String current) {
    switch (current) {
      case "red" : return "green";
      case "green" : return "yellow";
      case "yellow" : return "red";
      default : return "unknown animal";
    }
  }
}

class TrafficLights2 {
  public static String updateLight(String current) {
    switch (current) {
      case "red": return "green";
      case "yellow": return "red";
      case "green": return "yellow";
      default: throw new IllegalArgumentException();
    }
  }
}

class TrafficLights3 {
  public static String updateLight(String current) {
    return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
  }
}

class TrafficLights4 {
  private static List<String> lights = Arrays.asList("green", "yellow", "red");

  public static String updateLight(String current) {
    //return the next color
    return lights.get((lights.indexOf(current)+1)%lights.size());
  }
}

class TrafficLights5{
  public static String updateLight(String current) {
    if(current == "green") return "yellow";
    if(current == "yellow") return "red";
    else return "green";
  }
}