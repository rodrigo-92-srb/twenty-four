public class Air extends Vehicle{

    public Air(int ident, int capac) {
        this.capacidade = capac;
        this.id = ident;
    }

    @Override
    public void movimentar() {
        System.out.println("Sobrevoando...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando turbinas...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando turbinas...");
    }
    
    public void identificarAlvo(){
        System.out.println("Identificando alvo...");
    }

    public void identificarAlvo(String nomeSuspeito){
        System.out.println("Identificando "+nomeSuspeito+" ...");
    }


}
