import java.util.Arrays;
public class Demo{
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

    //11.05-CW/HW 16
    System.out.println("\nTesting removeDuplicates()");
    SuperArray words2 = new SuperArray();
    //grouped to save vertical space
    words2.add("kani");   words2.add("uni");     words2.add("ebi");
    words2.add("una");    words2.add("una");     words2.add("ebi");
    words2.add("kani");   words2.add("una");     words2.add("una");
    words2.add("ebi");    words2.add("toro");

    System.out.println(words2);
    removeDuplicates(words2);
    System.out.println(words2);

    System.out.println("\nTesting findOverlap:");
    SuperArray nums1=new SuperArray();
    nums1.add("9"); nums1.add("1"); nums1.add("2"); nums1.add("2"); nums1.add("3"); nums1.add("4");
    SuperArray nums2=new SuperArray();
    nums2.add("0"); nums2.add("4"); nums2.add("2"); nums2.add("2"); nums2.add("9");
    System.out.println(findOverlap(nums1, nums2));

    System.out.println("\nTesting lastIndexOf:");
    System.out.println(words2.lastIndexOf("una"));
    System.out.println(nums1.lastIndexOf("2"));
    System.out.println(nums2.lastIndexOf("2"));

    System.out.println("\nTesting equals:");
    System.out.println(nums1.equals(nums2));

    System.out.println("\nTesting zip:");
    System.out.println(zip(nums1, nums2));

  }
  public static void removeDuplicates(SuperArray s) {
    for (int i=s.size(); i>0; i--){
      if (s.indexOf(s.get(i))<i) s.remove(i);
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray s=new SuperArray();
    for (int i=0; i<a.size(); i++) {
      if (b.contains(a.get(i))) s.add(a.get(i));
    }
    removeDuplicates(s);
    return s;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray s=new SuperArray();
    for (int i=0; i<Math.min(a.size(), b.size()); i++) {
      s.add(a.get(i));
      s.add(b.get(i));
    }
    if (a.size()>b.size()) {
      for (int i=b.size(); i<a.size(); i++) {
        s.add(a.get(i));
      }
    }
    else {
      for (int i=a.size(); i<b.size(); i++) {
        s.add(b.get(i));
      }
    }
    return s;
  }
}
