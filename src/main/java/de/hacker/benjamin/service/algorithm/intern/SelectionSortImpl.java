package de.hacker.benjamin.service.algorithm.intern;

import de.hacker.benjamin.service.algorithm.SelectionSortAlgo;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
public class SelectionSortImpl implements SelectionSortAlgo {
    private static final Logger LOG = LoggerFactory.getLogger(SelectionSortImpl.class);

    @Override
    public void sort(int[] arr) {
        for (var j = 0; j < arr.length; j++) {
            LOG.info("Step: {}", j);
            var index = j;
            for (var i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[j]) {
                    index = i;
                }
            }
            if (index != j) {
                swap(j, index, arr);
            }
        }
    }
}