import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
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
            switch (informacao) {
                case "idade" -> System.out.println("Você acessou a informação: " + idade);
                case "nome" -> System.out.println("Você acessou a informação: " + nomeUsuario);
                default -> System.out.println("Informação inválida.");
            }
           

            ArrayList<String> nomes = new ArrayList<>();
            System.out.println("deseja adicionar um nome? (s/n)");
            String resposta = ler.nextLine();
            while (resposta.equalsIgnoreCase("s")) {
                System.out.print("digite um nome: ");
                String nome = ler.nextLine();
                nomes.add(nome);
                System.out.println("nome adicionado com sucesso!");
                System.out.println("deseja adicionar outro nome? (s/n)");
                resposta = ler.nextLine();
            } if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Você não deseja adicionar nomes.");
            }
        } 



                }
            }
        


