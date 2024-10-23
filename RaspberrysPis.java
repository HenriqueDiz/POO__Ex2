import java.util.Random;

public class RaspberrysPis extends Computador{

	public RaspberrysPis(int id){
		super(id, "ARM", "Iot");
	}

	@Override  //opcional... faz com que este metodo se sobreponha ao da superclasse
	public void generateSpecs(){
		Random rnd = new Random();

		int[] opcoesRam = {2, 4, 8};
		this.ram = opcoesRam[rnd.nextInt(opcoesRam.length)];

		int[] opcoesDisco = {16, 32, 64, 128};
		this.disco = opcoesDisco[rnd.nextInt(opcoesDisco.length)];

		this.cpu = 1.0 + (rnd.nextDouble() * (2.0 - 1.0));
	}

	@Override  //opcional... faz com que este metodo se sobreponha ao da superclasse
	public double calcularConsumo(){
		return 10 * this.cpu;
	}
}