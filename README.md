# OrderedArrayList

NoNullArrayList (and OrderedArrayList too) IS an ArrayList; there are no instance variables, just changing the way some of the ArrayList methods work

1) for the NoNullArrayList, it is similar to an ArrayList, except it doesn't allow Nulls to be added as elements (will throw IllegalArgumentException when null is added)
2) for the OrderedArrayList, all the elements in it will be ordered (sorted); no Nulls will be an element, because it inherited that property from superclass NoNullArrayList

-how are Strings (Comparable) "ordered?"; lexicographic order
-any comparable object has a .compareTo() method; that's why we extend Comparable

NoNullArrayList's constructors:
-default constructor: don't take in a parameter
-2nd constructor: ArrayList has the initialCapacity you set it to

-note: for the set() method in OrderedArrayList, you're using the add() method from OrderedArrayList, not from the parent's (keeps ordering correct that way)
