package src.behavioral.strategy.sort.types;

import src.behavioral.strategy.sort.SortingStrategy;

import java.util.Arrays;

public class Selection implements SortingStrategy {
    @Override
    public void sort(int[] array) {

        int position = 0;
        int minValue;
        for (int i = 0; i < array.length - 1; i++) {

            if(i > 0 && array[i] == array[i - 1]) continue;

            position = i + 1;
            minValue = array[i + 1];
            for (int j = i + 1; j < array.length - 1; j++) {
                if (minValue > array[j + 1]) {
                    position = j + 1;
                    minValue = array[j + 1];
                }
            }

            if (array[i] > array[position]) {
                int temp = array[i];
                array[i] = array[position];
                array[position] = temp;
            }

        }


        System.out.println("Selection sort implemented" + Arrays.toString(array));


    }
}
