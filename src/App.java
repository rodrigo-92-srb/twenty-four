public class App {
    public static void main(String[] args) throws Exception {
        Agent a1 = new Agent("Almeida", "Los Angeles", 109107, true);
        UCT u1 = new UCT("UCT-1", 5, 3);
        Sea s1 =  new Sea(1, 3);
        Air d1 = new Air(1, 0);
        d1.ligar();
        d1.movimentar();
        d1.identificarAlvo();
        d1.identificarAlvo("Logan");
        s1.ligar();
        s1.movimentar();



        System.out.println(u1.toString()); 
        u1.DesarmarBomba();

        a1.status();
        a1.operar();

        Operation op1 = new Operation("Presa Quebrada", 1, "Secreta");
        op1.statusOp();
        op1.finalizarOp();
        op1.statusOp();
        op1.iniciarOp();
        op1.statusOp();
        
    }
}
