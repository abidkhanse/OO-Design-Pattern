package src.creational.singleton.thread_not_safe;

public class SingletonNotThreadSafe {

    private static SingletonNotThreadSafe instance;

    SingletonNotThreadSafe() {}

    public static SingletonNotThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonNotThreadSafe();
        }
        return instance;
    }

    public void message() {
        System.out.println("Hello from SingletonNotThreadSafe class");
    }

}
