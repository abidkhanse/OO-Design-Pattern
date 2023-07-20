package singleton.thread_not_safe.thread_safe;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance;

    public static SingletonThreadSafe getInstance() {

        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                instance = new SingletonThreadSafe();
            }
        }

        return instance;
    }

    public void getMessage() {
        System.out.println("Hello from SingletonThreadSafe class");
    }

}
