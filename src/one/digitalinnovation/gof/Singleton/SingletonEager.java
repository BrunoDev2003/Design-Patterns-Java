package one.digitalinnovation.gof.Singleton;

/*
 * SingletonEager "apressado"
 * @author BrunoDev2003
 * apressado vai sempre instanciar o atributo direto sem uma validação de que a instancia existe ou não
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        // Construtor privado
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;

    }
}
