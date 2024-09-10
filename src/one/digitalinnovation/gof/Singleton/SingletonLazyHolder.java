package one.digitalinnovation.gof.Singleton;

/*
 * SingletonLazyHolder
 * Singleton "preguiçoso" com inicialização tardia
 * @see <a href = "https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern"</a>
 * @author BrunoDev2003
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
