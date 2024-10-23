public class RaspberrysPis extends Computador{

	public RaspberrysPis(int id){
		super(id, "ARM", "Iot");
		generateSpecs(3, 1, 4, 5, 1.0);
	}

	public double calcularConsumo(){
		return 10 * this.cpu;
	}
}