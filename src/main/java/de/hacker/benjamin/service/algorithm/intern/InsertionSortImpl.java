package de.hacker.benjamin.service.algorithm.intern;

import de.hacker.benjamin.service.algorithm.InsertionSort;

public class InsertionSortImpl implements InsertionSort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(j - 1, j, arr);
                }
            }
        }
    }
}
