public abstract class Unit {
    private String nome;
    private int capacidade;
    private String status;

    public Unit(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.status = "Disponível";
    }

    public void acionarUnidade(){
        if(this.status.equals("Ocupada")){
            System.out.println("Erro! Unidade ocupada no momento.");
        }else{
            System.out.println("Unidade acionada e indo ao local.");
            this.status="Ocupada";
        }
    }

    public void dispensarUnidade(){
            System.out.println("Unidade disponível.");
            this.status="Disponível";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEstado() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Unit [capacidade:" + capacidade + ", nome:" + nome + ", status:" + status + "]";
    }

    
}
