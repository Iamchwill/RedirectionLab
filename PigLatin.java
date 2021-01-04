import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    for(String i : args){
      System.out.println(pigLatin(i));
    }
  }

  static String[] vowels = {"a","e","i","o","u"};
  static String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    for(String i : vowels){
      if(s.substring(0,1).equals(i)) return s + "hay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    for(String i : vowels){
      if(s.substring(0,1).equals(i)) return s + "hay";
    }
    for(String i : digraphs){
      if(s.substring(0,2).equals(i)) return s.substring(2) + s.substring(0,2) + "ay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }
}
