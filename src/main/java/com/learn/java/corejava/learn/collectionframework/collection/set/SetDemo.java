package com.learn.java.corejava.learn.collectionframework.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetDemo {

    public static void main(String[] args) {
        // --- HashSet: No insertion order guarantee, fast operations ---
        System.out.println("--- HashSet Demonstration ---");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Adding a duplicate, which will be ignored
        System.out.println("HashSet (order not guaranteed): " + hashSet);
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));
        hashSet.remove("Apple");
        System.out.println("HashSet after removing 'Apple': " + hashSet);

        // --- LinkedHashSet: Maintains insertion order ---
        System.out.println("\n--- LinkedHashSet Demonstration ---");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        // --- TreeSet: Elements are sorted in natural order ---
        System.out.println("\n--- TreeSet Demonstration ---");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
