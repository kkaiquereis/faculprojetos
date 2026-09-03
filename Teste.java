import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean senhaCorreta = false;

        while (!senhaCorreta) {
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();

            if (senha == 1414) {
                System.out.println("Senha correta.");
                senhaCorreta = true;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        // Pede um número, salva na variável e depois mostra o valor
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.nextLine();// limpa a linha do buffer
        System.out.print("seu nome é?: ");
        String nome = sc.nextLine();
        System.out.print("digite sua idade: ");
        int idade = sc.nextInt();

            if (idade < 18) {
                System.out.println("Você não tem idade suficiente para acessar o sistema.");
                sc.close();
                return;
            }
        
        System.out.println("Suas informaçoes sao: " + "seu nome é " + nome + " tem " + idade + " anos " + "seu numero é " +numero);
        sc.close();



        
    }
    }