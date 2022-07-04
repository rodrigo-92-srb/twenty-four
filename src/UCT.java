public class UCT extends Unit{
    
    private int bombasDesarmadas;
    

    public UCT(String nome, int capacidade, int bombasDesarmadas) {
        super(nome, capacidade);
        this.bombasDesarmadas = bombasDesarmadas;
    }

    public void  DesarmarBomba(){
        System.out.println("Bomba desarmada com sucesso!");
        this.bombasDesarmadas++;
        System.out.println("Unidade: "+ this.getNome() +" - Bombas desarmadas: "+ this.getBombasDesarmadas());
    }

    public int getBombasDesarmadas() {
        return bombasDesarmadas;
    }

    public void setBombasDesarmadas(int bombasDesarmadas) {
        this.bombasDesarmadas = bombasDesarmadas;
    }

    @Override
    public String toString() {
        return "UCT [bombasDesarmadas=" + bombasDesarmadas + "]";
    }

    
    
}
