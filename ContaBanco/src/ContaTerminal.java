
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public static void main(String[] args) throws Exception {

        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente !");
        conta.nomeCliente = scanner.nextLine();
   
        System.out.println("Por favor, digite o número da Conta !");        
        conta.numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = scanner.next();

        System.out.println("Por favor, digite o Saldo !");
        conta.saldo = scanner.nextDouble();     

        System.out.println("Olá ".concat(conta.nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + conta.agencia + ", conta " + conta.numeroConta + " e seu saldo " + conta.saldo + 
                            " já está disponível para saque");
    }
}
