public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size=0;
  }
  public SuperArray(int InitialCapacity){
    if (InitialCapacity<0){
      throw new IllegalArgumentException("Capacity cannot be negative.");
    }
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
    if (index<0 || index>=size()) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    return data[index];
  }
  public String set(int index, String element) {
    if (index<0 || index>=size()) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    String replaced=data[index];
    data[index]=element;
    return replaced;
  }
  public void resize() {
    String [] arr=new String[data.length*2];
    if (data.length==0) {
      arr=new String[data.length*2+1];
    }
    for (int i=0; i<data.length; i++) {
      arr[i]=data[i];
    }
    size*=2;
    data=arr;
  }
  public boolean isEmpty() {
    return size()==0;
  }
  public String toString() {
    if (size()==0) return "[]";
    String str="[";
    for (int i=0; i<size-1; i++) {
      str+=data[i]+", ";
    }
    str+=data[size()-1]+"]";
    return str;
  }
  public boolean contains(String s) {
    for (int i=0; i<size(); i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }
  public void clear() {
    data = new String[10];
    size=0;
  }
  public void add(int index, String element){
    if (index<0 || index>size()) throw new IndexOutOfBoundsException();
    if (size()==data.length) resize();
    for (int i=size(); i>index; i--) {
      data[i]=data[i-1];
    }
    size++;
    data[index]=element;
  }
  public String remove(int index){
    if (index<0 || index>=size()) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    String removed=data[index];
    for(int i=index; i<size()-1; i++) {
      data[i]=data[i+1];
    }
    data[size()-1]=null;
    size--;
    return removed;
  }
  public int indexOf(String s){
    for (int i=0; i<size(); i++) {
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }
  public String[] toArray() {
    String[] safe=new String[size()];
    for (int i=0; i<size(); i++){
      safe[i]=data[i];
    }
    return safe;
  }
  public int lastIndexOf(String value) {
    for (int i=size()-1; i>=0; i--) {
      if (data[i].equals(value)) return i;
    }
    return -1;
  }
  public boolean equals(SuperArray other){
    if (size()==other.size) {
      for (int i=0; i<size(); i++) {
        if (!(data[i].equals(other.data[i]))) return false;
      }
      return true;
    }
    return false;
  }
}
