import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Collections {
	public static void main(String[] args) {
		/*
		 * ArrayList ===================== //Stores list of objects //Duplicates are
		 * allowed //Objects will be displayed in the order entered //Adding or deleting
		 * elements at any position except at the end is very slow
		 */
		List<String> al = new ArrayList<String>();
		al.add("John");
		al.add("Mike");
		al.add("Robert");
		al.add("Rahim");
		for (String s : al) {
			System.out.println(s);
		}
		// checking whether "john" record is present in the list or not
		if (al.contains("John")) {
			System.out.println("John record found!");
		} else {
			System.out.println("John record not found!");
		}
		// checking whether the list is empty
		if (al.isEmpty()) {
			System.out.println("List is empty!");
		}
		// removing "Mike" from the list
		al.remove("Mike");
		for (String s : al) {
			System.out.println(s);
		}

		/*
		 * LinkedList ================================= //Removing or adding elements
		 * anywhere in the list
		 */
		List<String> ll = new LinkedList<String>();
		List<String> ll2 = new LinkedList<String>();
		// checking if the list is empty
		if (ll.isEmpty()) {
			System.out.println("list is empty!");
		}
		// adding elements into the list
		ll.add("Cat");
		ll.add("dog");
		ll.add("mouse");
		ll.add("bear");
		for (String s : ll) {
			System.out.println(s);
		}
		// adding all the elements of ll to ll2.
		ll2.addAll(ll);
		for (String s : ll2) {
			System.out.println(s);
		}
		// deleting all the elements in ll2
		ll2.clear();
		if (ll2.isEmpty()) {
			System.out.println("list is empty!");
		}

		/*
		 * Sets ======= // only store unique values //Very fast to check if a particular
		 * object exists //If we want to use out own objects like employee,we need to
		 * implement hashcode and equals methods
		 */
		// Hashset is not ordered
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		// Adding elements into the set1
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		// Adding elements into the set2
		set2.add("Five");
		set2.add("Six");
		for (String s : set1) {
			System.out.println(s);
		}
		// adding duplicate element into the list and checking
		set1.add("one");
		for (String s : set1) {
			System.out.println(s);
		}
		// Adding all elements of set2 into set1
		set1.addAll(set2);
		for (String s : set1) {
			System.out.println(s);
		}
		// removing elements from set1 which are not contained in set2
		set1.retainAll(set2);
		for (String s : set1) {
			System.out.println(s);
		}

		// Displays objects in natural order
		Set<Integer> set3 = new TreeSet<Integer>();
		Set<Integer> set4 = new TreeSet<Integer>();

		// Adding elements into the set3
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		// Adding elements into the set4
		set4.add(5);
		set4.add(6);
		for (Integer s : set3) {
			System.out.println(s);
		}
		// adding duplicate element into the list and checking
		set3.add(1);
		for (Integer s : set3) {
			System.out.println(s);
		}
		// Adding all elements of set4 into set3
		set3.addAll(set4);
		for (Integer s : set3) {
			System.out.println(s);
		}
		// removing elements from set3 which are not contained in set4
		set3.retainAll(set4);
		for (Integer s : set3) {
			System.out.println(s);
		}

		// Displays objects in the order they were added
		Set<Integer> set5 = new LinkedHashSet<Integer>();
		Set<Integer> set6 = new LinkedHashSet<Integer>();

		// Adding elements into the set5
		set5.add(11);
		set5.add(12);
		set5.add(13);
		set5.add(14);
		// Adding elements into the set6
		set6.add(5);
		set6.add(6);
		for (Integer s : set5) {
			System.out.println(s);
		}
		// adding duplicate element into the list and checking
		set5.add(11);
		for (Integer s : set5) {
			System.out.println(s);
		}
		// Adding all elements of set5 into set6
		set5.addAll(set6);
		for (Integer s : set5) {
			System.out.println(s);
		}
		// removing elements from set5 which are not contained in set6
		set5.retainAll(set6);
		for (Integer s : set5) {
			System.out.println(s);
		}
		if (set5.isEmpty()) {
			System.out.println("Set is Empty!");
		}

		/*
		 * Maps ===== //Key Value Pairs //Retrieving a value by key is fast //Iterating
		 * over maps is slow
		 */
		// keys not in any particular order, and order liable to change
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// adding keys and values into map
		map1.put(3, "Three");
		map1.put(5, "Five");
		map1.put(6, "Six");
		map1.put(1, "One");

		// Retrieving any particular element by key
		String text = map1.get(5);
		System.out.println(text);

		// displaying key value pairs
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		// checking whether map is empty
		if (map1.isEmpty()) {
			System.out.println("Map1 is empty!");
		}

		// Keys sorted in natural order
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		// checking whether map is empty
		if (map2.isEmpty()) {
			System.out.println("Map2 is empty!");
		}
		// adding keys and values into map2
		map2.put(3, "Three");
		map2.put(5, "Five");
		map2.put(6, "Six");
		map2.put(2, "Two");

		// checking whether the particular key is there or not
		if (map2.containsKey(4)) {
			System.out.println("Key is present!");
		} else {
			System.out.println("Key is not found!");
		}
		// Removing any particular element
		map2.remove(6);
		// displaying key value pairs
		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

		// Keys remain in order added
		Map<Integer, String> map3 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map4 = new LinkedHashMap<Integer, String>();
		// checking whether map is empty
		if (map3.isEmpty()) {
			System.out.println("Map3 is empty!");
		}
		// adding keys and values into map3
		map3.put(1, "One");
		map3.put(5, "Five");
		map3.put(8, "Eight");
		map3.put(2, "Two");

		// adding keys and values into map4
		map4.put(9, "Nine");
		map4.put(5, "Five");

		// checking whether the particular key is there or not
		if (map3.containsKey(4)) {
			System.out.println("Key is present!");
		} else {
			System.out.println("Key is not found!");
		}
		// Removing any particular element
		map3.remove(8);
		// displaying key value pairs
		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

		// adding items of map4 into map3
		map3.putAll(map4);
		// displaying key value pairs
		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

		/*
		 * Queue ======= //follows first in first out
		 */
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(4);
		// adding elements into queue
		q1.add(6);
		q1.add(20);
		q1.add(30);
		q1.add(100);

		// using iterator to display the elements in queue
		Iterator it = q1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// removing element from queue,it'll remove first element by default
		System.out.println("Removed element is: " + q1.remove());
		it = q1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// removing particular element
		q1.remove(100);
		it = q1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
