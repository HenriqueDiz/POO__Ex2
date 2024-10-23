public class Main{
    public static void main(String[] args){
        NCSLab lab = new NCSLab();
        lab.initializeStock();

        System.out.println("\n///// Database Computadores /////\n");
        lab.imprimirTodosComputadores();

        System.out.println("\n///// Computadores x64 /////\n");
        lab.imprimirX64();

        System.out.println("\n///// Consumo Energético /////\n");
        lab.calcularConsumo();
    }
}