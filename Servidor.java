import java.util.Random;

public class Servidor extends Computador{

	public Servidor(int id){
		super(id, "x64","Cloud");
	}

	@Override  //opcional... faz com que este metodo se sobreponha ao da superclasse
	public void generateSpecs(){
		Random rnd = new Random();

		int[] opcoesRam = {128, 256, 512}; //rams em GB portanto pot de 2
		this.ram = opcoesRam[rnd.nextInt(opcoesRam.length)];

		int[] opcoesDisco = {1024, 2048, 4096, 8192, 10240}; //potencias de 2 tbm
		this.disco = opcoesDisco[rnd.nextInt(opcoesDisco.length)];

		this.cpu = 3.0 + (rnd.nextDouble() * (4.0 - 3.0)); //o cpu esta entre 3 e 4 ghz
	}

	@Override  //opcional... faz com que este metodo se sobreponha ao da superclasse
	public double calcularConsumo(){
		return 80 * this.cpu; //form p servidores
	}
}