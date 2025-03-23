package de.hacker.benjamin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final var arr = new int[]{2, 1, 10, 5, -1};
        LOG.info("unsorted array: {}", Arrays.toString(arr));
        selectionSort(arr);
        LOG.info("Selection Sort: {}", Arrays.toString(arr));
    }

    public static void selectionSort(final int[] arr) {
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