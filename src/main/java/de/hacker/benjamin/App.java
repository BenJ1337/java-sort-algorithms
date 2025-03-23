package de.hacker.benjamin;

import de.hacker.benjamin.service.SortAlgorithmService;
import de.hacker.benjamin.service.config.ServiceConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);
        final var sortAlgorithmService = context.getBean(SortAlgorithmService.class);
        final var arr = new int[]{2, 1, 10, 5, -1};
        sortAlgorithmService.sort(arr);
        LOG.info("unsorted array: {}", Arrays.toString(arr));
        LOG.info("Selection Sort: {}", Arrays.toString(arr));
    }

}