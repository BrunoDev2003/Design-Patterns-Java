import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);


    }
}