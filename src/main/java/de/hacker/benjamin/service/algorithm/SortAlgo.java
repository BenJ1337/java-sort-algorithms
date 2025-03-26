package de.hacker.benjamin.service.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface SortAlgo {
    static final Logger LOG = LoggerFactory.getLogger(SortAlgo.class);

    void sort(int[] arr);

    default void swap(int i, int l, int[] arr) {
        LOG.debug("List before swap: {}, swap {} with {}", arr, arr[i], arr[l]);
        final var tmp = arr[i];
        arr[i] = arr[l];
        arr[l] = tmp;
        LOG.debug("List after swap: {}", arr);
    }
}
