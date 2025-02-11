import java.util.ArrayList;

/**
 * Classe NCSLab que representa um laboratório com um stock de computadores.
 * Esta classe permite inicializar o stock com diferentes tipos de computadores,
 * imprimir as características dos computadores e calcular o consumo energético.
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class NCSLab {
    private ArrayList<Computador> stock;

    /**
     * Construtor da classe NCSLab - Stock inicial de computadores
     */
    public NCSLab() {
        stock = new ArrayList<>(15); // Stock inicial de 15 computadores
    }

    /**
     * Inicializa o stock com 5 computadores de cada tipo
     */
    public void initializeStock() {
        int id = 1;
        for (int i = 0; i < 5; i++) {
            stock.add(new Servidor(id++));
            stock.add(new Laptop(id++));
            stock.add(new RaspberrysPis(id++));
        }
    }

    /**
     * Imprime as características de todos os computadores no stock
     */
    public void imprimirTodosComputadores() {
        for (Computador c : stock) {
            c.imprimirComputador();
        }
    }

    /**
     * Imprime as características de todos os computadores com arquitetura x64
     */
    public void imprimirX64() {
        for (Computador c : stock) {
            if (c.getArquitetura().equals("x64")) {
                c.imprimirComputador();
            }
        }
    }

    /**
     * Calcula e imprime o consumo energético de todos os computadores no stock
     */
    public void calcularConsumo() {
        for (Computador c : stock) {
            System.out.printf("ID %d - Consumo = %.2f W\n\n", c.getId(), c.calcularConsumo());
        }
    }
}
