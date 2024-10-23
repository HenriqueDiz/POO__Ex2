import java.util.Random;

public class Laptop extends Computador{

	private boolean temGPU;

	public Laptop(int id){
		super(id, "x64", "Edge");
		Random rnd = new Random();
		this.temGPU = rnd.nextBoolean();  //pode randomly ter gpu ou nao... misterio
	}

	@Override  //opcional... faz com que este metodo se sobreponha ao da superclasse
	public void generateSpecs(){
		Random rnd = new Random();
		int[] opcoesRam = {16, 32, 64}; // mm cena dos servidores
		this.ram = opcoesRam[rnd.nextInt(opcoesRam.length)];

		int[] opcoesDisco = {256, 512, 1024};
		this.disco = opcoesDisco[rnd.nextInt(opcoesDisco.length)];

		this.cpu = 2.0 + (rnd.nextDouble() * (3.0 - 2.0));  //entre 2 e 3 ghz
	}

	//meter isto num if (...)
	public double calcularConsumo(){
		return temGPU ? (50 * this.cpu) : (40*this.cpu);  //(...)se tem : (...) se n tem
	}
}