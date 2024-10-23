import java.util.Random;

public class Laptop extends Computador{

	private boolean temGPU;

	public Laptop(int id){
		super(id, "x64", "Edge");
		this.temGPU = new Random().nextBoolean();   // Generate GPU boolean
		generateSpecs(3, 4, 3, 8, 2.0);
	}

	public double calcularConsumo(){
		return temGPU ? (50 * this.cpu) : (40*this.cpu);
	}
}