package Teste;

import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;
import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        // Teste dos Singleton
        System.out.println("Teste SingletonEager:");
        SingletonEager instancia1 = SingletonEager.getInstancia();
        SingletonEager instancia2 = SingletonEager.getInstancia();
        System.out.println("instancia1 == instancia2: " + (instancia1 == instancia2)); // Espera-se true

        System.out.println("\nTeste SingletonLazy:");
        SingletonLazy instancia3 = SingletonLazy.getInstancia();
        SingletonLazy instancia4 = SingletonLazy.getInstancia();
        System.out.println("instancia3 == instancia4: " + (instancia3 == instancia4)); // Espera-se true

        System.out.println("\nTeste SingletonLazyHolder:");
        SingletonLazyHolder instancia5 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder instancia6 = SingletonLazyHolder.getInstancia();
        System.out.println("instancia5 == instancia6: " + (instancia5 == instancia6)); // Espera-se true

        // Teste da Estratégia
        System.out.println("\nTeste da Estratégia:");
        Robo robo = new Robo();

        // Configura o Robo para usar o comportamento normal e executa
        robo.setComportamento(new ComportamentoNormal());
        System.out.println("Teste 1:");
        robo.mover(); // Espera-se imprimir: Movendo-se normalmente.

        // Configura o Robo para usar o comportamento defensivo e executa
        robo.setComportamento(new ComportamentoDefensivo());
        System.out.println("Teste 2:");
        robo.mover(); // Espera-se imprimir: Movendo-se defensivamente.

        // Configura o Robo para usar o comportamento agressivo e executa
        robo.setComportamento(new ComportamentoAgressivo());
        System.out.println("Teste 3:");
        robo.mover(); // Espera-se imprimir: Movendo-se agressivamente.

        // Teste do Facade
        System.out.println("\nTeste Facade:");
        Facade facade = new Facade();
        facade.migrarCliente("Vitor", "12456789"); // Espera-se imprimir os detalhes do cliente
    }
}