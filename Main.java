public class Main{
    public static void main(String[] args){
        NCSLab lab = new NCSLab();
        lab.initializeStock();

        System.out.println();
        System.out.println(" ///// Database Computadores ///// ");
        System.out.println();
        lab.imprimirTodosComputadores();

        System.out.println();
        System.out.println(" ///// Computadores x64 ///// ");
        System.out.println();
        lab.imprimirX64();

        System.out.println();
        System.out.println(" ///// Consumo Energético ///// ");
        System.out.println();
        lab.calcularConsumo();
    }
}