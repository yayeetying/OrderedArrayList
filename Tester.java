public class Tester {

  public static void main(String[] argsssssssssssnakessss) {

    NoNullArrayList<String> snake = new NoNullArrayList<>();
    //since NoNullArrayList is a child of ArrayList, even if i didn't implement
    //methods like .size() and the like, NoNullArrayList has those methods
    //because it got inheritted from ArrayList :D
    System.out.println(snake.size());
    System.out.println(snake.add("ss"));
    System.out.println(snake.add("sss"));
    for (String element: snake) {
      System.out.print("" + snake.get(snake.indexOf(element)) + " ");
    }
    System.out.println();
    try {
      snake.add(null);
    }
    catch (IllegalArgumentException e) {
      System.out.println("ay gratz you got the IllegalArgumentException");
    }
    snake.add(1, "woofwoof");
    snake.add(3, "imposters");
    snake.add("here?");
    for (String element: snake) {
      System.out.print("" + snake.get(snake.indexOf(element)) + " ");
    }
    System.out.println();
    try {
      snake.add(2, null);
    }
    catch (IllegalArgumentException e) {
      System.out.println("ay gratz you got the IllegalArgumentException");
    }


    System.out.println();
    NoNullArrayList<Integer> ape = new NoNullArrayList<>(50);
    //ape got initialCapacity of 50
    System.out.println(ape.size());
    for (int i = 0; i < 10; i++) {
      System.out.print(ape.add(i));
    }
    System.out.println();
    try {
      ape.add(100, 50); //trying to add 50 to index 100
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("ay gratz you got them IndexOutOfBoundsException");
    }

    try {
      ape.add(10, null);
    }
    catch (IllegalArgumentException e) {
      System.out.println("ay gratz you got the IllegalArgumentException");
    }
    for (Integer element: ape) {
      System.out.print("" + ape.get(element) + " ");
    }
    System.out.println();
    System.out.println(ape.set(5, 100));
    System.out.println(ape.set(9, 1000));
    try {
      ape.set(9, null);
    }
    catch (IllegalArgumentException e) {
      System.out.println("ay gratz you got the IllegalArgumentException");
    }

    try {
      ape.set(1, null);
    }
    catch (IllegalArgumentException e) {
      System.out.println("ay gratz you got the IllegalArgumentException");
    }
    for (int i = 0; i < ape.size(); i++) {
      System.out.print("" + ape.get(i) + " ");
    }
    System.out.println();
    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~");
    System.out.println();

    OrderedArrayList<String> hebi = new OrderedArrayList<>();
    System.out.println(hebi.size());
    



  }
}
