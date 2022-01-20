package com.codegym;

public class BinarySearch {

    static int[] list = {2, 4, 7, 10, 34, 56, 65, 76, 100, 105, 110};
    // cai dat phuong thuc binarySearch(int[] list, iny key).
    static int binarySearch(int[] list, int key) {
      int low = 0;
      int high = list.length -1;
      while (high >= low) {
          int mid = (low + high) / 2;
          if (key < list[mid])
              high = mid - 1;
          else if (key == list[mid])
              return mid;
          else
              low = mid + 1;
      }
      return -1;
    }

}
