import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner line = new Scanner(System.in);
    while(line.hasNext()){
      Scanner word = new Scanner(line.nextLine());
      while(word.hasNext()){
        String stars = word.next();
        for(int i = 0; i < stars.length(); i++) System.out.print("*");
        if(word.hasNext()) System.out.print(" ");
      }
      if(line.hasNext()) System.out.println();
    }
  }
}
