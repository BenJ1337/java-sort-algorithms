package de.hacker.benjamin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void test_selectionSort() {
        final var arr = new int[]{2, 1, 10, -1};
        App.selectionSort(arr);
        assertThat(arr).isEqualTo(new int[]{-1, 1, 2, 10});
    }
}