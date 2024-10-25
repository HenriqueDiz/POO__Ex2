public class RaspberrysPis extends Computador{

	public RaspberrysPis(int id){
		super(id, "ARM", "Iot");
		generateSpecs(1, 3, 4, 7, 1.0);
	}

	public double calcularConsumo(){
		return 10 * this.cpu;
	}
}