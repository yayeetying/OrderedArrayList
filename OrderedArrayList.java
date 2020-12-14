public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  //default constructor
  public OrderedArrayList() {
    super(); //calling NoNullArrayList's default constructor
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  //not what the prompt was asking for... ):
  private void sorter() {
    for (int i = 1; i < size(); i++) {
      int j = i;
      while (j > 0 && get(j).compareTo(get(j-1)) < 0) { //compareTo from Comparable
        T temp = get(j);
        set(j, get(j-1));
        set(j-1, temp);
        j--;
      }
    }
  }

  private int findIndexer(T element) {
    if (size() == 0) return 0;
    for (int i = 0; i < size()-1; i++) {
      if (element.compareTo(get(i)) >= 0 && element.compareTo(get(i+1)) <= 0) {
        return i+1;
      }
    }
    if (element.compareTo(get(0)) <= 0) return 0;
    else {return size();}
  }

  //Strings are Comparable (lexicography?)
  //overriding NoNullArrayList's add methods
  public boolean add(T element) {
    if (element == null) return false;
    int realIndex = findIndexer(element);
    super.add(realIndex, element);
    return true;
  }

  public void add(int index, T element) {
    if (element != null) {
      int realIndex = findIndexer(element);
      super.add(realIndex, element);
    }
  }

  //overriding NoNullArrayList's set method
  //remove() the element at index, then add() the new value
  public T set(int index, T element) {
    T removed = remove(index); //inheritted these methods from ArrayList (papa of the papa)
    if (element != null) add(element);
    return removed;
  }

}
