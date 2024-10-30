import java.util.ArrayList;

/**
 * Classe do lab 
 * contem computadores
 * inicializa stock
 * calcula também consumo energetico
 */
public class NCSLab {
    private ArrayList<Computador> stock;

    /**
     * construtor do lab 
     * stock inicial de computadores
     */
    public NCSLab() {
        stock = new ArrayList<>(15); // stock inicial de 15 computadores
    }

    /**
     * gerar stock do lab
     * computadores de diferentes tipos
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
     * print specs de todos os computadores nesse stock
     */
    public void imprimirTodosComputadores() {
        for (Computador c : stock) {
            c.imprimirComputador();
        }
    }

    /**
     * print specs de todos os computadores x64
     */
    public void imprimirX64() {
        for (Computador c : stock) {
            if (c.getArquitetura().equals("x64")) {
                c.imprimirComputador();
            }
        }
    }

    /**
     * calculo e print do consumo energetico de todos os computadores nesse stock
     */
    public void calcularConsumo() {
        for (Computador c : stock) {
            System.out.printf("ID %d - Consumo = %.2f W\n\n", c.getId(), c.calcularConsumo());
        }
    }
}
