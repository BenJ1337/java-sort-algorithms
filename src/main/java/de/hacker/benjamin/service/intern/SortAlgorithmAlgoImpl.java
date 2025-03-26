package de.hacker.benjamin.service.intern;

import de.hacker.benjamin.service.SortAlgorithmAlgo;
import de.hacker.benjamin.service.algorithm.SelectionSortAlgo;
import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class SortAlgorithmAlgoImpl implements SortAlgorithmAlgo {
    private final SelectionSortAlgo selectionSortService;

    public void sort(int[] arr) {
        selectionSortService.sort(arr);
    }
}