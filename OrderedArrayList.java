public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  //default constructor
  public OrderedArrayList() {
    super(); //calling NoNullArrayList's default constructor
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

}
