public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
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
    size=this.size();
    return true;
  }
  public String get(int index) {
    return data[index];
  }
  public String set(int index, String element) {
    data[index]=element;
    return data[index];
  }
  public void resize() {
    String [] arr=new String[data.length*2];
    for (int i=0; i<data.length; i++) {
      arr[i]=data[i];
    }
    data=arr;
    size=size();
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
}
