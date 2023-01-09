package org.example;

import java.util.List;
import java.util.Objects;

class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) throw new RuntimeException("Input can't be null!");
        removeNullsFromList(input);
        for (int i = 0; i < input.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    var temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return input;
    }

    private void removeNullsFromList(List input){
        input.removeIf(Objects::isNull);
    }
}
