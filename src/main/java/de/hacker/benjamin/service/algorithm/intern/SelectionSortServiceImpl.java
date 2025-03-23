package de.hacker.benjamin.service.algorithm.intern;

import de.hacker.benjamin.service.algorithm.SelectionSortService;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Named
public class SelectionSortServiceImpl implements SelectionSortService {
    private static final Logger LOG = LoggerFactory.getLogger(SelectionSortServiceImpl.class);

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
                LOG.info("exchange {} with {}", arr[index], arr[j]);
                final var tmp = arr[j];
                arr[j] = arr[index];
                arr[index] = tmp;
                LOG.info("> {}", Arrays.toString(arr));
            }
        }
    }
}