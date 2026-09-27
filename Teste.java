import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ArrayList<String> tarefas = new ArrayList<>();
            ArrayList<String> status = new ArrayList<>();
            boolean continuar = true;

            autenticar(ler); // <-- login isolado em um método

            ler.nextLine(); // limpa a linha do buffer deixada pelo nextInt() da senha

            System.out.print("seu nome é?: ");
            String nomeUsuario = ler.nextLine();
            System.out.print("digite sua idade: ");
            int idade = ler.nextInt();
            ler.nextLine();

            if (idade < 18) {
                System.out.println("Você não tem idade suficiente para acessar o sistema.");
                return;
            }

            System.out.println("Ola, " + nomeUsuario + " Seja bem-vindo.");

            boolean informacoes = false;
            while (!informacoes) {
                System.out.println("Deseja acessar suas informações? (s/n)");
                String resposta = ler.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    break;
                } else if (resposta.equalsIgnoreCase("n")) {
                    System.out.println("Você não deseja acessar suas informações.");
                    break;
                } else {
                    System.out.println("Resposta inválida. Digite 's' para sim ou 'n' para não.");
                }
            }

            while (continuar) {
                System.out.println("\nO que deseja fazer?");
                System.out.println("1 - Adicionar tarefa");
                System.out.println("2 - Listar tarefas");
                System.out.println("3 - Modificar tarefa");
                System.out.println("4 - Sair");
                System.out.println("5 - Marcar tarefa como concluída");
                System.out.print("Escolha: ");
                String opcao = ler.nextLine();

                switch (opcao) {
                    case "1" -> {
                        System.out.print("Digite uma tarefa: ");
                        String tarefa = ler.nextLine();
                        tarefas.add(tarefa);
                        status.add("Pendente");
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    case "2" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há tarefas pendentes.");
                        } else {
                            for (int i = 0; i < tarefas.size(); i++) {
                                System.out.println("- " + tarefas.get(i) + " (" + status.get(i) + ")");
                            }
                        }
                    }
                    case "3" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há tarefas para modificar.");
                        } else {
                            System.out.print("Índice (0 a " + (tarefas.size() - 1) + "): ");
                            int indice = ler.nextInt();
                            ler.nextLine();
                            if (indice >= 0 && indice < tarefas.size()) {
                                System.out.print("Nova tarefa: ");
                                tarefas.set(indice, ler.nextLine());
                                System.out.println("Tarefa modificada!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    }
                    case "4" -> {
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                    }
                    case "5" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há tarefas cadastradas.");
                        } else {
                            System.out.print("Número da tarefa a concluir: ");
                            int escolha = ler.nextInt();
                            ler.nextLine();
                            if (escolha >= 1 && escolha <= tarefas.size()) {
                                status.set(escolha - 1, "concluída");
                                System.out.println("Tarefa concluída!");
                            } else {
                                System.out.println("Número inválido.");
                            }
                        }
                    }
                    default -> System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    // Método separado: cuida apenas da autenticação de usuário e senha
    public static void autenticar(Scanner ler) {
        boolean usuarioAutenticado = false;
        boolean senhaCorreta = false;

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
    }
}