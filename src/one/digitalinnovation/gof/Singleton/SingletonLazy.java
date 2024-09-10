package one.digitalinnovation.gof.Singleton;

/**
 * // * SingletonLazy
 * Singleton "preguiçoso"
 *
 * @author BrunoDev2003
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        // Construtor privado
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;

    }
}
