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
    for (int i=index; i<size; i++) {
      data[i+1]=data[i];
    }
    size++;
    data[index]=element;
  }
  public String remove(int index){
    String removed=data[index];
    for(int i=index; i<size; i++) {
      data[i]=data[i+1];
    }
    size--;
    return removed;
  }
}
