public class Computador {
    protected int id;
    protected int ram;
    protected int disco;
    protected double cpu;
    protected String arquitetura; // x64 - Servidores e Laptops, ARM - Raspberrys Pis
    protected String nivel;       // laptop = Edge, Raspberrys Pis = Iot, servidor = Cloud
    
    public Computador(int id, int ram, int disco, double cpu, String arquitetura, String nivel) {
        this.id = id;
        this.ram = ram;
        this.disco = disco;
        this.cpu = cpu;
        this.arquitetura = arquitetura;
        this.nivel = nivel;
    }

    public int getId() {return id;}

    public int getRam() {return ram;}

    public int getDisco() {return disco;}

    public double getCpu() {return cpu;}

    public String getArquitetura() {return arquitetura;}

    public String getnivel() {return nivel;}

    public void imprimirComputador() {
        System.out.println("ID: " + id + " RAM: " + ram + "GB DISK: " + disco + "GB CPU: " + cpu + "GHz NÍVEL: " + nivel);
    }
}
