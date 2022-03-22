package kyu8.task15;

//      Assert.AreEqual("hello", Kata.Smash(new string[] {"hello"}));
//              Assert.AreEqual("hello world", Kata.Smash(new string[] {"hello", "world"}));
//              Assert.AreEqual("hello amazing world", Kata.Smash(new string[] {"hello", "amazing", "world"}));
//Assert.AreEqual("this is a really long sentence", Kata.Smash(new string[] {"this", "is", "a", "really", "long", "sentence"}));
//              Assert.AreEqual("", Kata.Smash(new string[] {""}));
public class Kata
{
  public static void main(String[] args) {
    System.out.println(Kata.Smash(new String[] {"this", "is", "a", "really", "long", "sentence"}));
  }

  public static String Smash(String[] words)
  {
    return String.join(" ", words).trim();
  }
}

class Kata2 {

  public static void main(String[] args) {
    System.out.println(Kata2.greet("Rayan"));
  }

  public static String greet(String name)
  {
    return "Hello, "+ name +" how are you doing today?";
  }
}

class Kata3
{
  public static void main(String[] args) {
    System.out.println(Kata2.greet("Rayan"));
  }

  public static String greet(String name)
  {
    return String.format("Hello, %s how are you doing today?", name);
  }
}

class Kata4
{
  public static void main(String[] args) {
    System.out.println(Kata2.greet("Rayan"));
  }

  public static String greet(String name)
  {
    String begruessungsText = "Hello, <name> how are you doing today?";
    return begruessungsText.replace("<name>", name);
  }
}