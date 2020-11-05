import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    SuperArray words=new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("uni");
    System.out.println(words.toString());
    System.out.println(words.set(1, "adi"));
    System.out.println(words.toString());
    System.out.println(words.isEmpty());
    System.out.println();
    SuperArray other = new SuperArray();
    System.out.println(other.isEmpty());
    other.add("1");
    System.out.println(other.isEmpty());
    System.out.println(words.toString());
    System.out.println(other.toString());
    System.out.println(other.contains("2"));
    System.out.println(words.contains("uni"));
    System.out.println(words.contains("ebi"));
    System.out.println(words.toString());
    words.add(1, "uni");
    System.out.println(words.toString());
    words.remove(1);
    System.out.println(words.toString());
    System.out.println(words.indexOf("uni"));
    System.out.println(words.indexOf("word"));
    System.out.println("\nTesting removeDuplicates()");
    SuperArray words2 = new SuperArray();
    //grouped to save vertical space
    words2.add("kani");   words2.add("uni");     words2.add("ebi");     words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("kani");    words2.add("una");
    words2.add("una");    words2.add("ebi");     words2.add("toro");

    System.out.println(words2);
    SuperArray.removeDuplicates(words2);
    System.out.println(words2);
  }
}
