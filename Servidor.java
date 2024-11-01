/**
 * Classe Servidor com arquitetura x64 e nível Cloud
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class Servidor extends Computador {

    /**
     * Construtor da classe Servidor
     *
     * @param id Id de cada servidor
     */
    public Servidor(int id) {
        super(id, "x64", "Cloud");
        generateSpecs(7, 9, 10, 14, 3.0);
    }

    /**
     * Calcula o consumo de energia do servidor
     *
     * @return Consumo em watts
     */
    @Override
    public double calcularConsumo() {
        return 80 * this.cpu;
    }
}
