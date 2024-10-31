import java.util.Random;

/**
 * Classe Computador com atributos para identificar RAM, arquitetura, nível, disco e CPU
 * Define métodos para gerar especificações aleatórias e calcular o consumo de energia
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */


public class Computador {
    
    /**
     * identificador único do computador
     */
    protected int id;
    
    /**
     * quantidade de memória RAM do computador em GB
     */
    protected int ram;
    
    /**
     * capacidade do disco do computador em GB
     */
    protected int disco;
    
    /**
     * frequẽncia do processador do computador em GHz
     */
    protected double cpu; 
    
    /**
     * arquitetura do computador (ex.: "x64" para servidores/laptops, "ARM" para Raspberry Pis)
     */
    protected String arquitetura;
    
    /**
     * nivel do computador (ex.: "Edge" para laptops, "Iot" para Raspberry Pis, "Cloud" para servidores)
     */
    protected String nivel;

    /**
     * construtor Computador
     *
     * @param id           Identificador único do computador
     * @param arquitetura  Arquitetura do computador ("x64" ou "ARM")
     * @param nivel        Nível do computador ("Edge", "Iot" ou "Cloud")
     */
    public Computador(int id, String arquitetura, String nivel) {
        this.id = id;
        this.arquitetura = arquitetura;
        this.nivel = nivel;
    }

    /**
     * gerar specs aleatórias para o computador
     *
     * @param limiteInferiorRam   Limite inferior para a geração da RAM
     * @param limiteSuperiorRam   Limite superior para a geração da RAM
     * @param limiteInferiorDisco Limite inferior para a geração do disco
     * @param limiteSuperiorDisco Limite superior para a geração do disco
     * @param limiteInferiorCpu   Limite inferior para a geração do CPU
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

    // Métodos getter e setter com descrições

    /**
     * obter identificador do computador
     * 
     * @return ID do computador
     */
    public int getId() { return id; }

    /**
     * obter quantidade de memória RAM do computador
     * 
     * @return RAM do computador em GB
     */
    public int getRam() { return ram; }

    /**
     * defenir quantidade de memória RAM do computador
     * 
     * @param ram Quantidade de RAM em GB
     */
    public void setRam(int ram) { this.ram = ram; }

    /**
     * obter capacidade do disco do computador
     * 
     * @return Disco do computador em GB
     */
    public int getDisco() { return disco; }

    /**
     * defenir capacidade do disco do computador
     * 
     * @param disco Capacidade do disco em GB
     */
    public void setDisco(int disco) { this.disco = disco; }

    /**
     * obter frequência do CPU do computador
     * 
     * @return Frequência do CPU em GHz
     */
    public double getCpu() { return cpu; }

    /**
     * defenir frequência do CPU do computador
     * 
     * @param cpu Frequência do CPU em GHz
     */
    public void setCpu(double cpu) { this.cpu = cpu; }

    /**
     * obter arquitetura do computador
     * 
     * @return Arquitetura do computador (ex.: "x64", "ARM")
     */
    public String getArquitetura() { return arquitetura; }

    /**
     * defenir arquitetura do computador
     * 
     * @param arquitetura Arquitetura do computador (ex.: "x64", "ARM")
     */
    public void setArquitetura(String arquitetura) { this.arquitetura = arquitetura; }

    /**
     * obter nível do computador
     * 
     * @return Nível do computador (ex.: "Edge", "Iot", "Cloud")
     */
    public String getNivel() { return nivel; }

    /**
     * defenir nível do computador
     * 
     * @param nivel Nível do computador (ex.: "Edge", "Iot", "Cloud")
     */
    public void setNivel(String nivel) { this.nivel = nivel; }

    /**
     * calcular consumo de energia do computador
     *
     * @return Consumo energético em watts
     */
    public double calcularConsumo() { return 0.0; }  
}
