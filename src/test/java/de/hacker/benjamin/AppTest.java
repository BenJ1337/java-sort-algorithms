package de.hacker.benjamin;

import de.hacker.benjamin.service.SortAlgorithmService;
import de.hacker.benjamin.service.config.ServiceConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void test_selectionSort() {
        final var context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);
        final var sortAlgorithmService = context.getBean(SortAlgorithmService.class);

        final var arr = new int[]{2, 1, 10, -1};
        sortAlgorithmService.sort(arr);
        assertThat(arr).isEqualTo(new int[]{-1, 1, 2, 10});
    }
}