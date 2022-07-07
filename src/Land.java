public class Land extends Vehicle{

    public Land(int ident, int capac) {
        this.capacidade = capac;
        this.id = ident;
    }

    @Override
    public void movimentar() {
        System.out.println("Movendo...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o motor...");
        
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o motor");
    }
    
}
