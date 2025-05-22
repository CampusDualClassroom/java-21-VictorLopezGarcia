package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> customSet = new HashSet<>();
        return getStrings(customSet);
    }

    public static Set<String> createTreeSet() {
        Set<String> customSet = new TreeSet<>();
        return getStrings(customSet);
    }

    private static Set<String> getStrings(Set<String> customSet) {
        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");
        return customSet;
    }

    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        addElementToSet(hashSet, "ELEMENT AAA");
        addElementToSet(treeSet, "ELEMENT AAA");

        System.out.println("HashSet:");
        printSet(hashSet);

        System.out.println("TreeSet:");
        printSet(treeSet);

    }

}
