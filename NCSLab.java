import java.util.ArrayList;

public class NCSLab {
    private ArrayList<Computador> stock;
    
    public NCSLab() {
        stock = new ArrayList<>(15);  // Stock inicial de 15 computadores
    }

    public void initializeStock() {
        int id = 1;
        for (int i = 0; i < 5; i++) {
            stock.add(new Servidor(id++));
            stock.add(new Laptop(id++));
            stock.add(new RaspberrysPis(id++));
        }
    }

    public void imprimirTodosComputadores(){
        for(Computador c : stock){
            c.imprimirComputador();
        }
    }

    public void imprimirX64() {
        for(Computador c : stock){
            if(c.arquitetura.equals("x64")){
                c.imprimirComputador();
            }
        }
    }

    public void calcularConsumo(){
        for(Computador c : stock){
            System.out.printf("ID %d - Consumo = %.2f W\n\n", c.id, c.calcularConsumo());
        }
    }           
}