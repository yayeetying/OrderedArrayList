import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() { //default constructor
    super(); //calling ArrayList's default constructor
  }

  //constructor with parameter startingCapacity;
  //s'like the constructor in ArrayList that takes a startingCapacity too
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  //overriding add methods, so that they throw IllegalArgumentException
  //when null is added
  public boolean add(T element) { //dunno element's type rn, so use generic type T
    if (element == null) {
      throw new IllegalArgumentException("thou shall not add null into this ArrayList");
    }
    return super.add(element); //calling ArrayList's .add(element) method
  }


}
