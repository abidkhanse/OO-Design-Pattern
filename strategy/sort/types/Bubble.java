package strategy.sort.types;

import strategy.sort.SortingStrategy;

import java.util.Arrays;

public class Bubble implements SortingStrategy {
    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }

        System.out.println("Bubble sort implemented" + Arrays.toString(array));

    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
