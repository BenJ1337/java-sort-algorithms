package de.hacker.benjamin.service.algorithm;

import de.hacker.benjamin.service.algorithm.intern.SelectionSortImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {
    private final SelectionSortAlgo selectionsort = new SelectionSortImpl();

    @Test
    void test_selectionSort() {
        final var arr = new int[]{2, 1, 10, -1};
        selectionsort.sort(arr);
        final var expt = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expt);
        assertThat(arr).isEqualTo(expt);
    }
}
