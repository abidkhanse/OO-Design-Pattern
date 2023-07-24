package src.behavioral.strategy.sort;

public class SortContext {

    private SortingStrategy strategy;

    SortContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeSort(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void perform(int arr[]) {
        strategy.sort(arr);
    }

}
