import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    for(String i : args){
      System.out.println(pigLatinSimple(i));
    }
  }

  static String[] vowels = {"a","e","i","o","u"};

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    for(String i : vowels){
      if(s.substring(0,1).equals(i)) return s + "hay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }
}
