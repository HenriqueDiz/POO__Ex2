import java.util.Random;

/**
 * Classe Laptop com arquitetura x64 e nível Edge
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class Laptop extends Computador {

    private boolean temGPU;

    /**
     * Construtor da classe Laptop
     *
     * @param id Id de cada laptop
     */
    public Laptop(int id) {
        super(id, "x64", "Edge");
        this.temGPU = new Random().nextBoolean(); // Gera aleatoriamente a presença de GPU
        generateSpecs(4, 6, 8, 10, 2.0);
    }

    /**
     * Calcula o consumo de energia do laptop de acordo com a presença de GPU
     *
     * @return Consumo em watts
     */
    @Override
    public double calcularConsumo() {
        return temGPU ? (60 * this.cpu) : (50 * this.cpu);
    }

    /**
     * Retorna se o laptop tem GPU
     * 
     * @return true se tem GPU, false caso contrário
     */
    public boolean isTemGPU() { return temGPU; }

    /**
     * Define se o laptop tem GPU
     * 
     * @param temGPU true se tem GPU, false caso contrário
     */
    public void setTemGPU(boolean temGPU) { this.temGPU = temGPU; }
}
