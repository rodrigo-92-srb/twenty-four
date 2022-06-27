
public class Operation implements CenterOp{
    
    private String nomeOp;
    private int id;
    private String tipo;
    /*
      private DateFormat dataInicio;
      private DateFormat dataFinal;
    */
    private String estadoOp;

    public Operation(String nameOp, int id, String type) {
        this.nomeOp = nameOp;
        this.id = id;
        this.tipo = type;
        this.estadoOp = "Criada";
    }

    private String getNomeOp() {
        return nomeOp;
    }

    private void setNomeOp(String nomeOp) {
        this.nomeOp = nomeOp;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getEstadoOp() {
        return estadoOp;
    }

    private void setEstadoOp(String estadoOp) {
        this.estadoOp = estadoOp;
    }

    @Override
    public void statusOp() {
        System.out.println("-----------------------------");
        System.out.println("Operação: "+this.getNomeOp());
        System.out.println("Estado: "+this.getEstadoOp());
        System.out.println("-----------------------------");
    }

    @Override
    public void iniciarOp() {
        if(this.getEstadoOp().equals("Criada")){
            System.out.println("Iniciando operação...");
            this.setEstadoOp("Em progresso");
            System.out.println("Operação em progresso.");
        }else if(this.getEstadoOp().equals("Em progresso")){
            System.out.println("Erro! Operação em progresso...");
        }else{
            System.out.println("Erro! Operação já foi finalizada.");
        }
    }

    @Override
    public void finalizarOp() {
        if(this.getEstadoOp().equals("Criada")){
            System.out.println("Erro! Operação ainda não foi iniciada.");
        }else if(this.getEstadoOp().equals("Em progresso")){
            System.out.println("Finalizando operação...");
            this.setEstadoOp("Finalizada");
            System.out.println("Operação foi finalizada.");
        }else{
            System.out.println("Erro! Operação já foi finalizada.");
        }
    }
 
}
