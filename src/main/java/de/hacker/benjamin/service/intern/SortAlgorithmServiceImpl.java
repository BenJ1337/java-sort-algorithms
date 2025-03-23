package de.hacker.benjamin.service.intern;

import de.hacker.benjamin.service.SortAlgorithmService;
import de.hacker.benjamin.service.algorithm.SelectionSortService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class SortAlgorithmServiceImpl implements SortAlgorithmService {
    private final SelectionSortService selectionSortService;

    public void sort(int[] arr) {
        selectionSortService.sort(arr);
    }
}