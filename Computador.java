import java.util.Random;

/**
 * Classe Computador com os atributos RAM, arquitetura, nível, disco e CPU.
 * Define métodos para gerar especificações aleatórias e calcular o consumo de energia.
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class Computador {
    
    /**
     * Identificador único do computador
     */
    protected int id;
    
    /**
     * Quantidade de memória RAM do computador em GB
     */
    protected int ram;
    
    /**
     * Capacidade do disco do computador em GB
     */
    protected int disco;
    
    /**
     * Frequência do processador do computador em GHz
     */
    protected double cpu; 
    
    /**
     * Arquitetura do computador ("x64" para servidores e laptops, "ARM" para Raspberry Pis)
     */
    protected String arquitetura;
    
    /**
     * Nível do computador ("Edge" para laptops, "Iot" para Raspberry Pis, "Cloud" para servidores)
     */
    protected String nivel;

    /**
     * Construtor da classe Computador
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
     * Gera as características de forma aleatória para o computador
     *
     * @param limiteInferiorRam   Limite inferior para a geração da RAM
     * @param limiteSuperiorRam   Limite superior para a geração da RAM
     * @param limiteInferiorDisco Limite inferior para a geração do disco
     * @param limiteSuperiorDisco Limite superior para a geração do disco
     * @param limiteInferiorCpu   Limite inferior para a geração do CPU
     */
    public void generateSpecs(int limiteInferiorRam, int limiteSuperiorRam, int limiteInferiorDisco, int limiteSuperiorDisco, double limiteInferiorCpu) {
        Random rand = new Random();
        double cpuTemp = rand.nextDouble();
        this.ram = (int) Math.pow(2, rand.nextInt(limiteSuperiorRam - limiteInferiorRam + 1) + limiteInferiorRam);
        this.disco = (int) Math.pow(2, rand.nextInt(limiteSuperiorDisco - limiteInferiorDisco + 1) + limiteInferiorDisco);
        this.cpu = cpuTemp < 0.99 ? limiteInferiorCpu + cpuTemp : limiteInferiorCpu + 1.0;
    }

    /**
     * Imprime as características do computador
     */
    public void imprimirComputador() {
        System.out.printf("ID = %d\nRAM = %d GB\nDISCO = %d GB\nCPU = %.2f GHz\nARQUITETURA = %s\nNÍVEL = %s\n\n", id, ram, disco, cpu, arquitetura, nivel);
    }

    /**
     * Retorna o identificador do computador
     * 
     * @return ID do computador
     */
    public int getId() { return id; }

    /**
     * Retorna a quantidade de memória RAM do computador
     * 
     * @return RAM do computador em GB
     */
    public int getRam() { return ram; }

    /**
     * Define a quantidade de memória RAM do computador
     * 
     * @param ram Quantidade de RAM em GB
     */
    public void setRam(int ram) { this.ram = ram; }

    /**
     * Retorna a capacidade do disco do computador
     * 
     * @return Disco do computador em GB
     */
    public int getDisco() { return disco; }

    /**
     * Define a capacidade do disco do computador
     * 
     * @param disco Capacidade do disco em GB
     */
    public void setDisco(int disco) { this.disco = disco; }

    /**
     * Retorna a frequência do CPU do computador
     * 
     * @return Frequência do CPU em GHz
     */
    public double getCpu() { return cpu; }

    /**
     * Define a frequência do CPU do computador
     * 
     * @param cpu Frequência do CPU em GHz
     */
    public void setCpu(double cpu) { this.cpu = cpu; }

    /**
     * Retorna a arquitetura do computador
     * 
     * @return Arquitetura do computador ("x64" ou "ARM")
     */
    public String getArquitetura() { return arquitetura; }

    /**
     * Define a arquitetura do computador
     * 
     * @param arquitetura Arquitetura do computador ("x64" ou "ARM")
     */
    public void setArquitetura(String arquitetura) { this.arquitetura = arquitetura; }

    /**
     * Retorna o nível do computador
     * 
     * @return Nível do computador ("Edge", "Iot" ou "Cloud")
     */
    public String getNivel() { return nivel; }

    /**
     * Define o nível do computador
     * 
     * @param nivel Nível do computador ("Edge", "Iot" ou "Cloud")
     */
    public void setNivel(String nivel) { this.nivel = nivel; }

    /**
     * Calcula o consumo de energia do computador
     *
     * @return Consumo energético em watts
     */
    public double calcularConsumo() { return 0.0; }  
}
