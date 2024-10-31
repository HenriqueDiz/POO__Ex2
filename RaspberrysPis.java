/**
 * Classe Raspberry Pi com arquitetura ARM e nivel Iot
 * 
 * @author Henrique Diz
 * @author Tomás Gonçalves
 * @version 1.0
 * 
 */
public class RaspberrysPis extends Computador {

    /**
     * construtor da classe RaspberrysPis
     *
     * @param id id de cada Raspberry
     */
    public RaspberrysPis(int id) {
        super(id, "ARM", "Iot");
        generateSpecs(1, 3, 4, 7, 1.0);
    }

    /**
     * consumo energia do Raspberry
     *
     * @return consumo em watts
     */
    @Override
    public double calcularConsumo() {
        return 10 * this.cpu;
    }
}
