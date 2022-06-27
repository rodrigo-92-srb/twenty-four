public class App {
    public static void main(String[] args) throws Exception {
        Agente a1 = new Agente("Almeida", "Los Angeles", 109107, true);
        //operando é privado a1.operando = true;
        a1.status();
        a1.operar();
        a1.cancelarOp();
        a1.operar();
    }
}
