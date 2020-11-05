public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size=0;
  }
  public SuperArray(int InitialCapacity){
    data = new String[InitialCapacity];
    size=0;
  }

  public String[] getData(){
    return data;
  }
  public int size() {
    int values=0;
    for (int i=0; i<data.length; i++) {
      if (data[i]!=null) values++;
    }
    size=values;
    return size;
  }
  public boolean add(String element) {
    if (size()==data.length) resize();
    data[size()]=element;
    size+=1;
    return true;
  }
  public String get(int index) {
    return data[index];
  }
  public String set(int index, String element) {
    String replaced=data[index];
    data[index]=element;
    return replaced;
  }
  public void resize() {
    String [] arr=new String[data.length*2];
    for (int i=0; i<data.length; i++) {
      arr[i]=data[i];
    }
    size*=2;
    data=arr;
  }
  public boolean isEmpty() {
    return size==0;
  }
  public String toString() {
    String str="[";
    for (int i=0; i<size-1; i++) {
      str+=data[i]+", ";
    }
    str+=data[size-1]+"]";
    return str;
  }
  public boolean contains(String s) {
    boolean exists=false;
    for (int i=0; i<size; i++) {
      if (s.equals(data[i])) exists=true;
    }
    return exists;
  }
  public void clear() {
    data = new String[10];
    size=0;
  }
  public void add(int index, String element){
    if (size==data.length) resize();
    String store=data[index];
    for (int i=index; i<size; i++) {
      String curr=store;
      store=data[i+1];
      data[i+1]=curr;
    }
    size++;
    data[index]=element;
  }
  public String remove(int index){
    String removed=data[index];
    for(int i=index; i<size-1; i++) {
      data[i]=data[i+1];
    }
    size--;
    return removed;
  }
  public int indexOf(String s){
    int index=-1;
    for (int i=0; i<size; i++) {
      if (data[i].equals(s)){
        index=i;
        break;
      }
    }
    return index;
  }
  public String[] toArray() {
    String[] safe=new String[size];
    for (int i=0; i<size; i++){
      safe[i]=data[i];
    }
    return safe;
  }
  public static void removeDuplicates(SuperArray s) {
    for (int i=0; i<s.size; i++){
      for (int j=i+1; j<s.size; j++){
        if (s.data[j].equals(s.data[i])) {
          s.remove(j);
          j--;
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray s=new SuperArray();
    for (int i=0; i<a.size; i++) {
      if (b.contains(a.data[i])) s.add(a.data[i]);
    }
    SuperArray.removeDuplicates(s);
    return s;
  }
}
