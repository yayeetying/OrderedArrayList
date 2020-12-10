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


}
