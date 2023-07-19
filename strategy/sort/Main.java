package strategy.sort;

import strategy.sort.types.Bubble;
import strategy.sort.types.Merge;
import strategy.sort.types.Selection;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[5];

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
