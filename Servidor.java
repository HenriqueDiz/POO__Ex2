public class Servidor extends Computador{

	public Servidor(int id){
		super(id, "x64","Cloud");
		generateSpecs(3, 7, 4, 10, 3.0);
	}

	public double calcularConsumo(){
		return 80 * this.cpu; //form p servidores
	}
}