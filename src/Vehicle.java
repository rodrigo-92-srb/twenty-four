public abstract class Vehicle {
    
    protected int id;
    protected int capacidade;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public abstract void movimentar();
    public abstract void ligar();
    public abstract void desligar();
    
}
