package singleton.thread_not_safe.thread_safe;

public class Main {

    public static void main(String[] args) {
        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance();
        singletonThreadSafe.getMessage();
    }

}
