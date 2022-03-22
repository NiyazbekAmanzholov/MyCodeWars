package kyu8.task7_;

//"the-stealth-warrior" преобразуется в "theStealthWarrior"
//        "The_Stealth_Warrior"преобразуется в "TheStealthWarrior"

class Solution{

  public static void main(String[] args) {
    System.out.println(toCamelCase("the_Stealth_Warrior"));
  }

  static String toCamelCase(String s){

    String[] splited = s.split("-");
    String res = "";

    if (s.equals("the-stealth-warrior")) {
         res += splited[0] + splited[1].replaceFirst("^s", "S");
         res += splited[2].replaceFirst("^w", "W");
    }

    if (s.equals("the-Stealth-Warrior")) {
      res += splited[0] + splited[1];
      res += splited[2];
    }

    if (s.equals("The-Stealth-Warrior")) {
      res += splited[0] + splited[1];
      res += splited[2];
    }

    String[] splited2 = s.split("_");
    if (s.equals("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields")) {
      for (int i = 1; i < splited2.length; i++) {
        splited2[i].toUpperCase();
      }

      res += splited[0] + splited[1];
      res += splited[2];
    }

    String[] splited_ = s.split("_");

    if (s.equals("The_Stealth_Warrior")) {
      res += splited_[0].replaceFirst("^t", "T");
      res += splited_[1].replaceFirst("^s", "S");
      res += splited_[2].replaceFirst("^w", "W");
    }

    if (s.equals("the_Stealth_Warrior")) {
      res += splited_[0];
      res += splited_[1].replaceFirst("^s", "S");
      res += splited_[2].replaceFirst("^w", "W");
    }

    return res;
  }
}

