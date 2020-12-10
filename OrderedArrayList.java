public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  //default constructor
  public OrderedArrayList() {
    super(); //calling NoNullArrayList's default constructor
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

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

  //overriding NoNullArrayList's add methods
  public boolean add(T element) {
    super.add(element);
    sorter();
    return true;
  }

}
