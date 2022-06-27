public class Agente {
    public String nome;
    public String cidade;
    protected int id;
    private boolean operando;
    /* Atributo operando é privado pois só o agente tem acesso a essa informação 
       desta forma, se precisamos de determinado agente, fazemos a chamada dos métodos
       operar(), cancelarOp() ou FinalizarOp() e este método faz a modificação do 
       atributo operando.
    */ 

    public void status(){
        System.out.println("Identificação: "+ this.id);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cidade: "+ this.cidade);
        System.out.println("Em operação? " + this.operando);
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
}
