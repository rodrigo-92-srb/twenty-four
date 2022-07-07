public class Sea extends Vehicle {


    

    public Sea(int ident, int capac) {
        this.capacidade = capac;
        this.id = ident;
    }

    @Override
    public void movimentar() {
        System.out.println("Navegando...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando motores...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando motores...");
    }
    

}
