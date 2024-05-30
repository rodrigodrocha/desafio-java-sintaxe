//import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class VerificacaoDeConta {
    
   // ThreadLocalRandom geradorAleatorio;

   Random geradorAleatorio = new Random();

    public String verificarConta(int agencia, String conta, String nomeCliente){
       // int a = geradorAleatorio.current().nextInt(10, 90);

       double saldoDaConta = geradorAleatorio.nextDouble(20, 200);
       String saldo = String.format("%.2f", saldoDaConta); 
       //String saida = System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque", nomeCliente, agencia, conta, saldoDaConta);
       return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque";
    }
}
