public class Servidor extends Computador{

	public Servidor(int id){
		super(id, "x64","Cloud");
		generateSpecs(7, 9, 10, 13, 3.0);
	}
	public double calcularConsumo(){
		return 80 * this.cpu;
	}
}
