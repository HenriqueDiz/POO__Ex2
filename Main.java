/**
 * Classe Main inicializa o stock com os diferentes tipos de computadores,
 * imprime as características dos computadores e calcula o consumo energético.
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class Main {
    /**
     * Construtor padrão da classe Main.
     */
    public Main() {}

    /**
     * Método principal para iniciar a aplicação
     *
     * @param args Argumentos da linha de comando (não utilizado) 
     */
    public static void main(String[] args) {
        NCSLab lab = new NCSLab();  // Criação do laboratório
        lab.initializeStock();      // Inicialização do stock

        System.out.println("\n///// Database Computadores /////\n");
        lab.imprimirTodosComputadores(); // Imprime todos os computadores

        System.out.println("\n///// Computadores x64 /////\n");
        lab.imprimirX64();               // Imprime todos os computadores x64

        System.out.println("\n///// Consumo Energético /////\n");
        lab.calcularConsumo();           // Imprime o consumo energético de cada computador
    }
}
