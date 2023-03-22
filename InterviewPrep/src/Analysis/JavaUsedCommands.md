Streams 
--------------------------------------------------------------------------

- https://stackify.com/streams-guide-java-8/

path.stream().map(e -> e.toString()).collect(Collectors.joining())
- [ ] Map - for each element ‘e’ do some function
- [ ] Collect - Collectors.joining - collect the output of map in a list.


Collections
--------------------------------------------------------------------------


Import java.util.collections

Collections.reverse(<List>);
     
Collections.sort(list);
     
Always use Collections.sort(list, new Comparator<Class>())


Arrays
-----------------------------------------------------

Arrays.copyOf
     
Convert int[] to list
    Arrays.stream(<array name>).boxed().collect(Collectors.toList());
     List<int[]> list = new ArrayList<>(Arrays.asList(intervals));

     
Arrays.sort(<array created>);


List
--------------------------------------------------------------------------

list.addAll(Collection<Datatype>)
- [ ] Return empty list. - List.of()
- [ ] Convert array to list - Arrays.asList(<the array to convert>);  P.S need to import java.util.Arrays
    - [ ] Example - Arrays.asList(s.split(" "));   // useful to split sentences into words
     
List to Array
     - list.toArray(new int[list.size()][2]);


Queue 
--------------------------------------------------------------------------

import java.util.ArrayDeque;

queue.add()
queue.poll() // remove front of the queue
queue.peek() // look at the front item of the queue

Queue.isEmpty() // useful to check if queue is empty 


Map
--------------------------------------------------------------------------

Map<k, v> map = new HashMap<>();

map.keySet() returns the key stored in the map. The key will 


Inbuilt key - Integer.hashCode(key);
Treemap - freqMap.pollLastEntry()


Priority Queue
--------------------------------------------------------

PriorityQueue<T> maxHeap = new PriorityQueue<>(capacity, <T>(key to store));

PriorityQueue<Element> heap = new PriorityQueue<>(lists.size(), Comparator.comparingInt(e -> e.val));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

  

String
--------------------------------------------------------------------------------------

String.join("->", [1,2,3]). Result = 1->2->3

S.isEmpty()

StringBuilder sb = new StringBuilder(<"some string">)

sb.append()

sb.remove(incluseive index, exclusiveIndex);



Char
----------------------------------------------------------------------------------------

char letter : new char[] {'a', 'b'}



Comparator
----------------------------------------------------------------------------------------

    When to use different form of comparators
    -----------------------------------------
     
     1. Using Comparable
     Each wrapper class(Integer, Double, or Long), String class, and Date class implements an interface called Comparable. This interface contains a compareTo(T o) method which is used by sorting methods to sort the Collection. This method returns a negative integer, zero, or a positive integer if this object is less than, equal to, or greater than the object passed as an argument.
     
 **    If we use the Collections.sort(List<T> list) method to sort an ArrayList, then the class whose objects are stored in the ArrayList must implement the Comparable interface. If the ArrayList stores an Integer, a Long, or a String, then we don’t need to worry as these classes already implement the Comparable interface. But if the ArrayList stores a custom class object, then that class must implement the Comparable interface.**
     
     ```
     @Override
	public int compareTo(Employee emp) {
		//We will sort the employee based on age in ascending order
        //returns a negative integer, zero, or a positive integer as this employee age
        //is less than, equal to, or greater than the specified object.
        return (this.age - emp.age);
	}```

    Comparator using Lambda expressions
    -----------------------------------

    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                            new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
                            
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));     

    Collections.sort(collection<Element> ,new Comparator<Interval>(){
        public int compare (Element i1, Element i2){
            return i1.start - i2.start;
        }
    });


    Comparator<List<Integer>> distanceComparator = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> p1, List<Integer> p2) {
            return distanceToOrigin(p1) - distanceToOrigin(p2);
        }
    };

----------------------------------------------------------------------------------------

