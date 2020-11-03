import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    SuperArray words=new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for (int i=0; i<words.size();i++){
      System.out.println(words.get(i));
    }
    System.out.println(words.set(1, "ebi"));
    for (int i=0; i<words.size();i++){
      System.out.println(words.get(i));
    }
    words.resize();
    System.out.println(words.getData().length);
    SuperArray letters= new SuperArray();
    letters.add("a");
    letters.add("b");
    letters.add("c");
    letters.add("d");
    letters.add("e");
    letters.add("f");
    letters.add("g");
    letters.add("h");
    letters.add("i");
    letters.add("j");
    letters.add("k");
    System.out.println(Arrays.toString(letters.getData()));

    System.out.println(words.isEmpty());
    SuperArray other = new SuperArray();
    System.out.println(other.isEmpty());
    other.add("1");
    System.out.println(other.isEmpty());
    System.out.println(words.toString());
    System.out.println(other.toString());
    System.out.println(other.contains("2"));
    System.out.println(words.contains("uni"));
    System.out.println(words.contains("ebi"));
    words.clear();
    System.out.println(Arrays.toString(words.getData()));
  }
}
