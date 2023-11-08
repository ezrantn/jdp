package SingletonPattern.App;

import SingletonPattern.Data.finalSingleton;

public class SingletonApp {
    public static void main(String[] args) {
        System.out.println("If you see the same value, " +
                "then, singleton was caused (yay!)" +
                "" + "\n" +
                "if you use different values, " +
                "then 2 singletons were created (booo) " +
                "\n\n" + "RESULT:" + "\n");

        finalSingleton singleton = finalSingleton.getInstance("FOO");
        finalSingleton anotherSingleton = finalSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
