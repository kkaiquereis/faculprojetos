
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ArrayList<String> tarefas = new ArrayList<>();
            ArrayList<Integer> quantidadeProdutos = new ArrayList<>();
            ArrayList<Double> precoProdutos = new ArrayList<>();
            boolean continuar = true;


            System.out.println("Ola, Seja bem-vindo.");

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
                System.out.println("1 - Adicionar produtos");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Modificar quantidade");
                System.out.println("4 - Modificar valor");
                System.out.println("5 - remover");
                System.out.println("6 - Sair");
                System.out.print("Escolha: ");

                String opcao = ler.nextLine();

                switch (opcao) {
                    case "1" -> {
                        System.out.print("Digite um produto: ");
                        String tarefa = ler.nextLine();
                        tarefas.add(tarefa);
                        System.out.println("Produto adicionada com sucesso!");
                        System.out.println("Digite a quantidade do produto");
                        int quantidadeProduto = ler.nextInt();
                        ler.nextLine();// limpa o buffer
                        System.out.println("Quantidade adicionada!");
                        System.out.println("Digite o valor do produto");
                        Double valorProduto = ler.nextDouble();
                        precoProdutos.add(valorProduto);
                        ler.nextLine();// limpa o buffer
                        System.out.println("valor add com sucesso!");

                        quantidadeProdutos.add(quantidadeProduto);
                    }
                    case "2" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há tarefas pendentes.");
                        } else {
                            for (int i = 0; i < tarefas.size(); i++) {
                                System.out.println("- " + tarefas.get(i) + "("+ quantidadeProdutos.get(i) + ")" + "(" + precoProdutos.get(i) + ")");
                            }
                        }
                    }
                    case "3" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há produtos para modificar.");
                        } else {
                            System.out.print("Índice (0 a " + (tarefas.size() - 1) + "): ");
                            int indice = ler.nextInt();
                            ler.nextLine();
                            if (indice >= 0 && indice < tarefas.size()) {
                                System.out.print("Nova quantidade: ");
                                quantidadeProdutos.set(indice, ler.nextInt());
                                System.out.println("Produto modificada!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    
                    } case "4" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há produtos para modificar.");
                        } else {
                            System.out.print("Índice (0 a " + (tarefas.size() - 1) + "): ");
                            int indice = ler.nextInt();
                            ler.nextLine();
                            if (indice >= 0 && indice < tarefas.size()) {
                                System.out.print("Novo valor: ");
                                precoProdutos.set (indice, ler.nextDouble());
                                ler.nextLine();
                                System.out.println("valor modificado!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    
                    }
                    case "5" -> {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há protutos cadastrados.");
                        } else {
                            System.out.print("Número do produto a remover: ");
                            int escolha = ler.nextInt();
                            ler.nextLine();

                            if (escolha >= 1 && escolha <= tarefas.size()) {
                                tarefas.remove(escolha - 1);
                                quantidadeProdutos.remove(escolha - 1);
                                System.out.println("Produto removido!");
                            } else {
                                System.out.println("Número inválido.");
                            }
                        }
                    }
                    case "6" -> {
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                    }

                    default -> System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

  
}

