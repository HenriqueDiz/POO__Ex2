import java.util.Random;

/**
 * Classe Computador 
 * com atributos para identificar RAM, arquitetura, nivel, disk e CPU
 */


public class Computador {
    protected int id, ram, disco;
    protected double cpu; // NÍVEL: laptop = Edge, Raspberrys Pis = Iot, servidor = Cloud
    protected String arquitetura, nivel; // ARQUITETURA: x64 - Servidores/Laptops, ARM - Raspberrys Pis


    /**
     * construtor Computador
     *
     * @param id           identificador único computador
     * @param arquitetura  arquitetura computador (x64 ou ARM)
     * @param nivel        nivel computador (Edge, Iot ou Cloud)
     */


    public Computador(int id, String arquitetura, String nivel) {
        this.id = id;
        this.arquitetura = arquitetura;
        this.nivel = nivel;
    }


    /**
     * gerar specs aleatórias para o computador
     *
     * 
     * @param limiteInferiorRam   limite inferior RAM
     * @param limiteSuperiorRam   limite superior RAM
     * @param limiteInferiorDisco limite inferior disco
     * @param limiteSuperiorDisco limite superior disco
     * @param limiteInferiorCpu   limite inferior CPU
     */


    public void generateSpecs(int limiteInferiorRam, int limiteSuperiorRam, int limiteInferiorDisco,
                              int limiteSuperiorDisco, double limiteInferiorCpu) {
        Random rand = new Random();
        double cpuTemp = rand.nextDouble();
        this.ram = (int) Math.pow(2, rand.nextInt(limiteSuperiorRam - limiteInferiorRam + 1) + limiteInferiorRam);
        this.disco = (int) Math.pow(2, rand.nextInt(limiteSuperiorDisco - limiteInferiorDisco + 1) + limiteInferiorDisco);
        this.cpu = cpuTemp < 0.99 ? limiteInferiorCpu + cpuTemp : limiteInferiorCpu + 1.0;
    }


    /**
     * print das specs do computador
     */
    public void imprimirComputador() {
        System.out.printf("ID = %d\nRAM = %d GB\nDISK = %d GB\nCPU = %.2f GHz\nARM/x64 = %s\nNÍVEL = %s\n\n", id, ram, disco, cpu, arquitetura, nivel);
    }


    public int getId() { return id; }

    public int getRam() { return ram; }

    public void setRam(int ram) { this.ram = ram; }

    public int getDisco() { return disco; }

    public void setDisco(int disco) { this.disco = disco; }

    public double getCpu() { return cpu; }

    public void setCpu(double cpu) { this.cpu = cpu; }

    public String getArquitetura() { return arquitetura; }

    public void setArquitetura(String arquitetura) { this.arquitetura = arquitetura; }

    public String getNivel() { return nivel; }

    public void setNivel(String nivel) { this.nivel = nivel; }

    /**
     * calcular consumo de energia do computador 
     *
     * @return consumo energético em watts
     */
    public double calcularConsumo() { return 0.0; }  // Método abstrato
}
