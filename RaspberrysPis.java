/**
 * Classe RaspberryPis com arquitetura ARM e nível Iot
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */

public class RaspberrysPis extends Computador {

    /**
     * Construtor da classe RaspberrysPis
     *
     * @param id Id de cada Raspberry Pi
     */
    public RaspberrysPis(int id) {
        super(id, "ARM", "Iot");
        generateSpecs(1, 3, 4, 7, 1.0);
    }

    /**
     * Calcula o consumo de energia do Raspberry Pi
     *
     * @return Consumo em watts
     */
    @Override
    public double calcularConsumo() {
        return 20 * this.cpu;
    }
}
