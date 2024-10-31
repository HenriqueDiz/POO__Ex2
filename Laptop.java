import java.util.Random;

/**
 * Classe laptop - pode ou não ter GPU
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */


public class Laptop extends Computador {

    private boolean temGPU;

    /**
     * construtor da classe Laptop
     *
     * @param id id de cada laptop
     */
    public Laptop(int id) {
        super(id, "x64", "Edge");
        this.temGPU = new Random().nextBoolean(); // Generate GPU boolean
        generateSpecs(4, 6, 8, 10, 2.0);
    }

    /**
     * consumo de energia do laptop
     * consumo varia com a presença de GPU
     *
     * @return consumo em watts
     */
    @Override
    public double calcularConsumo() {
        return temGPU ? (50 * this.cpu) : (40 * this.cpu);
    }

    public boolean isTemGPU() { return temGPU; }

    public void setTemGPU(boolean temGPU) { this.temGPU = temGPU; }
}
