import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean senhaCorreta = false;

        while (!senhaCorreta) {
            System.out.print("Digite a senha: ");
            int senha = ler.nextInt();

            if (senha == 1701) {
                System.out.println("Senha correta.");
                senhaCorreta = true;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        // Pede um número, salva na variável e depois mostra o valor
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        ler.nextLine(); // limpa a linha do buffer
        System.out.print("seu nome é?: ");
        String nome = ler.nextLine();
        System.out.print("digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); // limpa a linha do buffer deixada pelo nextInt()

        if (idade < 18) {
            System.out.println("Você não tem idade suficiente para acessar o sistema.");
            ler.close();
            return;
        }

        System.out.println("Suas informaçoes sao: " + "seu nome é " + nome + " tem " + idade + " anos " + "seu numero é " + numero);

        // informaçoes do usuario
        System.out.println("qual informação você deseja acessar? ");
        String informacao = ler.nextLine();
        if (informacao.equals("idade")) {
            System.out.println("Você acessou a informação: " + idade);
        } else if (informacao.equals("nome")) {
            System.out.println("Você acessou a informação: " + nome);
        } else if (informacao.equals("numero")) {
            System.out.println("Você acessou a informação: " + numero);
        } else {
            System.out.println("Informação inválida.");
        }

        ler.close();
    }
}