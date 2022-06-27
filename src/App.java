public class App {
    public static void main(String[] args) throws Exception {
        //Agent a1 = new Agent("Almeida", "Los Angeles", 109107, true);
        Operation op1 = new Operation("Presa Quebrada", 1, "Secreta");
        op1.statusOp();
        op1.finalizarOp();
        op1.statusOp();
        op1.iniciarOp();
        op1.statusOp();
        op1.finalizarOp();
        op1.iniciarOp();
        op1.statusOp();
        /*a1.status();
        a1.operar();*/
    }
}
