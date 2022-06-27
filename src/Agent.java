public class Agent {
    private String nome;
    private String cidade;
    protected int id;
    private boolean operando;
   
    public Agent(String name, String city, int i, boolean op){
        this.setNome(name);
        this.setCidade(city);
        this.registrarAgente(i);
        this.setOperando(op);
    }
    
    public void registrarAgente(int id){
        this.setId(id);
    }
    
    public void status(){
        System.out.println("-----------------------------");
        System.out.println("Identificação: "+ this.getId());
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Cidade: "+ this.getCidade());
        System.out.println("Em operação? " + this.isOperando());
        System.out.println("-----------------------------");
    }

    protected void operar(){
        System.out.println("Solcitando agente...");
        if(operando){
            System.out.println("Erro! Agente já está em uma operação.");
        }
        else{
            this.operando = true;
            System.out.println("Entendido. Agente entrou em operação.");
        }
    }

    protected void cancelarOp(){
        this.operando=false;
        System.out.println("Entendido. Agente cancelou operação.");
    }

    protected void FinalizarOp(){
        this.operando=false;
        System.out.println("Entendido. Agente finalizou operação.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOperando() {
        return operando;
    }

    public void setOperando(boolean operando) {
        this.operando = operando;
    }

    
}
