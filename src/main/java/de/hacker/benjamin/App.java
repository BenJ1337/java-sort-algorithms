package de.hacker.benjamin;

import de.hacker.benjamin.service.SortAlgorithmAlgo;
import de.hacker.benjamin.service.algorithm.Quicksort;
import de.hacker.benjamin.service.config.ServiceConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);
        final var quicksort = context.getBean(Quicksort.class);
        final var selectionSort = context.getBean(SortAlgorithmAlgo.class);
        final var arr = new int[]{2, 1, 10, 5, -1};
        LOG.info("unsorted array: {}", Arrays.toString(arr));
        selectionSort.sort(arr);
        LOG.info("Selection Sort: {}", Arrays.toString(arr));
    }

}