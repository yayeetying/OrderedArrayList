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


    System.out.println();
    NoNullArrayList<Integer> ape = new NoNullArrayList<>(50);
    //ape got initialCapacity of 50
    System.out.println(ape.size());
    for (int i = 0; i < 10; i++) {
      System.out.print(ape.add(i));
    }
    System.out.println();
    for (Integer element: ape) {
      System.out.print("" + ape.get(element) + " ");
    }
    System.out.println();
  }
}
