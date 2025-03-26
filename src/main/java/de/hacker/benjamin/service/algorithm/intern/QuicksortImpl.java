package de.hacker.benjamin.service.algorithm.intern;

import de.hacker.benjamin.service.algorithm.Quicksort;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
public class QuicksortImpl implements Quicksort {
    private static final Logger LOG = LoggerFactory.getLogger(QuicksortImpl.class);

    @Override
    public void sort(int[] arr) {
        sort(0, arr.length - 1, arr);
    }

    private void sort(int l, int r, int[] arr) {
        if (l < r) {
            final var devisor = devide(l, r, arr);
            sort(l, devisor - 1, arr);
            sort(devisor + 1, r, arr);
        }
    }

    private int devide(int left, int right, int[] arr) {
        var l = left + 1;
        var r = right;
        final var pivot = left;
        while (l < r) {
            while (l < r && arr[l] < arr[pivot]) {
                LOG.debug("l({}): {} < {}", l, arr[l], arr[pivot]);
                l++;
            }
            while (r > l && arr[r] > arr[pivot]) {
                LOG.debug("r({}): {} > {}", r, arr[r], arr[pivot]);
                r--;
            }
            if (r > l && arr[l] > arr[r]) {
                swap(l, r, arr);
            }
        }
        if (arr[pivot] > arr[r]) {
            swap(pivot, r, arr);
        }
        return r;
    }
}
