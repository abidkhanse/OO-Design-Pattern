package src.behavioral.strategy.sort;


import src.behavioral.strategy.sort.types.Bubble;
import src.behavioral.strategy.sort.types.Quick;
import src.behavioral.strategy.sort.types.Selection;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 24;
        arr[1] = 9;
        arr[2] = 29;
        arr[3] = 14;
        arr[4] = 39;
        arr[5] = 3;

        SortingStrategy strategy = new Bubble();
        SortContext sortContext = new SortContext(strategy);
        sortContext.perform(arr);

        strategy = new Quick();
        sortContext.changeSort(strategy);
        sortContext.perform(arr);

        strategy = new Selection();
        sortContext.changeSort(strategy);
        sortContext.perform(arr);

        String ss = "Hello";


    }
}
