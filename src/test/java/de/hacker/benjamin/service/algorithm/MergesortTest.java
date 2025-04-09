package de.hacker.benjamin.service.algorithm;

import de.hacker.benjamin.service.algorithm.intern.MergesortImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MergesortTest {

    private final Mergesort mergesort = new MergesortImpl();

    @Test
    void test() {
        final var arr = new int[]{-1, 1, 0, -5, 100, -2, 5, 10};
        mergesort.sort(arr);
        final var expt = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expt);
        assertThat(arr).isEqualTo(expt);
        assertThat(arr).as("gg.: %s".formatted(Arrays.toString(arr))).isEqualTo(expt);
    }
}
