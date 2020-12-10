public class Tester {

  public static void main(String[] argsssssssssssnakessss) {

    NoNullArrayList<String> snake = new NoNullArrayList<>();
    //since NoNullArrayList is a child of ArrayList, even if i didn't implement
    //methods like .size() and the like, NoNullArrayList has those methods
    //because it got inheritted from ArrayList :D
    System.out.println(snake.size());

    NoNullArrayList<Integer> ape = new NoNullArrayList<>(50);
    //ape got initialCapacity of 50
    System.out.println(ape.size());
  }
}
