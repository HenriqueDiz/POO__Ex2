//a nossa Superclass

public class Computador {
    protected int id;
    protected int ram;
    protected int disco;
    protected double cpu;
    protected String arquitetura; // x64 - Servidores e Laptops, ARM - Raspberrys Pis
    protected String nivel;       // laptop = Edge, Raspberrys Pis = Iot, servidor = Cloud
    
    public Computador(int id, String arquitetura, String nivel) { //novo comp
        this.id = id;
        this.arquitetura = arquitetura;
        this.nivel = nivel;

        generateSpecs(); //specs diferents em cada computador
    }

    //met generico pa obter as specs
    public void generateSpecs(){
        System.out.println("Specs: ");
    }

    //met generico pos consumos energetico
    public double calcularConsumo(){
        return 50*cpu;
    }

    public void imprimirComputador() {
        System.out.println("ID= " + id + "\nRAM = " + ram + " GB\nDISK = " + disco + " GB\nCPU = " + cpu + " GHz\nARM/x64 = " + arquitetura + "\nNÍVEL = " + nivel + " \n\n");    
    }
}