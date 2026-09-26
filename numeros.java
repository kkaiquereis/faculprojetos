import java.util.ArrayList;
import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ArrayList<String> tarefas = new ArrayList<>();
            ArrayList<String> status = new ArrayList<>();
            boolean continuar = true;

            while (continuar) { // <-- laço externo: volta pra cá sempre

                System.out.println("\nO que deseja fazer?");
                System.out.println("1 - Adicionar tarefa");
                System.out.println("2 - Listar tarefas");
                System.out.println("3 - Modificar tarefa");
                System.out.println("4 - Sair");
                System.out.println("5 - Marcar tarefa como concluída");
                System.out.print("Escolha: ");
                String opcao = ler.nextLine();

                switch (opcao) {
                    case "1":// adicionar tarefa
                        System.out.print("Digite uma tarefa: ");
                        String tarefa = ler.nextLine();
                        tarefas.add(tarefa);
                        status.add("Pendente");
                        System.out.println("Tarefa adicionada com sucesso!");
                        break;

                    case "2":
                        if (tarefas.isEmpty()) {// nao tem tarefas
                            System.out.println("Não há tarefas pendentes.");
                        } else {
                            for (int i = 0; i < tarefas.size(); i++) {
                                System.out.println("- " + tarefas.get(i) + " (" + status.get(i) + ")");
                            }
                        }
                        break;

                    case "3":
                        if (tarefas.isEmpty()) {// nao tem tarefas
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
                        break;

                    case "4":
                        continuar = false; // <-- isso faz o while parar
                        System.out.println("Encerrando o programa.");
                        break;

                    case "5": // marcar como concluída
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
        break;

                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }
}