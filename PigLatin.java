import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner line = new Scanner(System.in);
    while(line.hasNext()){
      Scanner word = new Scanner(line.nextLine());
      while(word.hasNext()){
        System.out.print(pigLatinBest(word.next()));
        if(word.hasNext()) System.out.print(" ");
      }
      if(line.hasNext()) System.out.println();
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
    if(s.length() >= 2){
      for(String i : digraphs){
        if(s.substring(0,2).equals(i)) return s.substring(2) + s.substring(0,2) + "ay";
      }
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
      char lastChar = s.charAt(s.length() - 1);
      if(lastChar >= 'a' && lastChar <= 'z') return pigLatin(s);
      return pigLatin(s.substring(0, s.length() - 1)) + lastChar;
    }
      return s;
  }
}
