import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void declararUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bem vindo ao DevBanck !");
        System.out.print("Por favor digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Por favor digite sua agência: ");
        String agenciaUsuario = sc.next();
        System.out.print("Por favor digite seu nome: ");
        String nomeUsuario = sc.next();
        System.out.print("Por favor insira seu saldo bancario: ");
        double saldoBancarioUsuario = sc.nextDouble();

        this.numero = numeroConta;
        this.agencia = agenciaUsuario;
        this.nomeCliente = nomeUsuario;
        this.saldo = saldoBancarioUsuario;

        exibirDadosBancarios();
    }

    public void exibirDadosBancarios() {
        System.out.println("Ola " + this.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + " conta " + this.numero + " e seu saldo de R$" + this.saldo + " Ja esta disponivel para saque");
    }
}
