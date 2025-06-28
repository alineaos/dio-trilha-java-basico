import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Para criar sua conta, primeiro digite o seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, sua conta foi criada com sucesso, agradecemos a preferência!", nome);
        System.out.printf("\nNúmero da conta: %d  Agência: %s  Saldo: R$%.2f", numero, agencia, saldo);
        System.out.print("\nSeu saldo já está disponível para saque.");




    }
}
