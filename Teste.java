import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean senhaCorreta = false;
        boolean usuarioAutenticado = false;

        while (!usuarioAutenticado) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = ler.next();


            if (usuario.equals("kkreis")) {
                System.out.println("Usuário autenticado.");
                usuarioAutenticado = true;
            } else {
                System.out.println("Credenciais incorretas. Tente novamente.");
            }
        }

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
        ler.nextLine();// limpa a linha do buffer deixada pelo nextInt()
        // Pede um nome, salva na variável e depois mostra o valor
        System.out.print("seu nome é?: ");
        String nomeUsuario = ler.nextLine();
        System.out.print("digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); // limpa a linha do buffer deixada pelo nextInt()

        if (idade < 18) {
            System.out.println("Você não tem idade suficiente para acessar o sistema.");
            ler.close();
            return;
        }

        System.out.println("Ola, " + nomeUsuario + " Seja bem-vindo.");

        // informaçoes do usuario
        System.out.println("qual informação você deseja acessar? ");
        String informacao = ler.nextLine();
        if (informacao.equals("idade")) {
            System.out.println("Você acessou a informação: " + idade);
        } else if (informacao.equals("nome")) {
            System.out.println("Você acessou a informação: " + nomeUsuario);

        } else {
            System.out.println("Informação inválida.");
        }

        
        System.out.println("qual tipo de operação: ");
        String operacao = ler.nextLine();

        if (operacao.equals("adicao")) {
            System.out.println("Digite o primeiro número: ");
            int num1 = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = ler.nextInt();
            int resultado = num1 + num2;
            System.out.println("O resultado da adição é: " + resultado);

        } else if (operacao.equals("subtracao")) { // if else é para varias condiçoes 
            System.out.println("Digite o primeiro número: ");
            int nums1 = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            int nums2 = ler.nextInt();
            int resultado = nums1 - nums2;
            System.out.println("O resultado da subtração é: " + resultado);

        } else if (operacao.equals("multiplicacao")) {
            System.out.println("Digite o primeiro número: ");
            int numm1 = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            int numm2 = ler.nextInt();
            int resultado = numm1 * numm2;
            System.out.println("O resultado da multiplicação é: " + resultado);

        } else if (operacao.equals("divisao")) {
            System.out.println("Digite o primeiro número: ");
            int numd1 = ler.nextInt();
            System.out.println("Digite o segundo número: ");
            int numd2 = ler.nextInt();
            if (numd2 == 0) {
                System.out.println("Não é possível dividir por zero.");
            } else {
                double resultado = (double) numd1 / numd2;
                System.out.println("O resultado da divisão é: " + resultado);
            }

        } else {
            System.out.println("Operação inválida.");

            ler.close();
        }
    }
}