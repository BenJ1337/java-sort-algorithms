package de.hacker.benjamin.service.algorithm.intern;

import de.hacker.benjamin.service.algorithm.Mergesort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergesortImpl implements Mergesort {
    private static final Logger LOG = LoggerFactory.getLogger(QuicksortImpl.class);

    @Override
    public void sort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        merge(arr, 0, arr.length);
    }

    private void merge(int[] arr, int start, int end) {
        final var newMid = start + (end - start) / 2;
        LOG.debug("Split at {}", newMid);
        merge(arr, start, newMid);
        merge(arr, newMid + 1, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        LOG.debug("Left: start: {}, mid: {}, end: {}", start, mid, end);
        int midStart = mid + 1;
        if (arr[mid] <= arr[midStart]) {
            return;
        }
        while (start <= mid && midStart <= end) {
            if (arr[start] <= arr[midStart]) {
                start++;
            } else {
                var val = arr[midStart];
                var index = midStart;
                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = val;
                start++;
                mid++;
                midStart++;
            }
        }
    }
}
