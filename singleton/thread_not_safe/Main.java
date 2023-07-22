package singleton.thread_not_safe;

public class Main {


    public static void main(String[] args) {

        SingletonNotThreadSafe singletonNotThreadSafe = SingletonNotThreadSafe.getInstance();
        singletonNotThreadSafe.message();

    }

}
