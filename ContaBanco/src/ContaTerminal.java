import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Declaração de variáveis do algoritmo
        String numeroDaConta;
        int agencia;
        String nomeCliente;
        Scanner teclado = new Scanner(System.in);
        VerificacaoDeConta acessandoConta = new VerificacaoDeConta();

        //lógica do algoritmo
        System.out.println("Por favor, digite o número da Agência !");
        agencia = teclado.nextInt();
        System.out.println("Por favor, digite o número da Conta !");
        numeroDaConta = teclado.next();
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = teclado.next();


        String dadosDaConta = acessandoConta.verificarConta(agencia, numeroDaConta, nomeCliente);
        System.out.println(dadosDaConta);
        
    }

}
