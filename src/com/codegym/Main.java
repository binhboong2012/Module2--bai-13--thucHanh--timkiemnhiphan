package com.codegym;

import static com.codegym.BinarySearch.binarySearch;
import static com.codegym.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 7));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, 100));
        System.out.println(binarySearch(list, 104));
    }
}
