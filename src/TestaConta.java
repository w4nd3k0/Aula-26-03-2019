
public class TestaConta {
    
    public static void main(String[] args) {
        
        Conta C1 = new Conta();
        
        C1.Saldo = 9999;
        C1.Titular = "Petrônio augusto";
        C1.Agencia = "4133-5";
        C1.Numero = "231-2";
        
        System.out.println("Saldo da Conta C1: "+ C1.Numero + " é de R$ " + C1.Saldo);
        
        Conta C2 = new Conta();
        
        C2.Saldo = 500;
        C2.Titular = "Samuel e Thais";
        C2.Agencia = "4133-5";
        C2.Numero = "914.231-2";
        
    }
    
}
