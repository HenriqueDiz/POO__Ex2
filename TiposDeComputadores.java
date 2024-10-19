import java.util.Random;

class Servidor extends Computador {
    public Servidor(int id) {
        super(id, 0, 0, 0, "x64", "Cloud");
        generateSpecs();
    }

    private void generateSpecs() {
        this.ram = (int) Math.pow(2, new Random().nextInt(3) + 7); // 128-512 GB
        this.disco = (int) Math.pow(2, new Random().nextInt(4) + 10); // 1024-10240 GB
        this.cpu = 3.0 + new Random().nextDouble(); // 3.0-4.0 GHz
    }

    public double calcularConsumoEnergetico() {
        return 80 * this.getCpu();
    }
    
}

class Laptop extends Computador {
    public Laptop(int id) {
        super(id, 0, 0, 0, "x64", "Edge");
        generateSpecs();
    }

    private void generateSpecs() {
        this.ram = (int) Math.pow(2, new Random().nextInt(3) + 4); // 16-64 GB
        this.disco = (int) Math.pow(2, new Random().nextInt(3) + 8); // 256-1024 GB
        this.cpu = 2.0 + new Random().nextDouble(); // 2.0-3.0 GHz
    }
    // TO CHANGE
    public double calcularConsumoEnergetico() {
        return (50 * 1.2) * this.getCpu(); // Como assim se não tiver GPU?
    }
}

class RaspberrysPis extends Computador {
    public RaspberrysPis(int id) {
        super(id, 0, 0, 0, "ARM", "Iot");
        generateSpecs();
    }

    private void generateSpecs() {
        this.ram = (int) Math.pow(2, new Random().nextInt(3) + 1); // 2-8 GB
        this.disco = (int) Math.pow(2, new Random().nextInt(4) + 4); // 16-128 GB
        this.cpu = 1.0 + new Random().nextDouble(); // 1.0-2.0 GHz
    }

    public double calcularConsumoEnergetico() {
        return 20 * this.getCpu();
    }
}


