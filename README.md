# JDK-collections
This repository covers some of the most used collections of the JDK and their features.
## Summary:
| Collection class | Base class | Interfaces | Duplicates | Ordered | Sorted | Thread-safe |
|:-------------------:|:-------------------------:|:----------------------------:|:----------:|:-------:|:------:|:-----------:|
| ArrayList<E> | AbstractListAbstractList | List | Yes | Yes | No | No |
| LinkedList<E> | AbstractSequentialList<E> | List;Deque | Yes | Yes | No | No |
| Vector<E> | AbstractList<E> | List | Yes | Yes | No | Yes |
| HashSet<E> | AbstractSet<E> | Set | No | No | No | No |
| LinkedHashSet<E> | HashSet<E> | Set | No | Yes | No | No |
| TreeSet<E> | AbstractSet<E> | Set;NavigableSet; SortedSet | No | Yes | Yes | No |
| HashMap<K, V> | AbstractMap<K, V> | Map | No | No | No | No |
| LinkedHashMap<K, V> | HashMap<K, V> | Map | No | Yes | No | No |
| Hashtable<K, V> | Dictionary<K, V> | Map | No | No | No | Yes |
| TreeMap<K, V> | AbstractMap<K, V> | Map;NavigableMap;  SortedMap | No | Yes | Yes | No |

##<br />ArrayList <br />
Implementation explaining .add() .get() .remove() .clear() .size() .next() and iteration using Iterator foreach and for.

##<br />LinkedList <br />
Implementation explaining .add() .addFirst() .addLast() .get() .remove() .removeFirst() .removeLast(). .clear() .isEmpty() .size() .next() and Iteration using Iterator foreach and for.

##<br />ArrayList.vs.LinkedList <br />
Execution time comparison between ArrayLists And LinkedLists, performing .add(); .get(); .remove();

##<br />HashMap <br />
Implementation explaining .put() .get() .getKey() .getValue() .removeIf() .clear() .size() and iteration using Iterator and foreach. 

##<br />LinkedHashMap <br />
Impelementation explaining .put() .getKey() .getValue() .removeIf() .clear() .size() and iteration using Iterator and foreach. 

##<br />Hashtable <br />
Implementation explaining .put() .get() .getKey() .getValue() .clone() .clear() .size() and iteration using Iterator and foreach, Enumeration to display keys .keys() method. 

##<br />TreeMap <br />
Impelementation explaining .put() .entrySet() .getKey() .getValue() .size(), iteration using Iterator.

##<br />HashSet <br />
Implementation explaining .add() .clear() .size() contains() methods and iteration using Iterator and foreach.

##<br />LinkedHashSet <br />
Implementation explaining .add() .clear() .size() .isEmpy() methods and iteration using Iterator and foreach.

##<br />TreeSet <br />
Implementation explaining .add() .first() .last() .ceiling(e) .floor(e) .pollFirst() .pollLast() .tailSet(e) .subSet(eFrom , eTo) .higher(e) .lower(e) .clear() .contains() methods and iteration using Iterator and foreach.
