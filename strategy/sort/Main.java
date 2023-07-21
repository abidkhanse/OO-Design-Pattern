package strategy.sort;

import strategy.sort.types.Bubble;
import strategy.sort.types.Merge;
import strategy.sort.types.Selection;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 1;

        SortingStrategy strategy = new Bubble();
        SortContext sortContext = new SortContext(strategy);
        sortContext.perform(arr);

        strategy = new Merge();
        sortContext.changeSort(strategy);
        sortContext.perform(arr);

        strategy = new Selection();
        sortContext.changeSort(strategy);
        sortContext.perform(arr);

    }
}
