import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    SuperArray words=new SuperArray();
    words.add("kani");
    words.add("uni");
    System.out.println(Arrays.toString(words.getData()));
  }
}
