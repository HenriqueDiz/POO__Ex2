/**
 * Classe servidor
 * arquitetura x64 e nivel Cloud
 */
public class Servidor extends Computador {

    /**
     * construtor da classe Servidor
     *
     * @param id id de cada servidor
     */
    public Servidor(int id) {
        super(id, "x64", "Cloud");
        generateSpecs(7, 9, 10, 14, 3.0);
    }

    /**
     * consumo energia do servidor
     *
     * @return consumo em watts
     */
    public double calcularConsumo() {
        return 80 * this.cpu;
    }
}
