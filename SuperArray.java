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
    if (size()==data.length) return false;
    else {
      data[size()]=element;
      return true;
    }
  }
}
