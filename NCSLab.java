import java.util.ArrayList;

public class NCSLab {
    private ArrayList<Computador> stock;
    
    public NCSLab() {
        stock = new ArrayList<>(15);
    }

    public void initializeStock() {
        int id = 1;
        for (int i = 0; i < 5; i++) {
            stock.add(new Servidor(++id));
            stock.add(new Laptop(++id));
            stock.add(new RaspberrysPis(++id));
        }
    }
}