/**
 * Classe main que inicializa o lab de computadores
 * print das specs de cada computador 
 * calcula consumo energético
 */
public class Main {
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
