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

    OrderedArrayList<Integer> hebi = new OrderedArrayList<>();
    System.out.println(hebi.size());
//12 21 84 90 3 89 41 239 0 34 8 12 3 9 48 -90
    System.out.print(hebi.add(12));
    System.out.print(hebi.add(84));
    System.out.print(hebi.add(21));
    System.out.print(hebi.add(90));
    System.out.print(hebi.add(3));
    System.out.println();
    System.out.println(hebi.toString());
    try {
      hebi.add(null);
    }
    catch (NullPointerException e) {
      System.out.println("don't make me compareTo a null");
    }

    OrderedArrayList<String> pop = new OrderedArrayList<>();
    System.out.print(pop.add("z"));
    System.out.print(pop.add("apple"));
    System.out.print(pop.add("queue"));
    System.out.print(pop.add("a"));
    System.out.print(pop.add("app"));
    System.out.println();
    System.out.println(pop.toString());

    try {
      pop.add(4, null);
    }
    catch (NullPointerException e) {
      System.out.println("don't make me compareTo a null");
    }

    pop.add(3, "asdajhdas hdasjhhjsa");
    pop.add(3, "poppy");
    pop.add(0, "zzzzzzz");
    System.out.println(pop.toString());

    System.out.println(hebi);
  }
}
