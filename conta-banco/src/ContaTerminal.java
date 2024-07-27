import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
       Scanner scanner = new Scanner(System.in);
      
        System.out.println("Bem-vindo ao sistema de contas!");
        
        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt(); 

        System.out.print("Digite o saldo da sua conta: ");
        double saldoConta = scanner.nextDouble(); 

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, a sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo é R$"+ saldoConta +" e já está disponível para saque.");
        
        scanner.close();
    }
        //Exibir a mensagem conta criada
}
