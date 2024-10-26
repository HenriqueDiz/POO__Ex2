import java.util.Random;

public class Computador {
    protected int id, ram, disco;
    protected double cpu;                       // NÍVEL: laptop = Edge, Raspberrys Pis = Iot, servidor = Cloud
    protected String arquitetura, nivel;        // ARQUITETURA: x64 - Servidores/Laptops, ARM - Raspberrys Pis
    
    // Construtor 
    public Computador(int id, String arquitetura, String nivel) {
        this.id = id;
        this.arquitetura = arquitetura;
        this.nivel = nivel;
    }

    // Método para gerar especificações aleatórias conforme os limites passados
    public void generateSpecs(int limiteInferiorRam, int limiteSuperiorRam, int limiteInferiorDisco, int limiteSuperiorDisco, double limiteInferiorCpu, double limiteSuperiorCpu){
        Random rand = new Random();
        this.ram = (int) Math.pow(2, rand.nextInt(limiteSuperiorRam - limiteInferiorRam + 1) + limiteInferiorRam);
        this.disco = (int) Math.pow(2, rand.nextInt(limiteSuperiorDisco - limiteInferiorDisco + 1) + limiteInferiorDisco);
        this.cpu = limiteInferiorCpu + rand.nextDouble() * (limiteSuperiorCpu - limiteInferiorCpu);   //consideramos o intervalo todo entre inf e sup do cpu
    }

    // Método para imprimir as especificações do computador
    public void imprimirComputador() {
        System.out.printf("ID = %d\nRAM = %d GB\nDISK = %d GB\nCPU = %.2f GHz\nARM/x64 = %s\nNÍVEL = %s\n\n", id, ram, disco, cpu, arquitetura, nivel);
    }

    // Método abstrato
    public double calcularConsumo() {return 0.0;}
}
