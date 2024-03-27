import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");

        String nomeCliente = scanner.nextLine();

        System.out.print("Agora digite o número da sua agência: ");

        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu número de usuário: ");

        int numeroUsuario = Integer.parseInt(scanner.nextLine());

        System.out.print("Agora digite o seu saldo atual: ");

        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia +", Conta: " + numeroUsuario + " e seu saldo de " + saldo + " já está disponível para saque!" );
        }
    }
