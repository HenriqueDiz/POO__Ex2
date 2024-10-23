import java.util.Random;

public class Computador {
    protected int id, ram, disco;
    protected double cpu;                       // laptop = Edge, Raspberrys Pis = Iot, servidor = Cloud
    protected String arquitetura, nivel;        // x64 - Servidores e Laptops, ARM - Raspberrys Pis
    
    public Computador(int id, String arquitetura, String nivel) {
        this.id = id;
        this.arquitetura = arquitetura;
        this.nivel = nivel;
    }

    public void generateSpecs(int limiteInferiorRam, int limiteSuperiorRam, int limiteInferiorDisco, int limiteSuperiorDisco, double limiteSuperiorCpu) {
        this.ram = (int) Math.pow(2, new Random().nextInt(limiteInferiorRam) + limiteSuperiorRam); 
        this.disco = (int) Math.pow(2, new Random().nextInt(limiteInferiorDisco) + limiteSuperiorDisco);
        this.cpu = limiteSuperiorCpu + new Random().nextDouble();
    }

    public void imprimirComputador() {
        System.out.printf("ID = %d\nRAM = %d GB\nDISK = %d GB\nCPU = %.2f GHz\nARM/x64 = %s\nNÍVEL = %s\n\n", id, ram, disco, cpu, arquitetura, nivel);
    }

    // Método abstrato
    public double calcularConsumo() {return 0.0;}
}