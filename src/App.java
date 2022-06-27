public class App {
    public static void main(String[] args) throws Exception {
        Agente a1 = new Agente();
        a1.id = 109107;
        a1.cidade = "Los Angeles";
        a1.nome = "Almeida";
        //operando é privado a1.operando = true;
        a1.status();
        a1.operar();
        a1.cancelarOp();
        a1.operar();
    }
}
